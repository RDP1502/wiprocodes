import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICart } from '../Interface/icart';
import { BASE_URL } from '../Utils/appConstant';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http:HttpClient){}

  private token=localStorage.getItem("tokenValue");
      // console.log("jwt token="+token)
  private header:HttpHeaders  = new HttpHeaders()
  
  private headers = new HttpHeaders()
        .set('Content-Type', 'application/json')
        .set('Authorization', `${this.token}`)
  
  getCartItems():Observable<ICart[]>{
    return this.http.get<ICart[]>(BASE_URL+"/cart", {headers:this.headers})
  }

  saveCart(cart:ICart):Observable<any>{
    return this.http.post(BASE_URL+"/cart", cart,{headers:this.headers})
  }

  updateCart(cartId:number,cart:ICart):Observable<any>{
    return this.http.put(BASE_URL+"/cart/"+cartId,cart,{headers:this.headers})
  }

  getCartByUserId(userId:number):Observable<ICart[]>{
    return this.http.get<ICart[]>(BASE_URL+"/cart/"+userId,{headers:this.headers})
  }

}
