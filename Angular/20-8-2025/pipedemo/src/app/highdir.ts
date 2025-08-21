import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appHighdir]'
})
export class Highdir {

  constructor( elementRef: ElementRef) {
    elementRef.nativeElement.style.background='yellow';
    elementRef.nativeElement.style.textDecoration='line-through';
   }

}
