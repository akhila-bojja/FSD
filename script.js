const taskInput = document.getElementById('task-input');
const addTaskBtn = document.getElementById('add-task-btn');
const taskList = document.getElementById('task-list');
const errorMessage = document.getElementById('error-message');

let tasks = [];

function renderTasks() {
  taskList.innerHTML = '';

  tasks.forEach((task, index) => {
    const li = document.createElement('li');
    li.innerHTML = `
      <span>${task}</span>
      <button class="edit-btn">Edit</button>
      <button class="delete-btn">Delete</button>
    `;
    taskList.appendChild(li);

    const editBtn = li.querySelector('.edit-btn');
    const deleteBtn = li.querySelector('.delete-btn');

    editBtn.addEventListener('click', () => {
      editTask(index, li);
    });

    deleteBtn.addEventListener('click', () => {
      deleteTask(index, li);
    });
  });
}

function addTask() {
  const task = taskInput.value.trim();

  if (task !== '') {
    tasks.push(task);
    renderTasks();
    taskInput.value = '';
    errorMessage.textContent = '';
  } else {
    errorMessage.textContent = 'Please enter a task.';
  }
}

function editTask(index, li) {
  const span = li.querySelector('span');
  const editBtn = li.querySelector('.edit-btn');
  const deleteBtn = li.querySelector('.delete-btn');

  span.contentEditable = true;
  span.focus();
  editBtn.textContent = 'Save';

  span.addEventListener('keydown', (e) => {
    if (e.key === 'Enter') {
      saveTask(index, li);
    }
  });

  editBtn.addEventListener('click', () => {
    saveTask(index, li);
  });

  deleteBtn.disabled = true;
}

function saveTask(index, li) {
  const span = li.querySelector('span');
  const editBtn = li.querySelector('.edit-btn');
  const deleteBtn = li.querySelector('.delete-btn');

  span.contentEditable = false;
  editBtn.textContent = 'Edit';
  deleteBtn.disabled = false;

  tasks[index] = span.textContent.trim();
}

function deleteTask(index, li) {
  tasks.splice(index, 1);
  li.remove();
}

addTaskBtn.addEventListener('click', addTask);