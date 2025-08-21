import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { UpperCasePipe } from '@angular/common';
import { DatePipe } from '@angular/common';
import { FahrenheitPipe } from './fahrenheit-pipe';
import { Highdir } from './highdir';



@Component({
  selector: 'app-root',
  imports: [FormsModule, UpperCasePipe, DatePipe,FahrenheitPipe, Highdir],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipedemo');

  userInput:string=''
  dateValue:any
  centigrade:number=0
  message:string=''

}
