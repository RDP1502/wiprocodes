import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Thirdcom } from './thirdcom';

describe('Thirdcom', () => {
  let component: Thirdcom;
  let fixture: ComponentFixture<Thirdcom>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Thirdcom]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Thirdcom);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
