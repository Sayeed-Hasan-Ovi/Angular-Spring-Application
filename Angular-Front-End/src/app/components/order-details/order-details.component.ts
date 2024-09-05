import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OrderDetailsService } from '../../services/order-details.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-order-details',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './order-details.component.html',
  styleUrl: './order-details.component.css'
})
export class OrderDetailsComponent implements OnInit {
  orderDetails: any [] = [];
  orderNumber : string | null | undefined;
  customerNumber : string | null | undefined;
  total: number = 0;


  constructor(
    private orderService: OrderDetailsService,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.customerNumber = this.route.snapshot.paramMap.get('customerNumber');
    this.orderNumber = this.route.snapshot.paramMap.get('orderNumber');

    this.orderService.getOrderDetails(+this.orderNumber!, +this.customerNumber!)
      .subscribe({
        next: (data) => {
          this.orderDetails = data;
          this.calculateTotal();
        },
        error: (error) => {
        }
      });
  }
  calculateTotal(): void {
    this.total = this.orderDetails.reduce((acc, orderDetail) => acc + (orderDetail.quantityOrdered * orderDetail.priceEach), 0);
  }
}
