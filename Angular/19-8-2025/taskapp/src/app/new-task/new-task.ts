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
[x: string]: any;
addTask(arg0: string,arg1: string,arg2: string) {
throw new Error('Method not implemented.');
}
 @Input() task!: Task;
 @Output() delete = new EventEmitter<number>()

 onDelete(taskId:number){
  this.delete.emit(this.task.taskId)
 }

}
