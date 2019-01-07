$(document).ready(function() {
  $('#add').click(function() {
    const d = new Date();
    const u= d.toLocaleString();
    
    
    
    let newListItem = $('#addtoList').val();
            let listItem = `<div class="omni"><div class="toast-header">
            <img src="..." class="rounded mr-2" alt=${i}>
            <strong class="mr-auto">Task</strong>
            <small value="${u}"/> 
                ${u}</small>
            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="toast-body">
            <li class="todo-list-item 
        toast" role="alert" aria-live="assertive" aria-atomic="true">
                <input type="checkbox" name="todo-item-done" class="done" value="${newListItem}"/> 
                ${newListItem}
                <button class='edit btn btn-success"'>Edit</button>
            </li>
          </div>
            </div>`;
    
   // const x=document.getElementbyID("task");
     // x.style.display = "block";
     
    
    if (newListItem.length > 0) {
      $('.todoList').append(listItem);
      $('#addtoList').val('');
    }
  });

  $('#removeAll').click(function() {
    $('li').remove();
  });

  $('.todoList').on('click', '.ml-2.mb-1.close', function(e) {
  $(".omni").fadeOut('slow', function() { 
  $(".omni").remove();
  });
    
    $('.todoList').on('click', 'li.todo-list-item', function(e) {
     if(e.target.className==='done'){
        $(this).toggleClass("strike");
    }
});
      
  });


  $('.todoList').on('click', 'li.todo-list-item', function(e) {
    if (e.target.className === 'edit') {
    $(this)
      .parent()
      .attr('contenteditable', 'true');
    }
      
  });
});
