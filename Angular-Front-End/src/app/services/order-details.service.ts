import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderDetailsService {
  // Need order Id and Customer Id

  private baseUrl = 'http://localhost:8080/api/order-details'
  constructor(private http: HttpClient) { }

  getOrderDetails(orderNumber: number, customerNumber: number): Observable<any> {
    let params = {
      orderNumber: orderNumber,
      customerNumber: customerNumber
    }
    return this.http.get(`${this.baseUrl}`, { params });
  }
}

