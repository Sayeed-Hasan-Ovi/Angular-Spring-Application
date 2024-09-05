import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DeliveriesService {
  private shipmentUrl = 'http://localhost:8080/api/orders/recentlyDelivered';

  constructor(private http: HttpClient) { }

  getShipments(): Observable<any[]> {
    return this.http.get<any[]>(this.shipmentUrl);
  }
}
