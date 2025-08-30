import { ChangeDetectorRef, Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../../Service/user-service';
import { IUser } from '../../Interface/iuser';
import { USER_ICON } from '../../Utils/appConstant';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  templateUrl: './home.html',
  styleUrl: './home.css',
  imports: [FormsModule],
})
export class Home {


  constructor(
    private router: Router,
    private userService: UserService,
    private cdr: ChangeDetectorRef
  ) {}

  role: string = '';
  userId: number = 0;

  loggedUser: IUser = {
    firstName: '',
    lastName: '',
    emailId: '',
    passWord: '',
    address: ''
  };

  userIcon = USER_ICON;

  ngOnInit() {

    this.allUsers()
    // Parse token and set role/userId
    const token = localStorage.getItem('tokenValue')?.replace('Bearer ', '');
    if (token) {
      try {
        const payload = JSON.parse(atob(token.split('.')[1]));
        this.role = payload.authorities?.[0] ?? '';
        this.userId = Number(payload.sub) || 0;
        localStorage.setItem('userId', String(this.userId))
        localStorage.setItem('role', this.role);
        this.cdr.detectChanges()
      } catch (e) {
        console.error('Invalid token payload', e);
      }
    }

    if (!this.userId) {
      this.cdr.detectChanges();
      return; // nothing to load
    }

    // Fetch user, then trigger CD (zoneless mode needs manual CD after async)
    this.userService.getUserById(this.userId).subscribe({
      next: (data) => {
        this.loggedUser = data;
        this.cdr.detectChanges();
      },
      error: (err) => {
        console.error('Failed to load user', err);
        this.cdr.detectChanges();
      }
    });
  }

  update = false
  updateProfile(){
  
   this.update= !this.update;
  }

   updatedUser = this.loggedUser
  updateUser() {
    this.userService.updateUser(this.updatedUser,this.userId).subscribe(()=>{
      console.log("updated")
    }
    )
    console.log("updated")
} 

 logout(userId:number){
    this.userService.logout(userId).subscribe((res)=>{
      console.log("You are logged out")
      localStorage.removeItem('tokenValue')
      localStorage.removeItem('userId')
      localStorage.removeItem('role')
      this.router.navigate(['/login'])
    },(error)=>{
      console.log("errror while logout", error)
    })
    console.log("user id is  ", userId)
  }

  shopNow(){
    this.router.navigate(['/products'])
  }

  addProduct(){
    this.router.navigate(['/add-product'])
  }

  users:IUser[]=[]
  manageUser = false
  manage(){
    this.manageUser = !this.manageUser
  }
  allUsers(){
     console.log("call made")
    this.userService.getAllUsers().subscribe((users)=>{
      this.users = users
     
      console.log("users are ",users)
      
    })
  }

}