import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../product-service';

@Component({
  selector: 'app-delete-product',
  imports: [],
  templateUrl: './delete-product.html',
  styleUrl: './delete-product.css'
})
export class DeleteProduct {
  constructor(private router: Router,
    private productService: ProductService,
    private activatedRoute: ActivatedRoute
  ){}

  id:string| null= '';

  ngOnInit(){
    this.id = this.activatedRoute.snapshot.paramMap.get('id')
    this.productService.deleteProduct(this.id!).subscribe(()=>{
      this.router.navigate(['/productList'])

    }, error =>{
      console.log("Error deleting product", error)
    })
  }
}
