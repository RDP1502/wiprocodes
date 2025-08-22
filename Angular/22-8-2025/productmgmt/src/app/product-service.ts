import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, ObservedValuesFromArray } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient){ }

  private url = "http://localhost:9000/products";
    getProducts():Observable<Product[]>{
      
      return this.http.get<Product[]>(this.url);
    }

    addProduct(product:Product):Observable<Product>{
      return this.http.post<Product>(this.url, product);
    } 

    findProductById(id:string):Observable<Product>{
      return this.http.get<Product>(`${this.url}/${id}`);
    }

    saveProduct(product:Product):Observable<Product>{
      return this.http.put<Product>(this.url, product);
    }

    deleteProduct(id:string):Observable<void>{
      return this.http.delete<void>(`${this.url}/${id}`);
    }


  
}
