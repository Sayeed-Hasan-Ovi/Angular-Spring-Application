import { Routes } from '@angular/router';
import { CustomerComponent } from './components/customer/customer.component';
import { ProductComponent } from './components/product/product.component';
import { SeeRecentOrdersComponent } from './components/see-recent-orders/see-recent-orders.component';
import { SeeRecentShipmentsComponent } from './components/see-recent-shipments/see-recent-shipments.component';
import { OrderDetailsComponent } from './components/order-details/order-details.component';

export const routes: Routes = [
    {
        path: 'customer',
        component: CustomerComponent
    },
    {
        path: 'product',
        component: ProductComponent
    },
    {
        path: '', 
        redirectTo: '/app', 
        pathMatch: 'full' 
    },
    {
        path: 'recentlyPlaced',
        component: SeeRecentOrdersComponent
    },
    {
        path: 'recentlyDelivered',
        component: SeeRecentShipmentsComponent
    },
    {
        path: 'getOrderDetails/:orderNumber/:customerNumber',
        component: OrderDetailsComponent
    }
];
