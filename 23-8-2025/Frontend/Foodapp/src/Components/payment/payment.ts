import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IPayment } from '../../Interface/ipayment';
import { PaymentService } from '../../Services/payment-service';
import { CurrencyPipe } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-payment',
  imports: [CurrencyPipe, FormsModule],
  templateUrl: './payment.html',
  styleUrl: './payment.css'
})
export class Payment {

  constructor(private router : Router,
    private activatedRoute: ActivatedRoute,
    private paymentService: PaymentService

  ){}

  totalprice:number=0
  orderId:any=''
  modeOfPayment:string=''
  accountNumber:string=''
  cvv:number=0

  ngOnInit(){
    this.orderId = this.activatedRoute.snapshot.paramMap.get('orderId')
    let orderPrice = this.activatedRoute.snapshot.paramMap.get('orderPrice')
    this.totalprice = Number(orderPrice)
    console.log("this is order id-"+ this.orderId)
    console.log("this is order price ="+ orderPrice)
    console.log("this is total price-"+ this.totalprice)
  }

  pay(){
    let payment:IPayment={
      orderId:this.orderId,
      totalOrderPrice:this.totalprice,
      modeOfPayment:this.modeOfPayment,
      accountNumber:this.accountNumber,
      cvv:this.cvv

    };
    this.paymentService.savePayment(payment).subscribe((data:IPayment)=>{

      console.log(data);

        
    })
  }

}
