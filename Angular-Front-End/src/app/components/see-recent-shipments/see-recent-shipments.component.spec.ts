import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeeRecentShipmentsComponent } from './see-recent-shipments.component';

describe('SeeRecentShipmentsComponent', () => {
  let component: SeeRecentShipmentsComponent;
  let fixture: ComponentFixture<SeeRecentShipmentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SeeRecentShipmentsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SeeRecentShipmentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
