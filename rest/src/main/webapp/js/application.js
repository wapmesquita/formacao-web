var url = "/rest";

function carregaCarrinho() {
	var cartReq = {
			type: 'GET',
			url: url + '/api/cart'
	};
	$.ajax(cartReq).done( function(cartProducts) {
		var cartProductsReq = {
			type: 'GET',
			url: url + '/pages/productCartList.html'
		};
		$.ajax(cartProductsReq).done(function(page){
			var template = doT.compile(page);
			var html = template({products: cartProducts});
			console.info(cartProducts);console.info(template);
			$('#cart-list').html(html);
			$('.button-remove-from-cart').click(function() {
				var li = $(this).closest('li');
				var productToRemoveReq = {
						type: 'DELETE',
						url: url + '/api/cart/remove/' + li.data('id')
				};
				$.ajax(productToRemoveReq).done(function(){
					li.remove();
				});
			});
		});
	});
}

function adicionaNoCarrinho(codigo, nome) {
	var addToCartReq = {
			type: 'POST',
			url: url + '/api/cart/add',
			data: {
				codigo: codigo,
				nome: nome
			}
	};
	
	$.ajax(addToCartReq).done( function(cartProducts) {
		carregaCarrinho();
	});
}

function carregaProdutos() {
	var req = {
		type: 'GET',
		url: url + '/pages/productList.html'
	};
	$.ajax(req).done(function(page){
		var productsRequest = {
				type: 'GET',
				url: url + '/logged/product'
		};
		$.ajax(productsRequest).done(function(productsFromServer){
			var json = {
					products: productsFromServer
			};
			var template = doT.compile(page);
			var htmlGerado = template(json);
			$('#content').html(htmlGerado);
			$('.button-add-to-cart').click(function(){
				adicionaNoCarrinho($(this).closest('li').data('id'), $(this).closest('li').data('nome'));
			});
		});
	
	});
}

$('body').ready(function() {
	
	var requestCreateProduct = {
			type: 'GET',
			url: url + '/pages/createProduct.html'
	};
	$.ajax(requestCreateProduct).done(function(page){
		$('#novo-produto').html(page);
		$('#ok').click(function(){
			var newProductRequest= {
					type: 'POST',
					url: url + '/api/product',
					data: {
						codigo: $('#codigo').val(),
						nome: $('#nome').val()
					}
			};
			$('#codigo').val('');
			$('#nome').val('');
			$.ajax(newProductRequest).done(function(product){
				carregaProdutos();
			});
		});
	});
	
	carregaProdutos();
	carregaCarrinho();
	
	var usuarioRequest = {
		type:'GET',
		url: '/login'
	};
	$.ajax(usuarioRequest).done(function(login) {
		$('#usuarioLogado').html(login);
	});
});



