import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product-service';
import { Router } from '@angular/router';
import { Product } from '../product';
import { FormsModule } from '@angular/forms';
import { NgFor, NgIf, CurrencyPipe } from '@angular/common';
import { OrderService } from '../order-service';

@Component({
  selector: 'app-purchase',
  imports: [FormsModule, NgFor, NgIf, CurrencyPipe],
  templateUrl: './purchase.html',
  styleUrl: './purchase.css'
})
export class Purchase implements OnInit {
  constructor(private productService: ProductService, 
    private router: Router,
    private orderService: OrderService
  ) {}

  products: Product[] = [];
  selectedProductId: string = '';
  selectedProduct: Product | null = null;
  purchaseQty: number = 1;
  errorMessage: string = '';

  // Convenience getter for available quantity
  get selectedAvailable(): number {
    return this.selectedProduct?.quantity ?? 0;
  }

  ngOnInit(): void {
    this.productService.getProducts().subscribe({
      next: (data) => (this.products = data),
      error: () => (this.errorMessage = 'Failed to load products')
    });
  }

  onSelectChange(): void {
    this.errorMessage = '';
    this.purchaseQty = 1;
    if (!this.selectedProductId) {
      this.selectedProduct = null;
      return;
    }
    this.productService.findProductById(this.selectedProductId).subscribe({
      next: (p) => (this.selectedProduct = p),
      error: () => {
        this.selectedProduct = null;
        this.errorMessage = 'Failed to load selected product details';
      }
    });
  }

  get isQtyInvalid(): boolean {
    if (!this.selectedProduct) return true;
    return this.purchaseQty <= 0 || this.purchaseQty > this.selectedAvailable;
  }

  onPurchase(): void {
    this.errorMessage = '';

    if (!this.selectedProductId || !this.selectedProduct) {
      this.errorMessage = 'Please select a product.';
      return;
    }
    if (this.purchaseQty <= 0) {
      this.errorMessage = 'Quantity must be at least 1.';
      return;
    }
    if (this.purchaseQty > this.selectedAvailable) {
      this.errorMessage = `Quantity cannot exceed available stock (${this.selectedAvailable}).`;
      return;
    }

    this.orderService
      .placeOrder(this.selectedProductId, this.purchaseQty)
      .subscribe({
        next: () => this.router.navigate(['/orders']), // or navigate to /orders if preferred
        error: () => (this.errorMessage = 'Error placing the order. Please try again.')
      });
  }
}
