import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../../Services/user-service';
import { User } from '../../Interface/user';

@Component({
  selector: 'app-login',
  imports: [],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {

  constructor(private router:Router,
    private userService: UserService
  ){}

  user:User = {
    userEmail:'',
    passWord:'',
    userName:''
  }

  login(){
    this.userService.login(this.user).subscribe((user)=>{
      this.user = user;
    }, (error)=>{
      console.log("error while sign in ", error)
    }
  )
  this.router.navigate(['/food'])
  }

}
