import { Component, EventEmitter, Input, Output, output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Fruits } from '../fruits';

@Component({
  selector: 'app-display-list',
  imports: [FormsModule],
  templateUrl: './display-list.html',
  styleUrl: './display-list.css'
})
export class DisplayList {

  @Input() fruits: Fruits[] = [
    {
      name: "",
      image: "",
      description: ""
    }
  ]

  @Output() btnClick = new EventEmitter<String>()
 
  onClick(name:String){
    console.log("in display-list")
    this.btnClick.emit(name)
  }
}
