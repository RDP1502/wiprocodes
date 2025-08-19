import { Component } from '@angular/core';
import { NgClass , NgStyle } from '@angular/common';
@Component({
  selector: 'app-ngclsdemo',
  imports: [ NgStyle],
  templateUrl: './ngclsdemo.html',
  styleUrl: './ngclsdemo.css'
})
export class Ngclsdemo {

  flag:boolean=true
  flag1:boolean=false

  
  getngClass(){
    return {
      'app':this.flag, 
      'app2':this.flag1
    }
  }
}
