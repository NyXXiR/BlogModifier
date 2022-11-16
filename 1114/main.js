let taskInput = document.querySelector("#task-input");
let addButton = document.querySelector("#add-button");

var taskList = [];

addButton.addEventListener("click", addTask);

function addTask() {
  let task = {
    id: randomIDGenerate(),
    taskContent: taskInput.value,
    isComplete: false,
  };

  taskList.push(task);
  console.log(taskList);
  render();
}

function render() {
  let resultHTML = "";
  for (i = 0; i < taskList.length; i++) {
    if (taskList[i].isComplete == true) {
      resultHTML += `
      <div class="task">
        <div class="task-done">${taskList[i].taskContent}</div>
        <div>
          <button onclick="toggleComplete('${taskList[i].id}')">Check</button>
          <button id="delete-button">Delete</button>
        </div>
      </div>
      `;
    } else {
      resultHTML += `
      <div class="task">
        <div>${taskList[i].taskContent}</div>
        <div>
          <button onclick="toggleComplete('${taskList[i].id}')">Check</button>
          <button id="delete-button">Delete</button>
        </div>
      </div>
      `;
    }
  }
  document.querySelector("#task-board").innerHTML = resultHTML;
}

function randomIDGenerate() {
  return Math.random().toString(36).substr(2, 9);
}

function toggleComplete(id) {
  for (let i = 0; i < taskList.length; i++) {
    if (taskList[i].id == id) {
      // isComplete의 값은 true/false 이므로 !isComplete는 스위치가 된다
      taskList[i].isComplete = !taskList[i].isComplete;
      break;
    }
  }
  render();
  console.log(taskList);
}

function deleteTask() {}

// let deleteButton = document.querySelector("#delete-button");

// deleteButton.addEventListener("click", deleteProcess);

// function deleteProcess() {
//   asdf;
// }
