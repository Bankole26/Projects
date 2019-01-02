$(document).ready(function() {
    $('#add').click(function(){
        let newListItem = $("#addtoList").val();
        let listItem="<li><input type='checkbox'" +" name='todo-item-done'" +" class='todo-item-done'"+ 
                         " value='" + newListItem + "' /> " + 
                         newListItem +
                         " <button id='deleteItem'>"+
                         "Delete</button>"+" <button class='edit'>"+
                         "Edit</button>" +"</li>";
        if (newListItem.length>0){
            $("#todoList").append(listItem);
             
            $("#addtoList").val('');
        }
    });
    
    $('#removeAll').click(function(){
        $('li').remove();
    });
    
   $('#deleteItem').on('click',function(){
    $(this).parent().remove();
});

    
    $('#edit').click(function(){
    $(this).parent().attr('contenteditable','true');
    })
});