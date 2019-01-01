$(document).ready(function() {
    $('#add').click(function(){
        let newListItem = $("#addtoList").val();
        if (newListItem.length>0){
            $("#todoList").append("<li>" + newListItem + "</li>");
            $("#addtoList").val('');
        }
    });
    $('#remove').click(function(){
        $('li').remove();
    });
    
});