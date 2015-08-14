$('body').ready(function() {
	
	var requestCreateProduct = {
			type: 'GET',
			url: '/pages/createProduct.html'
	};
	$.ajax(requestCreateProduct).done(function(page){
		$('#novo-produto').html(page);
		$('#ok').click(function(){
			var newProductRequest= {
					type: 'POST',
					url: '/api/product',
					data: {
						codigo: $('#codigo').val(),
						nome: $('#nome').val()
					}
			};
			$('#codigo').val('');
			$('#nome').val('');
			$.ajax(newProductRequest).done(function(product){
				$('#codigo').val(product.codigo);
				$('#nome').val(product.nome);
			});
		});
	});
	
	var request = {
			type: 'GET',
			url: '/pages/productList.html'
	};
	$.ajax(request).done(function(htmlResp) {
		var template = doT.compile(htmlResp);
		var productsRequest = {
				type: 'GET',
				url: '/logged/product'
		};
		$.ajax(productsRequest).done(function(productsFromServer){
			console.info(productsFromServer);
			var json = {
					products: productsFromServer
			};
			var htmlGerado = template(json);
			$('#content').html(htmlGerado);
			$('.button-add-to-cart').click(function(){
				var addToCartReq = {
						type: 'POST',
						url: '/api/cart',
						data: {
							codigo: $(this).closest('li').data('id'),
							nome: $(this).closest('li').data('nome')
						}
				};
				$.ajax(addToCartReq).done( function(cartProducts) {
					var cartProductsReq = {
						type: 'GET',
						url: '/pages/productCartList.html'
					};
					$.ajax(cartProductsReq).done(function(page){
						var template = doT.compile(page);
						var html = template(cartProducts);
						$('#cart-list').html(html);
						$('.button-remove-from-cart').click(function() {
							var li = $(this).closest('li');
							var productToRemoveReq = {
									type: 'DELETE',
									url: '/api/cart/' + li.data('id')
							};
							$.ajax(productToRemoveReq).done(function(){
								li.remove();
							});
						});
					});
				});
			});
		});
	});
	var usuarioRequest = {
		type:'GET',
		url: '/login'
	};
	$.ajax(usuarioRequest).done(function(login) {
		$('#usuarioLogado').html(login);
	});
});



