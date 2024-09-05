import { Component, OnInit} from '@angular/core';
import { CommonModule } from '@angular/common';
import { DeliveriesService } from '../../services/deliveries.service';
import { RouterModule } from '@angular/router';
import { OrderDetailsService } from '../../services/order-details.service';


@Component({
  selector: 'app-see-recent-shipments',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule],
  templateUrl: './see-recent-shipments.component.html',
  styleUrl: './see-recent-shipments.component.css'
})

export class SeeRecentShipmentsComponent implements OnInit {
  shipments: any[] = [];


  constructor(private orderService: DeliveriesService,
              private orderDetailsService: OrderDetailsService
  ) { }

  ngOnInit(): void {
    this.orderService.getShipments().subscribe(data => {
      this.shipments = data;
    });
  }

  viewOrderDetails(orderNumber: number, customerNumber: number) {
    this.orderDetailsService.getOrderDetails(orderNumber, customerNumber).subscribe(data => {
      console.log(data);
    });
  }
}
