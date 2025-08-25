import { Component } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-reactive1',
  imports: [ReactiveFormsModule],
  templateUrl: './reactive1.html',
  styleUrl: './reactive1.css'
})
export class Reactive1 {
  fName = new FormControl('Amit');
 
  constructor() {
    this.fName.valueChanges.subscribe((value) => {
      if (value) {
        const reversed = value.split('').reverse().join('');
        console.log('Reversed value = ' + reversed);
        this.fName.setValue(reversed);
      } else {
        console.log('value is empty');
      }
    });
  }

}
