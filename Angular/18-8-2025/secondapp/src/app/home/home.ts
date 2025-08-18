import { Component } from '@angular/core';
import  { Bookcom } from '../bookcom/bookcom';


@Component({
  selector: 'app-home',
  imports: [Bookcom],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  
  num:number[] = Array.from({length:21}, (_,i)=> i+1)

}
