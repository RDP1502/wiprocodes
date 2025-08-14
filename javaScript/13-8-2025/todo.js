document.addEventListener("DOMContentLoaded", () => {
  const taskInput = document.getElementById("taskInput");
  const addTaskBtn = document.getElementById("addTaskBtn");
  const taskList = document.getElementById("taskList");

  function addTask() {
    const taskText = taskInput.value.trim();
    if (taskText === "") {
      alert("Please enter a task.");
      return;
    }

    const li = document.createElement("li");
    li.innerHTML = `
      <span>${taskText}</span>
      <button class="delete-btn">Delete</button>
    `;

    // Delete button functionality
    li.querySelector(".delete-btn").addEventListener("click", () => {
      li.remove();
    });

    taskList.appendChild(li);
    taskInput.value = "";
  }

  addTaskBtn.addEventListener("click", addTask);
  
  // Optional: Add task when pressing Enter
  taskInput.addEventListener("keypress", (e) => {
    if (e.key === "Enter") {
      addTask();
    }
  });
});
