import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeeRecentOrdersComponent } from './see-recent-orders.component';

describe('SeeRecentOrdersComponent', () => {
  let component: SeeRecentOrdersComponent;
  let fixture: ComponentFixture<SeeRecentOrdersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SeeRecentOrdersComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SeeRecentOrdersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
