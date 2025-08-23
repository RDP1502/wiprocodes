import { Component } from '@angular/core';
import { ProductService } from '../product-service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  imports: [FormsModule],
  templateUrl: './add-product.html',
  styleUrl: './add-product.css'
})
export class AddProduct {


  constructor(private productService: ProductService, private router: Router){}

  name:string='';
  price:number=0;
  category:string='';
  quantity:number =0;

  submit(){
    this.productService.addProduct({name:this.name, price:this.price, category:this.category, quantity:this.quantity}).subscribe((response)=>{
      this.name= '',
      this.price = 0,
      this.category =''
      this.router.navigate(['/productList'])
    }, error=>{
      console.log("Error adding new product", error)
    })
  }
}
