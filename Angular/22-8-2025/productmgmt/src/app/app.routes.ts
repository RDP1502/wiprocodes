import { Routes } from '@angular/router';
import { ProductList } from './product-list/product-list';
import { AddProduct } from './add-product/add-product';
import { EditProduct } from './edit-product/edit-product';
import { DeleteProduct } from './delete-product/delete-product';

export const routes: Routes = [
     {path:'', component:ProductList},
    {path:'productList', component:ProductList},
    {path:'addProduct', component:AddProduct},
    {path:'editProduct/:id', component:EditProduct},
    {path:'deleteProduct/:id', component:DeleteProduct}
];
