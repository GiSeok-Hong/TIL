# 2021년 07월 16일 (금)



### Menu1 + Slide1

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 0716 오후 menu1 + slide1</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <style>
      * {margin:0; padding:0; box-sizing:border-box;} 
      ul,ol,li {list-style:none; margin:0; padding:0;}
      a {text-decoration:none; color:#333; display:block;}
      #wrap {position:relative;}     

      /* 메뉴 */
      nav {position:absolute; top:0; left:0; z-index:1;}
      .menu {width:1000px; height:40px;}
      .menu > li {float:left; width:25%; text-align:center; line-height:40px; background-color:#000;}
      .menu > li > a {color:#fff;}
      .menu > li:hover {background-color:#fff;}
      .menu > li:hover a {color:#000;}

      /* 서브메뉴 */
      .sub {background-color:#eee; display:none;}
      .sub > li:hover {background-color:yellow;}

      /* 슬라이드 */
      #slidewrap {position:absolute; left:0; top:40px;}
      .slide {width:1000px; height:500px; }
      .slide > li {width:100%; height:100%; position:absolute; top:0; left:0; overflow:hidden;}
      .slide > li > img {width:100%; height:100%;}
      .slide > li:not(:first-child) {display:none;}
      #slidewrap > p {position:absolute; top:50%; left:50%; text-align:center; background-color:#fff; opacity:0.7; width:400px; border-radius:10px; height:60px; line-height:60px; transform:translate(-50%,-50%);}
    </style>

    <script>
      $(document).ready(function(){
        $(".menu > li").mouseover(function(){
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
        <ul class="menu">
          <li>
            <a href="#">Menu1</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu2</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu3</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu4</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
        </ul>
      </nav>

      <div id="slidewrap">
        <ul class="slide">
          <li><img src="https://images.unsplash.com/photo-1490750967868-88aa4486c946?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c3ByaW5nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="spring"></li>
          <li><img src="https://images.unsplash.com/photo-1541417904950-b855846fe074?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjl8fHN1bW1lcnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="summer"></li>
          <li><img src="https://images.unsplash.com/photo-1476820865390-c52aeebb9891?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8ZmFsbHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="fall"></li>
          <li><img src="https://images.unsplash.com/photo-1455156218388-5e61b526818b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8d2ludGVyfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="winter"></li>
        </ul>
        <p>21.홍기석 Menu1 + Slide1</p>
      </div> <!-- end #slidewrap-->

    </div> <!-- end #wrap-->

    <script>

      var i = 0;
      function slide(){
        i++;
        if(i > $(".slide > li:last").index()){
          i = 0;
        }
        $(".slide > li").eq(i).stop().fadeIn("slow");
        $(".slide > li").eq(i-1).stop().fadeOut();
      }
      setInterval(slide,2000);



    </script>
  </body>
</html>

```



### Menu2 + Slide1

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 0716 오후 menu2 + slide1</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <style>
      * {margin:0; padding:0; box-sizing:border-box;} 
      ul,ol,li {list-style:none; margin:0; padding:0;}
      a {text-decoration:none; color:#333; display:block;}
      #wrap {position:relative;}     

      /* 메뉴 */
      nav {position:absolute; top:0; left:0; z-index:1;}
      .menu {width:1000px; height:40px;}
      .menu > li {float:left; width:25%; text-align:center; line-height:40px; background-color:#000;}
      .menu > li > a {color:#fff;}
      .menu > li:hover {background-color:#fff;}
      .menu > li:hover a {color:#000;}

      /* 서브메뉴 */
      .sub {background-color:#eee; display:none;}
      .sub > li:hover {background-color:yellow;}

      /* 슬라이드 */
      #slidewrap {position:absolute; left:0; top:40px;}
      .slide {width:1000px; height:500px; }
      .slide > li {width:100%; height:100%; position:absolute; top:0; left:0; overflow:hidden;}
      .slide > li > img {width:100%; height:100%;}
      .slide > li:not(:first-child) {display:none;}
      #slidewrap > p {position:absolute; top:50%; left:50%; text-align:center; background-color:#fff; opacity:0.7; width:400px; border-radius:10px; height:60px; line-height:60px; transform:translate(-50%,-50%);}
    </style>

    <script>
      $(document).ready(function(){
        $(".menu > li").mouseover(function(){
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
        <ul class="menu">
          <li>
            <a href="#">Menu1</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu2</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu3</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu4</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
        </ul>
      </nav>

      <div id="slidewrap">
        <ul class="slide">
          <li><img src="https://images.unsplash.com/photo-1490750967868-88aa4486c946?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c3ByaW5nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="spring"></li>
          <li><img src="https://images.unsplash.com/photo-1541417904950-b855846fe074?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjl8fHN1bW1lcnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="summer"></li>
          <li><img src="https://images.unsplash.com/photo-1476820865390-c52aeebb9891?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8ZmFsbHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="fall"></li>
          <li><img src="https://images.unsplash.com/photo-1455156218388-5e61b526818b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8d2ludGVyfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="winter"></li>
        </ul>
        <p>21.홍기석 Menu2 + Slide1</p>
      </div> <!-- end #slidewrap-->

    </div> <!-- end #wrap-->

    <script>

      var i = 0;
      function slide(){
        i++;
        if(i > $(".slide > li:last").index()){
          i = 0;
        }
        $(".slide > li").eq(i).stop().fadeIn("slow");
        $(".slide > li").eq(i-1).stop().fadeOut();
      }
      setInterval(slide,2000);



    </script>
  </body>
</html>

```



### Menu3 + Slide2

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 0716 오후 menu3 + slide2</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <style>
      * {margin:0; padding:0; box-sizing:border-box;} 
      ul,ol,li {list-style:none; margin:0; padding:0;}
      a {text-decoration:none; color:#333; display:block;}
      #wrap {position:relative;}     

      /* 메뉴 */
      nav {position:absolute; top:0px; left:0px; z-index:1;}
      .menu {width:200px;}
      .menu > li {text-align:center; line-height:40px; background-color:#000;}
      .menu > li > a {color:#fff;}
      .menu > li:hover {background-color:#fff;}
      .menu > li:hover a {color:#000;}

      /* 서브메뉴 */
      .sub {background-color:#eee; display:none;}
      .sub > li:hover {background-color:yellow;}

      /* 슬라이드 */
      #slidewrap {position:absolute; left:200px; top:0px; width:800px; overflow:hidden;}
      .slide {width:3200px; height:500px; }
      .slide > li {width:800px; height:100%; float:left;}
      .slide > li > img {width:100%; height:100%;}
      
      #slidewrap > p {position:absolute; top:50%; left:50%; text-align:center; background-color:#fff; opacity:0.7; width:400px; border-radius:10px; height:60px; line-height:60px; transform:translate(-50%,-50%);}
    </style>

    <script>
      $(document).ready(function(){
        $(".menu > li").click(function(){
          $(".sub").stop().slideUp();
          $(this).find(".sub").stop().slideToggle();
        });
      });
    </script>

  </head>
  <body>
    <div id="wrap">
      <nav>
        <ul class="menu">
          <li>
            <a href="#">Menu1</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu2</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu3</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu4</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
        </ul>
      </nav>

      <div id="slidewrap">
        <ul class="slide">
          <li><img src="https://images.unsplash.com/photo-1490750967868-88aa4486c946?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c3ByaW5nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="spring"></li>
          <li><img src="https://images.unsplash.com/photo-1541417904950-b855846fe074?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjl8fHN1bW1lcnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="summer"></li>
          <li><img src="https://images.unsplash.com/photo-1476820865390-c52aeebb9891?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8ZmFsbHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="fall"></li>
          <li><img src="https://images.unsplash.com/photo-1455156218388-5e61b526818b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8d2ludGVyfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="winter"></li>
        </ul>
        <p>21.홍기석 Menu3 + Slide2</p>
      </div> <!-- end #slidewrap-->
    </div> <!-- end #wrap-->


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





### Menu4 + Slide3

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 0716 오후 menu4 + slide3</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <style>
      * {margin:0; padding:0; box-sizing:border-box;} 
      ul,ol,li {list-style:none; margin:0; padding:0;}
      a {text-decoration:none; color:#333; display:block;}
      #wrap {position:relative;}     

      /* 메뉴 */
      nav {position:absolute; top:0px; left:0px; z-index:1;}
      .menu {width:200px;}
      .menu > li {text-align:center; line-height:40px; background-color:#000; position:relative;}
      .menu > li > a {color:#fff;}
      .menu > li:hover {background-color:#fff;}
      .menu > li:hover a {color:#000;}

      .sub {background-color:#eee; display:none; position:absolute; top:0px; left:200px; width:150px;}
      .sub > li:hover {background-color:yellow;}

      /* 슬라이드 */
      #slidewrap {position:absolute; left:200px; top:0px; width:800px; overflow:hidden;}
      .slide {width:3200px; height:500px; }
      .slide > li {width:800px; height:100%; float:left;}
      .slide > li > img {width:100%; height:100%;}

      /* 텍스트 */  
      #slidewrap > p {position:absolute; top:50%; left:50%; text-align:center; background-color:#fff; opacity:0.7; width:400px; border-radius:10px; height:60px; line-height:60px; transform:translate(-50%,-50%);}

      /* 버튼 */
      #slidewrap > span {position:absolute; top:50%; text-align:center; background-color:#fff; opacity:0.7; width:40px; height:60px; line-height:55px; transform:translateY(-50%); font-size:40px;}
      .prev {left:0px; border-radius:0 10px 10px 0;}
      .next {right:0px; border-radius:10px 0px 0px 10px;}
      #slidewrap > span:hover {opacity:0.9; cursor:pointer;}
    </style>

    <script>
      $(document).ready(function(){
        $(".menu > li").mouseenter(function(){
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
        <ul class="menu">
          <li>
            <a href="#">Menu1</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu2</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu3</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
          <li>
            <a href="#">Menu4</a>
            <ul class="sub">
              <li><a href="#">Sub Menu1</a></li>
              <li><a href="#">Sub Menu2</a></li>
              <li><a href="#">Sub Menu3</a></li>
              <li><a href="#">Sub Menu4</a></li>
            </ul>
          </li>
        </ul>
      </nav>

      <div id="slidewrap">
        <ul class="slide">
          <li><img src="https://images.unsplash.com/photo-1490750967868-88aa4486c946?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c3ByaW5nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="spring"></li>
          <li><img src="https://images.unsplash.com/photo-1541417904950-b855846fe074?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjl8fHN1bW1lcnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="summer"></li>
          <li><img src="https://images.unsplash.com/photo-1476820865390-c52aeebb9891?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8ZmFsbHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="fall"></li>
          <li><img src="https://images.unsplash.com/photo-1455156218388-5e61b526818b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8d2ludGVyfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="winter"></li>
        </ul>
        <p>21.홍기석 Menu4 + Slide3</p>
        <span class="prev">&lt;</span>
        <span class="next">&gt;</span>
      </div> <!-- end #slidewrap-->
    </div> <!-- end #wrap-->


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
      
      function slide(){
        $(".slide").stop().animate({marginLeft:-800},function(){
          $(".slide > li:first").appendTo(".slide");
          $(".slide").css({marginLeft:0});
        });
      }

      setInterval(slide,3000);
	
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

