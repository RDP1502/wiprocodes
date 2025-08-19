import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Task } from '../task';
import { NewTask } from '../new-task/new-task';

@Component({
  selector: 'app-task-list',
  imports: [],
  templateUrl: './task-list.html',
  styleUrl: './task-list.css'
})
export class TaskList {
   @Input() tasks: Task[] = []
   @Output() remove = new EventEmitter<number>()

  onDelete(tasks:Task){
    this.remove.emit(tasks.taskId)
  }



}
