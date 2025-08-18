import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-searchfilter',
  imports: [FormsModule],
  templateUrl: './searchfilter.html',
  styleUrl: './searchfilter.css'
})
export class Searchfilter {

  searchText:string = ''

  nameList:String[] =["rohan", "vinay", "nikhil", "harsh", "shreyash","atharv","mayur","harshal","ritesh"] 

  get filteredList():String[] { 
  const searchfilter = this.searchText.toLowerCase();
  return this.nameList.filter(name=> name.toLowerCase().startsWith(this.searchText.toLowerCase()))
  }
}
