import { Component } from '@angular/core';
import { ProductService } from '../product-service';
import { Router, RouterLink } from '@angular/router';
import { Product } from '../product';
import { CurrencyPipe } from '@angular/common';


@Component({
  selector: 'app-product-list',
  imports: [CurrencyPipe, RouterLink],
  templateUrl: './product-list.html',
  styleUrl: './product-list.css'
})
export class ProductList {


  constructor(private productService: ProductService, private router: Router){}

  products:Product[]=[]

  ngOnInit(){
    this.productService.getProducts().subscribe((data:Product[])=>{
      this.products = data;
    },(error)=>{
      console.log("Error in fetching the product list", error)
    })
  }

  addProduct(){
    this.router.navigate(['/addProduct'])
  }

  BuyNow() {
    this.router.navigate(['/purchase'])
}

 
}
