* 웹디자인기능사 - 새창으로 PopUP창 열기

```html
<!DOCTYPE html>
<html>
  <head>
  	<meta charset="utf-8">
    <title>웹디자인기능사 새창으로 popup열기</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <script>
      $(function(){
        $('button').click(function(){
          window.open("https://www.naver.com/","blank","width=500, height=300")
        });
      });
    </script>
  </head>

  <body>

    <button>page open click</button>

  </body>
</html>
```



* modal 연습

```html
<!DOCTYPE hml>
<html lang="ko">
  <head>
    <meta charset="UTF-8">
    <title>웹디자인기능사 modal 연습</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
    <style>
      #container {position:absolute; width:100%; height:100%; background-color:#000; top:0; left:0; display:none;}

      #modal { width:300px; height:200px; display:block; background-color:gold; border:3px solid #ddd; box-sizing: border-box; border-radius:10px;  position:absolute; top:50%; left:50%; margin-top: -100px; margin-left:-150px; text-align:center;}
    </style>
  </head>

  <body>
    <button>모달 버튼</button>
    <div id="container">
      <div id="modal">
        모달 버튼 클릭시 나오는 내용
      </div>
    </div>


    <script>
      $(function(){ 
        $("button").click(function(){ 
          $("#container").fadeIn(); 
        }); 

        $("#modal").click(function(){ 
          $("#container").fadeOut(); 
        }); 
      });
    </script>
  </body>
</html>
```

