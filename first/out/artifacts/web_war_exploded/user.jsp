<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="user3.css">
	<title>Магазин комплектующих компьютеров</title>
</head>
<body>
	<header>
		<div class="upper-container">
			<div class="name-shop">Магазин техники</div>
			<input type="text" name="search" class="search" placeholder="Поиск товара">
			<a href="basket.jsp" class="button-basket">Корзина</a>
			<div class="text-count-products">Товаров: </div>
			<div class="count-products">0</div>
			<div class="text-category">Категории</div>
			<ul class="categories">
				<li class="menu-elem">
					<a href="#" type="button">Компьютеры</a>
				</li>
				<%--<li class="menu-elem">
					<a href="#" type="button">рррррр</a>
				</li>--%>
				<%--<li>
					<a href="#" type="button">ппппппп</a>
				</li>--%>
			</ul>
		</div>
	</header>

	<section>
		<div class="lower-container">
			<div class="lower-container-products">
				<div class="text-center">Товары</div>
				<ul class="products">
					<c:forEach var="product" items="${products}">
					<li>
						<div class="product">
							<p>${product.name}</p>
							<p>Цена: ${product.price}</p>

							<form method="post" action='<c:url value="/open" />' style="display:inline;">
							<input type="hidden" name="id" value="${product.idProduct}">
							<input type="submit" value="Open">
							</form>

							<form method="post" action='<c:url value="/buy" />' style="display:inline;">
							<input type="hidden" name="id" value="${product.idProduct}">
							<input type="submit" value="Buy">
							</form>
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>

			<!--<div class="lower-container-filters">
				<div class="text-center">Фильтры</div>
			</div> -->
		</div>
	</section>
</body>
</html>