import { ChangeDetectorRef, Component } from '@angular/core';
import { ProductService } from '../../Service/product-service';
import { Router } from '@angular/router';
import { IProduct } from '../../Interface/iproduct';
import { CurrencyPipe } from '@angular/common';
import { UserService } from '../../Service/user-service';

@Component({
  selector: 'app-product-catalogue',
  imports: [CurrencyPipe],
  templateUrl: './product-catalogue.html',
  styleUrl: './product-catalogue.css'
})
export class ProductCatalogue {

  userRole = localStorage.getItem('role')

  constructor(private productService: ProductService,
    private router: Router,
    private cdr: ChangeDetectorRef,
    private userService:UserService
  ) {}


  products:IProduct[]=[]

  userId:number = Number(localStorage.getItem('userId'))

  ngOnInit(){
    
    this.productService.getProducts().subscribe((data)=>{
      this.products = data;
      console.log(this.products)
      this.cdr.detectChanges()
    })

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

  getCartCount(){
    
  }
  addToCart(product:IProduct){


  }

}
