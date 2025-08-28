import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Food } from '../Interface/food';
import { BASE_URL } from '../Utils/appConstant';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor(private http:HttpClient, 
  ){}


  getFoods():Observable<Food[]>{
    return this.http.get<Food[]>(BASE_URL+'/foods')
  }

  addFoods(foods:Food):Observable<Food>{
    return this.http.post<Food>(BASE_URL+'/foods', foods)
  }

  deleteFood(id:number){
    return this.http.delete(`${BASE_URL}/foods/${id}`)
  }

}
