import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicalCom } from './vehical-com';

describe('VehicalCom', () => {
  let component: VehicalCom;
  let fixture: ComponentFixture<VehicalCom>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VehicalCom]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VehicalCom);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
