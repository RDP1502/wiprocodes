import { ChangeDetectorRef, Component } from '@angular/core';
import {FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators} from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatButtonModule} from '@angular/material/button';

@Component({
  selector: 'app-reactive2',
  standalone: true,
  imports: [
    MatFormFieldModule, 
    MatInputModule, 
    FormsModule, 
    ReactiveFormsModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatButtonModule
  ],
  templateUrl: './reactive2.html',
  styleUrl: './reactive2.css'
})
export class Reactive2 {
  fg: FormGroup;
  subjects: string[] = ['Angular', 'React', 'Vue'];

  constructor(private fb: FormBuilder, private cdr: ChangeDetectorRef) {
    this.fg = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      name: ['', [Validators.required]],
      doB: [new Date(), [Validators.required]],
      subject: ['', [Validators.required]]
    });
  }

  ngOnInit() {
    this.cdr.detectChanges();
  }

  onSubmit() {
    if(this.fg.valid){
    console.log("submitted");
  }
}
}
