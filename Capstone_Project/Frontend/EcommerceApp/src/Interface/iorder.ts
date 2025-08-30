import { IOrderItem } from "./iorder-item"

export interface IOrder {
    orderId?:number
    userId?:number
    totalAmount:number
    orderStatus?:string
    orderDate?:Date
    items:IOrderItem[]
}
