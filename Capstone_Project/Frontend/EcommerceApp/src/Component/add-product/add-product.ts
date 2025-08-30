import { ChangeDetectorRef, Component } from '@angular/core';
import { ProductService } from '../../Service/product-service';
import { Router, RouterLink } from '@angular/router';
import { IProduct } from '../../Interface/iproduct';
import { FormsModule } from '@angular/forms';
import { DatePipe } from '@angular/common';



@Component({
  selector: 'app-add-product',
  imports: [FormsModule, DatePipe, RouterLink],
  templateUrl: './add-product.html',
  styleUrl: './add-product.css'
})
export class AddProduct {

  
  constructor(private productService: ProductService,
    private router: Router,
    private cdr: ChangeDetectorRef
  ){}
  products:IProduct[]=[]
  jwtToken = localStorage.getItem("tokenValue")

private isTokenExpired(token: string) {
  if (!token) return true;
  const payload = JSON.parse(atob(token.split('.')[1]));
  return Date.now() > payload.exp * 1000;
}
 

  ngOnInit(){

    if(this.isTokenExpired(this.jwtToken!)){
        this.router.navigate(['/login'])
    }
  }
  private formatDate(date: Date): string {
    const year = date.getFullYear();
    const month = ('0' + (date.getMonth() + 1)).slice(-2);
    const day = ('0' + date.getDate()).slice(-2);
    return `${year}-${month}-${day}`;
  }

    productName:string=''
    productDesc:string=''
    productCat:string=''
    make:string=''
    availableQty:number=0
    price:number=0
    uom:string='' 
    prodRating:number=0
    imgUrl:string=''

  product:IProduct={
    productName:'',
    productDesc:'',
    productCat:'',
    make:'',
    availableQty:0,
    price:0,
    uom:'' ,
    prodRating:0,
    imgUrl:'',
    dateOfManufacture: new Date()
  }

  addProduct(){
    this.productService.addNewProduct(this.product).subscribe({
      next:(response)=>{
        console.log(response)
      }
    })
    
  }

}
