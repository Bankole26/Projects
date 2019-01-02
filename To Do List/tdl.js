$(document).ready(function() {
  $('#add').click(function() {
    let newListItem = $('#addtoList').val();
    let listItem = `<li class='todo-list-item'>
        <input type="checkbox" name="todo-item-done" class="todo-item-done" value="${newListItem}"/> 
        ${newListItem} 
        <button class='deleteItem'>Delete</button>
        <button class='edit'>Edit</button>
    </li>`;

    if (newListItem.length > 0) {
      $('.todoList').append(listItem);
      $('#addtoList').val('');
    }
  });

  $('#removeAll').click(function() {
    $('li').remove();
  });

  $('.todoList').on('click', 'li.todo-list-item', function(e) {
    if (e.target.className === 'deleteItem') {
      $(this).remove();
    }
  });

  $('#edit').click(function() {
    $(this)
      .parent()
      .attr('contenteditable', 'true');
  });
});
