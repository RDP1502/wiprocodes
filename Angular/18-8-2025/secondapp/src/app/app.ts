import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { Switchdemo } from "./switchdemo/switchdemo";
import { Searchfilter } from "./searchfilter/searchfilter";

@Component({
  selector: 'app-root',
  imports: [FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('secondapp');
  name:String = "Rohan"

  greet(){
    console.log(`${this.name} bro welcome ..`)
  }

}
