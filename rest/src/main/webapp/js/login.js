$('body').ready(function() {
	$('#logar').click(function() {
		var request = {
			type : 'POST',
			url : '/login',
			data: {
				login: $('#login').val(),
				password:$('#password').val()
			}
		};
		$.ajax(request).done(function(){
			window.location = '/logged';
		}).fail(function(){
			$('.hidden').css('display','block');
		});
	});
});