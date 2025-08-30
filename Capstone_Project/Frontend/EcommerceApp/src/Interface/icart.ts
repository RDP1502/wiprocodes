import { ICartItem } from "./icart-item"

export interface ICart {
    userId:number
    totalQty:number
    totalPrice:number
    cartItems:ICartItem[]
}
