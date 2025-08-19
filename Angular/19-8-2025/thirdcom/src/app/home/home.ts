import { Component, Output } from '@angular/core';
import { DisplayList } from "../display-list/display-list";
import { Ngclsdemo } from "../ngclsdemo/ngclsdemo";
import { Fruits } from '../fruits';

@Component({
  selector: 'app-home',
  imports: [ DisplayList],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  remove(fName:String){
    console.log("in remove of home")
    this.fruits = this.fruits.filter(item => item.name !== fName)

  }


  num:number[]=[0,1,2,3]

  fruits:Fruits[]= [
        { name: "Apple", image:"https://png.pngtree.com/png-vector/20231017/ourmid/pngtree-fresh-apple-fruit-red-png-image_10203073.png", description: "This is apple" },
        { name: "Banana", image:"https://media.istockphoto.com/id/619046500/photo/bananas.jpg?s=612x612&w=0&k=20&c=p5-v1iKwhOhw5cFjfx83qgaZcOBSVpUuicZi4VIGF2Y=", description: "This is banana" },
        { name: "Orange", image: "https://media.istockphoto.com/id/477836156/photo/orange-fruit-isolated-on-white.jpg?s=612x612&w=0&k=20&c=NQYciPqF0kRqnDMx7Vy96Qhtx2c37OiKPXtjMR3Oy-Y=",  description: "This is orange" },
        { name: "Grapes", image: "https://m.media-amazon.com/images/I/51qW4jcUVJL._UF1000,1000_QL80_.jpg",  description: "This is grapes" }
    ];
}
