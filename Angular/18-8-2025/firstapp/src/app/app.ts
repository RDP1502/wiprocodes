import { Component, signal } from '@angular/core';
// import { RouterOutlet } from '@angular/router';
import { Secondcom } from './secondcom/secondcom';

@Component({
  selector: 'app-root',
  imports: [ Secondcom],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('firstapp');
}
