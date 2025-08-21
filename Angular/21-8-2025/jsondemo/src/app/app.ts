import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { VehicalCom } from "./vehical-com/vehical-com";

@Component({
  selector: 'app-root',
  imports: [ VehicalCom],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('jsondemo');
}
