import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http:HttpClient){}

  private baseUrl = "http://localhost:9000/orders"

  placeOrder(productId:string, quantity:number):Observable<Order>{
    // Backend expects a raw integer in the request body
    return this.http.patch<Order>(`${this.baseUrl}/${productId}`, quantity)
  }

  getOrders():Observable<Order[]>{
    return this.http.get<Order[]>(`${this.baseUrl}`)
  }
  
}
