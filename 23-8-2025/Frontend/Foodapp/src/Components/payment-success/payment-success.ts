import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-payment-success',
  imports: [],
  templateUrl: './payment-success.html',
  styleUrl: './payment-success.css'
})
export class PaymentSuccess {

  constructor(private router: Router){}

  backFoodList(){
    this.router.navigate(['/food'])
  }
}
