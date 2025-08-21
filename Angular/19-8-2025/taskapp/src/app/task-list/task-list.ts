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
   @Output() addTask = new EventEmitter<Task>()

   nextId:number = 0
  onAddTask(name:string, description:string, category:string){
    const task: Task = {
      taskId: this.nextId++ ,
      taskName:name,
      taskDescription:description,
      taskCategory:category
    }
    this.addTask.emit(task)
  }

}
