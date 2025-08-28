import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../Interface/user';
import { Observable } from 'rxjs';
import { JwtToken } from '../Interface/jwt-token';
import { BASE_URL } from '../Utils/appConstant';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient){}


  login(user:User):Observable<JwtToken>{
    console.log('in the user service')
    return this.http.post<JwtToken>(`${BASE_URL}/user/login`, user)
  }

  getUser():Observable<User[]>{
    return this.http.get<User[]>(BASE_URL+'/user')
  }

  createUser(user:User):Observable<void>{
    return this.http.post<void>(`${BASE_URL}/user/login/register`, user)
  }
  
}
