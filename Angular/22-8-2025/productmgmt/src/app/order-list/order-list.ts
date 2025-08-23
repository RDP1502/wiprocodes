import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { OrderService } from '../order-service';
import { Order } from '../order';
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-order-list',
  imports: [DatePipe],
  templateUrl: './order-list.html',
  styleUrl: './order-list.css'
})
export class OrderList {


  constructor(private http: HttpClient, 
    private orderService: OrderService,
    private route: Router
  
  ){}

  orders:Order[]=[];

  ngOnInit(){
    this.orderService.getOrders().subscribe((data)=>{
      this.orders = data

    })
  }

  toProductList() {
    this.route.navigate(['/productList'])
}

}
