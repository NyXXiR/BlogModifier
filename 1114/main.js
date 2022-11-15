let taskInput = document.querySelector("#task-input");
let addButton = document.querySelector("#add-button");

var taskList = [];

addButton.addEventListener("click", addTask);

function addTask() {
  let taskContent = taskInput.value;

  taskList.push(taskContent);
  console.log(taskList);
  render();
}

function render() {
  let resultHTML = "";
  for (i = 0; i < taskList.length; i++) {
    resultHTML += `
      <div class="task">
        <div>${taskList[i]}</div>
        <div>
          <button>Check</button>
          <button id="delete-button">Delete</button>
        </div>
      </div>
      `;
  }
  document.querySelector("#task-board").innerHTML = resultHTML;
}

let deleteButton = document.querySelector("#delete-button");

deleteButton.addEventListener("click", deleteProcess);

function deleteProcess() {
  asdf;
}
