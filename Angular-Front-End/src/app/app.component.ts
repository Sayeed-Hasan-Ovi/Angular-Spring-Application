import { Component} from '@angular/core';
import { RouterLink, RouterOutlet, Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Angular-Front-End';
  shownav = true;

  constructor(private router: Router) {
    this.router.events.subscribe((val) => {
      if (this.router.url === 'customer') {
        this.shownav = false;
      }
    });
  }
}
