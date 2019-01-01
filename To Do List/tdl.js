$(document).ready(function() {
    $('#add').click(function(){
        let newListItem = $("#addtoList").val();
        //I don't understand the need for this if check..
        if (newListItem.length>0){
            $("#todoList").append("<li>" + newListItem + "</li>");
            $("#addtoList").val('');
        }
    });
    $('#remove').click(function(){
        //good job removing everything, but now let's try to remove individual items. 
        //this will require each item to have its own remove button. 
        //you can keep the remove button at the top, and rename it "remove all"
        $('li').remove();
    });
    
    //Next steps: 
    //Still need to add an edit functionality
    //Add the ability to complete a todo.
        //Add a checkmark for completed todos with a "strike-through" over the todo
    //Make a better looking UI using Bootstrap. go to https://getbootstrap.com/ for more details. 
        //Decorate each todo as a to-do card. use this as inspiration https://www.w3schools.com/howto/howto_js_todolist.asp
    //Add a fade-in and fade-out effect to to-do items using JQuery
    //save to-do items to firebase. go to https://firebase.google.com/ for more details    
});
