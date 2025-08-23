import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../Interface/user';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor(private http:HttpClient, 
  ){}

  getFoods():Observable<User[]>{
    return this.http.get<User[]>('http://localhost:9012/foods')
  }


  
}
