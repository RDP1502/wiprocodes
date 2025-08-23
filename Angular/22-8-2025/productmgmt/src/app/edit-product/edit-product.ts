import { Component } from '@angular/core';
import { ProductService } from '../product-service';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../product';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-edit-product',
  imports: [FormsModule],
  templateUrl: './edit-product.html',
  styleUrl: './edit-product.css'
})
export class EditProduct {

  constructor(private productService: ProductService
    , private router: Router
    , private activatedRoute: ActivatedRoute
  ){}

  id:string|null='';
  product:Product={
    name:'',
    category:'',
    price:0,
    quantity:0
  }


  ngOnInit(){
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    if(this.id){
      this.productService.findProductById(this.id).subscribe(product=>{
        this.product = product;
      })
    }
  }

  save(){
    this.productService.saveProduct(this.product).subscribe({
      next:(product)=>{
        this.router.navigate(['/productList'])
      },
      error:(error)=>{
        console.log(error);
      }
    })
  }

}
