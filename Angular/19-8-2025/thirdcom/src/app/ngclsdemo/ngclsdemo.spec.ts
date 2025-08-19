import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ngclsdemo } from './ngclsdemo';

describe('Ngclsdemo', () => {
  let component: Ngclsdemo;
  let fixture: ComponentFixture<Ngclsdemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ngclsdemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ngclsdemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
