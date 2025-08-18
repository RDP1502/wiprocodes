import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Bookcom } from './bookcom';

describe('Bookcom', () => {
  let component: Bookcom;
  let fixture: ComponentFixture<Bookcom>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Bookcom]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Bookcom);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
