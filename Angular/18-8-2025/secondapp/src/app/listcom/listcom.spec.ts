import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Listcom } from './listcom';

describe('Listcom', () => {
  let component: Listcom;
  let fixture: ComponentFixture<Listcom>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Listcom]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Listcom);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
