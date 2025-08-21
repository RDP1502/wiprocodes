import { Component, EventEmitter, Input, NgModule, Output } from '@angular/core';
import { Task } from '../task';
import { FormControl, FormGroup, NgModel, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-task',
  imports: [],
  templateUrl: './new-task.html',
  styleUrl: './new-task.css'
})
export class NewTask {


 @Input() task!: Task;
 @Output() delete = new EventEmitter<number>()

 onDelete(taskId:number){
  this.delete.emit(this.task.taskId)
 }

}
