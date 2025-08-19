import { Component } from '@angular/core';
import { TaskList } from "../task-list/task-list";
import { NewTask } from "../new-task/new-task";
import { Task } from '../task';

@Component({
  selector: 'app-home',
  imports: [TaskList, NewTask],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
num:number[]=[0,1,2,3]
tasks: Task[]=[
    {
      taskId: 0,
      taskName:'',
      taskCategory:'',
      taskDescription:''
    }

  ];
  nextId = 1
  addTask(name:string,description:string,category:string){
    const newTask: Task = {
      taskId: this.nextId++, // match Task property
      taskName: name, // match Task property
      taskCategory: category,
      taskDescription: description
    };
    this.tasks.push(newTask)
    
  }

}
