import { Component, OnInit} from '@angular/core';
import { CommonModule } from '@angular/common';
import { OrderService } from '../../services/orders.service';
import { RouterModule } from '@angular/router';
import { OrderDetailsService } from '../../services/order-details.service';

@Component({
  selector: 'app-see-recent-orders',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule],
  templateUrl: './see-recent-orders.component.html',
  styleUrl: './see-recent-orders.component.css'
})
export class SeeRecentOrdersComponent implements OnInit {
  orders: any[] = [];

  constructor(private orderService: OrderService, private orderDetailsService: OrderDetailsService) { }

  ngOnInit(): void {
    this.orderService.getOrders().subscribe(data => {
      this.orders = data;
    });
  }

  viewOrderDetails(orderNumber: number, customerNumber: number) {
    this.orderDetailsService.getOrderDetails(orderNumber, customerNumber).subscribe(data => {
      console.log(data);
    });
  }
}
