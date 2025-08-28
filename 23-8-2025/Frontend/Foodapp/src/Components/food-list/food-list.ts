import { ChangeDetectorRef, Component } from '@angular/core';
import { Router } from '@angular/router';
import { FoodService } from '../../Services/food-service';
import { Food } from '../../Interface/food';


@Component({
  selector: 'app-food-list',
  imports: [],
  templateUrl: './food-list.html',
  styleUrl: './food-list.css'
})
export class FoodList {

  foods:Food[] = []

  constructor(private router: Router,
    private foodService: FoodService,
    private cdr: ChangeDetectorRef
  ){}

  ngOnInit(){
    this.foodService.getFoods().subscribe((data)=>{
      let tokendata:any=localStorage.getItem("token");
      // console.log(data)
      this.foods = data;
      this.cdr.detectChanges()
    }, (error)=>{
      alert("Error while fetching food data")
      console.log(error)
    })
  }

  logout(){
    localStorage.removeItem('token')
    this.router.navigate(['/login'])
    
  }

  toCart(){
    this.router.navigate(['/orders'])
  }

  orderNow(){
    this.router.navigate(['/orders'])
  }

}
