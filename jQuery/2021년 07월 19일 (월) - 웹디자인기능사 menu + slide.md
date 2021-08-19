# 2021년 07월 19일 (월)



1.

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21번 홍기석 0719 오후 Menu1 + Slide1</title> 
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <style>
      * {margin:0; padding:0; box-sizing:border-box;}
      a {text-decoration:none; color:#333; display:block;}
      ol,ul,li {list-style:none; margin:0; padding:0;}
      #wrap {position:relative;}

      /* 메뉴 */
      nav {position:absolute; top:0; left:0; z-index:1;}
      #menu {width:1000px; height:40px;}
      #menu > li {float:left; width:25%; text-align:center; line-height:40px; background-color:#000;}
      #menu > li > a {color:#fff;}
      #menu > li:hover {background-color:#fff;}
      #menu > li:hover > a {color:#000;}

      /* 서브메뉴*/
      .sub {background-color:#eee; display:none;}
      .sub > li:hover {background-color:yellow;}

      /* 슬라이드 */
      #slidewrap {position:absolute; left:0; top:40px;}
      .slide {width:1000px; height:600px; overflow:hidden;}
      .slide > li {width:100%; height:100%;position:absolute; top:0; left:0; overflow:hidden;}
      .slide > li > img {width:100%; height:100%;}
      .slide > li:not(:first-child) {display:none;}
      #slidewrap > p {position:absolute; top:50%; left:50%; text-align:center; background-color:rgba(255,255,255,0.7); width:400px; border-radius:10px; height:60px; line-height:60px; transform:translate(-50%, -50%);}
    </style>

    <script>
      $(document).ready(function(){
        $("#menu > li").mouseover(function(){
          $(this).children(".sub").stop().slideDown();
        }).mouseout(function(){
          $(".sub").stop().slideUp();
        });
      });
    </script>
  </head>
  <body>
    <div id="wrap">
      <nav>
        <ul id="menu">
          <li>
            <a href="#">프리미어리그</a>
            <ul class="sub">
              <li><a href="#">리버풀</a></li>
              <li><a href="#">아스날</a></li>
              <li><a href="#">첼시</a></li>
              <li><a href="#">맨유</a></li>
            </ul>
          </li>
          <li>
            <a href="#">라리가</a>
            <ul class="sub">
              <li><a href="#">아틀레티코</a></li>
              <li><a href="#">레알 마드리드</a></li>
              <li><a href="#">바르셀로나</a></li>
              <li><a href="#">세비야</a></li>
            </ul>
          </li>
          <li>
            <a href="#">분데스리가</a>
            <ul class="sub">
              <li><a href="#">바이에른 뮌헨</a></li>
              <li><a href="#">라이프치히</a></li>
              <li><a href="#">도르트문트</a></li>
              <li><a href="#">레버쿠젠</a></li>
            </ul>
          </li>
          <li>
            <a href="#">세리에A</a>
            <ul class="sub">
              <li><a href="#">인터 밀란</a></li>
              <li><a href="#">AC 밀란</a></li>
              <li><a href="#">유벤투스</a></li>
              <li><a href="#">나폴리</a></li>
            </ul>
          </li>
        </ul>
      </nav>
      <div id="slidewrap">
        <ul class="slide">
          <li><img src="https://images.unsplash.com/photo-1486299267070-83823f5448dd?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZW5nbGFuZHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="england"></li>
          <li><img src="https://images.unsplash.com/photo-1523531294919-4bcd7c65e216?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHNwYWlufGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="spain"></li>
          <li><img src="https://images.unsplash.com/photo-1554072675-66db59dba46f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Z2VybWFueXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="germany"></li>
          <li><img src="https://images.unsplash.com/photo-1518730518541-d0843268c287?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fGl0YWx5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="italy"></li>
        </ul>
        <p>21.홍기석 Menu1 + Slide1</p>
      </div> <!-- end #slidewrap-->
    </div> <!-- end #wrap -->
    
    <script>
      var i = 0;
      function slide(){
        i++;
        if(i > $(".slide > li:last").index()){
           i = 0;
        }
        $(".slide > li").eq(i).stop().fadeIn("slow");
        $(".slide > li").eq(i-1).stop().fadeOut("slow");
      }
      setInterval(slide,2000);
    </script>
  </body>
</html>
```



2.

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21번 홍기석 0719 오후 Menu2 + Slide1</title> 
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <style>
      * {margin:0; padding:0; box-sizing:border-box;}
      a {text-decoration:none; color:#333; display:block;}
      ol,ul,li {list-style:none; margin:0; padding:0;}
      #wrap {position:relative;}

      /* 메뉴 */
      nav {position:absolute; top:0; left:0; z-index:1;}
      #menu {width:1000px; height:40px;}
      #menu > li {float:left; width:25%; text-align:center; line-height:40px; background-color:#000;}
      #menu > li > a {color:#fff;}
      #menu > li:hover {background-color:#fff;}
      #menu > li:hover > a {color:#000;}

      /* 서브메뉴*/
      .sub {background-color:#eee; display:none;}
      .sub > li:hover {background-color:yellow;}

      /* 슬라이드 */
      #slidewrap {position:absolute; left:0; top:40px;}
      .slide {width:1000px; height:600px; overflow:hidden;}
      .slide > li {width:100%; height:100%;position:absolute; top:0; left:0; overflow:hidden;}
      .slide > li > img {width:100%; height:100%;}
      .slide > li:not(:first-child) {display:none;}
      #slidewrap > p {position:absolute; top:50%; left:50%; text-align:center; background-color:rgba(255,255,255,0.7); width:400px; border-radius:10px; height:60px; line-height:60px; transform:translate(-50%, -50%);}
    </style>

    <script>
      $(document).ready(function(){
        $("#menu > li").mouseover(function(){
          $(".sub").stop().slideDown();
        }).mouseout(function(){
          $(".sub").stop().slideUp();
        });
      });
    </script>
  </head>
  <body>
    <div id="wrap">
      <nav>
        <ul id="menu">
          <li>
            <a href="#">프리미어리그</a>
            <ul class="sub">
              <li><a href="#">리버풀</a></li>
              <li><a href="#">아스날</a></li>
              <li><a href="#">첼시</a></li>
              <li><a href="#">맨유</a></li>
            </ul>
          </li>
          <li>
            <a href="#">라리가</a>
            <ul class="sub">
              <li><a href="#">아틀레티코</a></li>
              <li><a href="#">레알 마드리드</a></li>
              <li><a href="#">바르셀로나</a></li>
              <li><a href="#">세비야</a></li>
            </ul>
          </li>
          <li>
            <a href="#">분데스리가</a>
            <ul class="sub">
              <li><a href="#">바이에른 뮌헨</a></li>
              <li><a href="#">라이프치히</a></li>
              <li><a href="#">도르트문트</a></li>
              <li><a href="#">레버쿠젠</a></li>
            </ul>
          </li>
          <li>
            <a href="#">세리에A</a>
            <ul class="sub">
              <li><a href="#">인터 밀란</a></li>
              <li><a href="#">AC 밀란</a></li>
              <li><a href="#">유벤투스</a></li>
              <li><a href="#">나폴리</a></li>
            </ul>
          </li>
        </ul>
      </nav>
      <div id="slidewrap">
        <ul class="slide">
          <li><img src="https://images.unsplash.com/photo-1486299267070-83823f5448dd?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZW5nbGFuZHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="england"></li>
          <li><img src="https://images.unsplash.com/photo-1523531294919-4bcd7c65e216?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHNwYWlufGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="spain"></li>
          <li><img src="https://images.unsplash.com/photo-1554072675-66db59dba46f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Z2VybWFueXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="germany"></li>
          <li><img src="https://images.unsplash.com/photo-1518730518541-d0843268c287?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fGl0YWx5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="italy"></li>
        </ul>
        <p>21.홍기석 Menu2 + Slide1</p>
      </div> <!-- end #slidewrap-->
    </div> <!-- end #wrap -->
    
    <script>
      var i = 0;
      function slide(){
        i++;
        if(i > $(".slide > li:last").index()){
           i = 0;
        }
        $(".slide > li").eq(i).stop().fadeIn("slow");
        $(".slide > li").eq(i-1).stop().fadeOut("slow");
      }
      setInterval(slide,2000);
    </script>
  </body>
</html>

```





3.

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21번 홍기석 0719 오후 Menu3 + Slide2</title> 
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <style>
      * {margin:0; padding:0; box-sizing:border-box;}
      a {text-decoration:none; color:#333; display:block;}
      ol,ul,li {list-style:none; margin:0; padding:0;}
      #wrap {position:relative;}

      /* 메뉴 */
      nav {position:absolute; top:0; left:0; z-index:1;}
      #menu {width:200px; height:40px;}
      #menu > li {text-align:center; line-height:40px; background-color:#000;}
      #menu > li > a {color:#fff;}
      #menu > li:hover {background-color:#fff;}
      #menu > li:hover > a {color:#000;}

      /* 서브메뉴*/
      .sub {background-color:#eee; display:none;}
      .sub > li:hover {background-color:yellow;}

      /* 슬라이드 */
      #slidewrap {position:absolute; left:200px; top:0px; width:800px; overflow:hidden;}
      .slide {width:3200px; height:600px; position:relative;}
      .slide > li {width:25%; height:100%; overflow:hidden; float:left;}
      .slide > li > img {width:100%; height:100%;}
      #slidewrap > p {position:absolute; top:50%; left:50%; text-align:center; background-color:rgba(255,255,255,0.7); width:400px; border-radius:10px; height:60px; line-height:60px; transform:translate(-50%, -50%);}
    </style>

    <script>
      $(document).ready(function(){
        $("#menu > li").click(function(){
          $(".sub").stop().slideUp();
          $(this).find(".sub").stop().slideToggle();
        });
      });
    </script>
  </head>
  <body>
    <div id="wrap">
      <nav>
        <ul id="menu">
          <li>
            <a href="#">프리미어리그</a>
            <ul class="sub">
              <li><a href="#">리버풀</a></li>
              <li><a href="#">아스날</a></li>
              <li><a href="#">첼시</a></li>
              <li><a href="#">맨유</a></li>
            </ul>
          </li>
          <li>
            <a href="#">라리가</a>
            <ul class="sub">
              <li><a href="#">아틀레티코</a></li>
              <li><a href="#">레알 마드리드</a></li>
              <li><a href="#">바르셀로나</a></li>
              <li><a href="#">세비야</a></li>
            </ul>
          </li>
          <li>
            <a href="#">분데스리가</a>
            <ul class="sub">
              <li><a href="#">바이에른 뮌헨</a></li>
              <li><a href="#">라이프치히</a></li>
              <li><a href="#">도르트문트</a></li>
              <li><a href="#">레버쿠젠</a></li>
            </ul>
          </li>
          <li>
            <a href="#">세리에A</a>
            <ul class="sub">
              <li><a href="#">인터 밀란</a></li>
              <li><a href="#">AC 밀란</a></li>
              <li><a href="#">유벤투스</a></li>
              <li><a href="#">나폴리</a></li>
            </ul>
          </li>
        </ul>
      </nav>
      <div id="slidewrap">
        <ul class="slide">
          <li><img src="https://images.unsplash.com/photo-1486299267070-83823f5448dd?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZW5nbGFuZHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="england"></li>
          <li><img src="https://images.unsplash.com/photo-1523531294919-4bcd7c65e216?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHNwYWlufGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="spain"></li>
          <li><img src="https://images.unsplash.com/photo-1554072675-66db59dba46f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Z2VybWFueXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="germany"></li>
          <li><img src="https://images.unsplash.com/photo-1518730518541-d0843268c287?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fGl0YWx5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="italy"></li>
        </ul>
        <p>21.홍기석 Menu3 + Slide2</p>
      </div> <!-- end #slidewrap-->
    </div> <!-- end #wrap -->

    <script>

      function slide(){
        $(".slide").stop().animate({marginLeft:-800},function(){
          $(".slide > li:first").appendTo(".slide");
          $(".slide").css({marginLeft:0});
        });
      }
      setInterval(slide,2000);
    </script>
  </body>
</html>

```





4.

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21번 홍기석 0719 오후 Menu4 + Slide3</title> 
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <style>
      * {margin:0; padding:0; box-sizing:border-box;}
      a {text-decoration:none; color:#333; display:block;}
      ol,ul,li {list-style:none; margin:0; padding:0;}
      #wrap {position:relative;}

      /* 메뉴 */
      nav {position:absolute; top:0; left:0; z-index:1;}
      #menu {width:200px; height:40px;}
      #menu > li {text-align:center; line-height:40px; background-color:#000; position:relative;}
      #menu > li > a {color:#fff;}
      #menu > li:hover {background-color:#fff;}
      #menu > li:hover > a {color:#000;}

      /* 서브메뉴*/
      .sub {background-color:#eee; display:none; position:absolute; top:0; left:200px; width:150px;}
      .sub > li:hover {background-color:yellow;}

      /* 슬라이드 */
      #slidewrap {position:absolute; left:200px; top:0px; width:800px; overflow:hidden;}
      .slide {width:3200px; height:600px; position:relative;}
      .slide > li {width:25%; height:100%; overflow:hidden; float:left;}
      .slide > li > img {width:100%; height:100%;}
      #slidewrap > p {position:absolute; top:50%; left:50%; text-align:center; background-color:rgba(255,255,255,0.7); width:400px; border-radius:10px; height:60px; line-height:60px; transform:translate(-50%, -50%);}

      /* 슬라이드버튼 */
      #slidewrap > span {position:absolute; top:50%; text-align:center; background-color:rgba(255,255,255,0.7); width:40px; height:60px; line-height:55px; transform:translateY(-50%); font-size:40px;}
      .prev {left:0px; border-radius:0 10px 10px 0;}
      .next {right:0px; border-radius:10px 0px 0px 10px;}
      #slidewrap > span:hover {opacity:0.9; cursor:pointer;}
    </style>

    <script>
      $(document).ready(function(){
        $("#menu > li").mouseenter(function(){
          $(".sub").stop().hide();
          $(this).find(".sub").stop().fadeIn();
        }).mouseleave(function(){
          $(".sub").stop().hide();
        });
      });
    </script>
  </head>
  <body>
    <div id="wrap">
      <nav>
        <ul id="menu">
          <li>
            <a href="#">프리미어리그</a>
            <ul class="sub">
              <li><a href="#">리버풀</a></li>
              <li><a href="#">아스날</a></li>
              <li><a href="#">첼시</a></li>
              <li><a href="#">맨유</a></li>
            </ul>
          </li>
          <li>
            <a href="#">라리가</a>
            <ul class="sub">
              <li><a href="#">아틀레티코</a></li>
              <li><a href="#">레알 마드리드</a></li>
              <li><a href="#">바르셀로나</a></li>
              <li><a href="#">세비야</a></li>
            </ul>
          </li>
          <li>
            <a href="#">분데스리가</a>
            <ul class="sub">
              <li><a href="#">바이에른 뮌헨</a></li>
              <li><a href="#">라이프치히</a></li>
              <li><a href="#">도르트문트</a></li>
              <li><a href="#">레버쿠젠</a></li>
            </ul>
          </li>
          <li>
            <a href="#">세리에A</a>
            <ul class="sub">
              <li><a href="#">인터 밀란</a></li>
              <li><a href="#">AC 밀란</a></li>
              <li><a href="#">유벤투스</a></li>
              <li><a href="#">나폴리</a></li>
            </ul>
          </li>
        </ul>
      </nav>
      <div id="slidewrap">
        <ul class="slide">
          <li><img src="https://images.unsplash.com/photo-1486299267070-83823f5448dd?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZW5nbGFuZHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="england"></li>
          <li><img src="https://images.unsplash.com/photo-1523531294919-4bcd7c65e216?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHNwYWlufGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="spain"></li>
          <li><img src="https://images.unsplash.com/photo-1554072675-66db59dba46f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Z2VybWFueXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="germany"></li>
          <li><img src="https://images.unsplash.com/photo-1518730518541-d0843268c287?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fGl0YWx5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="italy"></li>
        </ul>
        <p>21.홍기석 Menu4 + Slide3</p>
        <span class="prev">&lt;</span>
        <span class="next">&gt;</span>
      </div> <!-- end #slidewrap-->
    </div> <!-- end #wrap -->

    <script>
      function prev(){
        $(".slide > li:last").prependTo(".slide");
        $(".slide").css({marginLeft:-800});
        $(".slide").stop().animate({marginLeft:0});
      }

      function next(){
        $(".slide").stop().animate({marginLeft:-800},function(){
          $(".slide > li:first").appendTo(".slide");
          $(".slide").css({marginLeft:0});
        });
      }

      
      /*
      function slide(){
        $(".slide").stop().animate({marginLeft:-800},function(){
          $(".slide > li:first").appendTo(".slide");
          $(".slide").css({marginLeft:0});
        });
      }
      */
      
      // next() 와 slide() 같은 코드
      setInterval(next,2000);

      $(".prev").click(function(){
        prev();
      });

      $(".next").click(function(){
        next();
      });
    </script>
  </body>
</html>

```

