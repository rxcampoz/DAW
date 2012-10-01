$(function(){
$('#acordeon').accordion();

$('#acordeon').find('ul').find('li').draggable({
helper:'clone', 
appendTo: 'body'
});


$('#car').find('ol').droppable({
	activeClass:'ui-state-default',
	hoverClass:'ui-state-hover',
	drop: function(event,ui){
		ui.draggable.find('.drag').remove();
		$(this).find('.aqui').remove();
		$(this).append('<li>'+ui.draggable.text()+'<a href="#" class="eliminar">eliminar</a></li>');
	}
});


$('.eliminar').live('click',function(){
$(this).parent('li').remove();
});

});