import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Secondcom } from './secondcom';

describe('Secondcom', () => {
  let component: Secondcom;
  let fixture: ComponentFixture<Secondcom>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Secondcom]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Secondcom);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
