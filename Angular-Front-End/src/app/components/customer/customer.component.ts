import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customers.service';
import { CommonModule } from '@angular/common';


@Component({
  standalone: true,
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css'],
  imports: [CommonModule]
})

export class CustomerComponent implements OnInit {
  customers: any[] = [];

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    // console.log('CustomerComponent initialized');
    this.customerService.getCustomers().subscribe(data => {
      this.customers = data;
    });
    // console.log('Customers:', this.customers);
  }
}