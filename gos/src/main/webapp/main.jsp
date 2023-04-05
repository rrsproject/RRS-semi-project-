<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='shortcut icon' type='image/x-icon' href='../images/panda.png' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<style type="text/css">
.bg-image{
	background-image: url("<%=request.getContextPath()%>/images/backimg.jpg");
	background-size: cover;
}
.jumbotron h1 {
  color: white;
  font-weight: bold;
}
.jumbotron p {
  color: white;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-md navbar-light bg-light">
  <a class="navbar-brand" href="#">네비게이션 로고</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">카테고리</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">예약하기</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">로그인</a>
      </li>
    </ul>
  </div>
</nav>
<div class="jumbotron bg-image">
		<h1 class="display-4">간편하게 예약하자</h1>
		<p class="lead">요기어떄유</p>
		<hr class="my-4">
		<p>여기에는 다양한 부트스트랩 컴포넌트가 포함될 수 있습니다.</p>
		<a class="btn btn-primary btn-lg" href="#" role="button">더 알아보기</a>
	</div>
</body>
</html>