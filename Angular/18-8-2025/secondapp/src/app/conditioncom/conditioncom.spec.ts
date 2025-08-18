import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Conditioncom } from './conditioncom';

describe('Conditioncom', () => {
  let component: Conditioncom;
  let fixture: ComponentFixture<Conditioncom>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Conditioncom]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Conditioncom);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
