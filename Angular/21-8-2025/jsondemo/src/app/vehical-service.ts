import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Vehical } from './vehical';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VehicalService {
 

  constructor(private http:HttpClient){

  }

  getVehicals():Observable<Vehical[]>{
    return this.http.get<Vehical[]>('http://localhost:3000/vehical/');
  }

   getVehicalsById(vehicalId:string):Observable<Vehical>{
    return this.http.get<Vehical>('http://localhost:3000/vehical/' + vehicalId);
  }

  updateVehical(vehical:Vehical):Observable<Vehical>{
    return this.http.put<Vehical>(`http://localhost:3000/vehical/${vehical.id}`, vehical);
  }

  deleteVehical(id:string):Observable<void>{
    return this.http.delete<void>(`http://localhost:3000/vehical/${id}`);
  }
  
  saveVehical(vehical:Vehical):Observable<Vehical>{
    let tempVehical:Partial<Vehical> ={
      make:vehical.make,
      model:vehical.model,
      fuleType:vehical.fuleType,
      price:vehical.price

    }
    return this.http.post<Vehical>('http://localhost:3000/vehical',tempVehical);
  }
}
