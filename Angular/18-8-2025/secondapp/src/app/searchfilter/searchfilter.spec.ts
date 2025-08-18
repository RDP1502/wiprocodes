import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Searchfilter } from './searchfilter';

describe('Searchfilter', () => {
  let component: Searchfilter;
  let fixture: ComponentFixture<Searchfilter>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Searchfilter]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Searchfilter);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
