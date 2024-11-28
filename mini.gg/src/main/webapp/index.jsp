<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/mini.gg/resources/css/styles.css">
    <title>Mini.GG</title>
</head>
<body>
    <div class="banner">
        <a href="/mini.gg">
        <img src="/mini.gg/resources/images/mini.gg.logo.png" style="width: 120px; height: 30px;" >
        </a>
    </div>
    <header>
        <nav class="top-nav">
            <ul class="left-nav">
                <li><a href="#">챔피언 검색</a></li>
                <li><a href="#">전적 검색</a></li>
                <li><a href="#">지도</a></li>
            </ul>
            <ul class="right-nav">
                <li><a href="/mini.gg/login.do">로그인</a></li>
                <li><a href="/mini.gg/register.do">회원가입</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section id="search">
            <div id="image-container">
                <img src="/mini.gg/resources/images/download (2).png" alt="main image" width="360" height="250"/>
            </div>
            <input type="text" id="champion-name" placeholder="챔피언 이름 입력">
            <button id="search-button">검색</button>
        </section>
        <section id="results">
            <!-- 검색 결과가 여기에 표시됩니다 -->
        </section>
    </main>
</body>
</html>
