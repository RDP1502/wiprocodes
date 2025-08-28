import { Routes } from '@angular/router';
import { Login } from '../login/login';
import { FoodList } from '../food-list/food-list';
import { UserRegister } from '../user-register/user-register';
import { OrderPage } from '../order-page/order-page';
import { Payment } from '../payment/payment';
import { PaymentSuccess } from '../payment-success/payment-success';

export const routes: Routes = [
    {path: '' , component : Login},
    {path: 'login', component: Login},
    {path:'food', component:FoodList},
    {path: 'login/register', component: UserRegister},
    {path:'orders', component:OrderPage},
    {path:'payment/:orderId/:orderPrice', component: Payment},
     {path: 'success', component: PaymentSuccess}
];
