import { Component } from '@angular/core';
import { Listcom } from "../listcom/listcom";
import { Switchdemo } from "../switchdemo/switchdemo";

@Component({
  selector: 'app-conditioncom',
  imports: [],
  templateUrl: './conditioncom.html',
  styleUrl: './conditioncom.css'
})
export class Conditioncom {

  flag:boolean = true 
  onClick(){
    this.flag = !this.flag
  }

  countryNames:String[]= ["India","Dubai","Germany","America"]


  

}
