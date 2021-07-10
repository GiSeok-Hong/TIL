# 2021년 07월 08일 (목)

`<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>`



**.hide()  /  show** 

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .focus()  /  .blur() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>

      $(document).ready(function(){
        $("#hide").click(function(){
          $("p").hide(1000);
        });
        $("#show").click(function(){
          $("p").show(1000);
        });
      });

    </script>

  </head>

  <body>
    <p>If you click on the "Hide" button, I will disappear.</p>

    <button id="hide">Hide</button>
    <button id="show">Show</button>

  </body>
</html>
```



**.toggle()**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .toggle() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>

      $(document).ready(function(){
        $("button").click(function(){
          $("p").toggle();
        });
      });

    </script>

  </head>

  <body>
    <button>Toggle between hiding and showing the paragraphs</button>

    <p>This is a paragraph with little content.</p>
    <p>This is another small paragraph.</p>

  </body>
</html>
```



**.click()**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .click 연습 </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      $(document).ready(function(){
        $('p').click(function(){
          $(this).hide();
        });
      });

    </script>

  </head>

  <body>

    <p>If you click on me, I will disappear.</p>
    <p>Click me away!</p>
    <p>Click me too!</p>

  </body>
</html>
```



**.dblclick()**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .dblclick 연습 </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      $(document).ready(function(){
        $('p').dblclick(function(){
          $(this).hide();
        });
      });

    </script>

  </head>

  <body>

    <p>If you double-click on me, I will disappear.</p>
    <p>Click me away!</p>
    <p>Click me too!</p>

  </body>
</html>
```



**.mouseenter()  /  .mouseleave()** (자식 영역에 들어가면 감지하지 않는다.)

* mouseover /mouseout 과 차이점은 mouseover은 이벤트를 직접 걸지 않은 자식요소까지 적용됨

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .mouseenter()  /  .mouseleave() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>

	$(function(){
      // 마우스 진입 감지
      $('#p1').mouseenter(function(){
        $('#p1').css("background-color","red");
      });
      
      // 마우스가 요소에서 벗어날 때
      $('#p1').mouseleave(function(){
        $('#p1').css("background-color","yellow");
      });
    });

    </script>

  </head>

  <body>

    <p id="p1">Enter this paragraph.</p>

  </body>
</html>
```



**.mousedown()  /  .mouseup()** - 마우스로 눌렀을 경우 / 마우스를 땔 경우

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .mousedown()  /  .mouseup() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>

	$(function(){
      // 셀렉터로 지정한 태그에 마우스 버튼이 눌렸을 경우 실행
      $('#p1').mousedown(function(){
        $('#p1').css("background-color","red");
      });
      
      // 셀렉터로 지정한 태그 위에서 눌려 있던 마우스가 떨어질 때 실행
      $('#p1').mouseup(function(){
        $('#p1').css("background-color","yellow");
      });
    });

    </script>

  </head>

  <body>

    <p id="p1">Enter this paragraph.</p>

  </body>
</html>
```



**.hover()**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .hover() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      // mouseenter / mouseleave 합친것
      $(document).ready(function(){
        $("#p1").hover(function(){
          alert("You entered p1!");
        },
                       function(){
          alert("Bye! You now leave p1!");
        });


        $("#p2").hover(function(){
          $(this).css("background-color", "yellow");
        }, function(){
          $(this).css("background-color", "pink");
        });
      });

    </script>

  </head>

  <body>

    <p id="p1">Enter this paragraph.</p>
    <br><br>
    <p id="p2">Hover the mouse pointer over this paragraph.</p>
  </body>
</html>
```



**.focus()  /  .blur()**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .focus()  /  .blur() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>

      $(function(){
        // focus(주목)를 받았을 경우 실행
        $('input').focus(function(){
          $(this).css("background-color","yellow");
        });
        // focus를 잃었을 경우 실행  
        $('input').blur(function(){
          $(this).css("background-color","green");
        });
      });

    </script>

  </head>

  <body>

    Name: <input type="text" name="fullname"><br>
    Email: <input type="text" name="email">

  </body>
</html>
```



**.fadeIn()  /  .fadeOut()**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .fadeIn() / .fadeOut()</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      $(function(){
        $('#inbtn').click(function(){
          $('#div1').fadeIn();
          $('#div2').fadeIn('slow');
          $('#div3').fadeIn(3000);
        });
        
        $("#outbtn").click(function(){
          $("#div1").fadeOut();
          $("#div2").fadeOut("slow");
          $("#div3").fadeOut(3000);
        });
      });
    </script>

  </head>

  <body>
    <p>Demonstrate fadeIn() with different parameters.</p>

    <button id="inbtn">Click to fade in boxes</button><br><br>
    <button id='outbtn'>Click to fade out boxes</button><br><br>
    <div id="div1" style="width:80px;height:80px;display:none;background-color:red;"></div><br>
    <div id="div2" style="width:80px;height:80px;display:none;background-color:green;"></div><br>
    <div id="div3" style="width:80px;height:80px;display:none;background-color:blue;"></div>

  </body>
</html>
```



**.fadeToggle() **

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .fadeToggle() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      $(document).ready(function(){
        $("button").click(function(){
          $("#div1").fadeToggle();
          $("#div2").fadeToggle("slow");
          $("#div3").fadeToggle(3000);
        });
      });
    </script>

  </head>

  <body>
    <p>Demonstrate fadeToggle() with different speed parameters.</p>

    <button>Click to fade in/out boxes</button><br><br>

    <div id="div1" style="width:80px;height:80px;background-color:red;"></div>
    <br>
    <div id="div2" style="width:80px;height:80px;background-color:green;"></div>
    <br>
    <div id="div3" style="width:80px;height:80px;background-color:blue;"></div>

  </body>
</html>
```



**.fadeTo()  -  투명도 변경**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .fadeTo() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      $(document).ready(function(){
        $("button").click(function(){
          // 요소를 지정한 투명도로 바꿔준다
          $("#div1").fadeTo("slow", 0.15);
          $("#div2").fadeTo("slow", 0.4);
          $("#div3").fadeTo("slow", 0.7);
        });
      });
    </script>

  </head>

  <body>
    <p>Demonstrate fadeTo() with different parameters.</p>

    <button>Click to fade boxes</button><br><br>

    <div id="div1" style="width:80px;height:80px;background-color:red;"></div><br>
    <div id="div2" style="width:80px;height:80px;background-color:green;"></div><br>
    <div id="div3" style="width:80px;height:80px;background-color:blue;"></div>


  </body>
</html>
```



**.slideDown()  /  .slideUp()**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .slideDown()  /  .slideUp() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      $(document).ready(function(){
        $("#flip").click(function(){
          $("#panel").slideDown("slow");
        });

        $("#flip2").click(function(){
          $("#panel2").slideUp("slow");
        });
      });
    </script>


    <style>
      #panel, #flip, #panel2, #flip2 {
        padding: 5px;
        text-align: center;
        background-color: #e5eecc;
        border: solid 1px #c3c3c3;
      }

      #panel {
        padding: 50px;
        display: none;
      }

      #panel2 {
        padding: 50px;
      }
    </style>
  </head>

  <body>
    <div id="flip">Click to slide down panel</div>
    <div id="panel">Hello world!</div>

    <div id="flip2">Click to slide up panel</div>
    <div id="panel2">Hello world!</div>


  </body>
</html>
```



**.slideToggle()**

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title> .slideToggle() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      $(document).ready(function(){
        $("#flip").click(function(){
          $("#panel").slideToggle("slow");
        });
      });
    </script>


    <style>
      #panel, #flip {
        padding: 5px;
        text-align: center;
        background-color: #e5eecc;
        border: solid 1px #c3c3c3;
      }

      #panel {
        padding: 50px;
        display: none;
      }
    </style>
  </head>

  <body>

    <div id="flip">Click to slide the panel down or up</div>
    <div id="panel">Hello world!</div>
  </body>
</html>
```



**.animate()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .animate() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("button").click(function(){
          var div = $("div");
          div.animate({height: '300px', opacity: '0.4'}, "slow");
          div.animate({width: '300px', opacity: '0.8'}, "slow");
          div.animate({height: '100px', opacity: '0.4'}, "slow");
          div.animate({width: '100px', opacity: '0.8'}, "slow");
        });
      });
    </script>


  </head>
  <body>

    <button>Start Animation</button>

    <p>By default, all HTML elements have a static position, and cannot be moved. To manipulate the position, remember to first set the CSS position property of the element to relative, fixed, or absolute!</p>

    <div style="background:#98bf21;height:100px;width:100px;position:absolute;"></div>
  </body>
</html>
```



**.stop()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .stop() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("#start").click(function(){
          $("div").animate({left: '100px'}, 5000);
          $("div").animate({fontSize: '3em'}, 5000);
        });

        $("#stop").click(function(){
          $("div").stop();
        });

        $("#stop2").click(function(){
          $("div").stop(true);
        });

        $("#stop3").click(function(){
          $("div").stop(true, true);
        });
      });
    </script>


  </head>
  <body>

    <button id="start">Start</button>
    <button id="stop">Stop</button>
    <button id="stop2">Stop all</button>
    <button id="stop3">Stop but finish</button>

    <p>The "Start" button starts the animation.</p><br>
      
    <p>The "Stop" button stops the current active animation, but allows the queued animations to be performed afterwards.</p><br>
      
    <p>The "Stop all" button stops the current active animation and clears the
      animation queue; so all animations on the element is stopped.</p><br>
      
    <p>The "Stop but finish" rushes through the current active animation, then it stops.</p><br>

    <div style="background:#98bf21;height:100px;width:200px;position:absolute;">HELLO</div>

  </body>
</html>
```



**.text()  /  .html()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .text()  /  .html() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("#btn1").click(function(){
          alert("Text: " + $("#test").text());
        });
        $("#btn2").click(function(){
          alert("HTML: " + $("#test").html());
        });
      });
    </script>


  </head>
  <body>

    <p id="test">This is some <b>bold</b> text in a paragraph.</p>

    <button id="btn1">Show Text</button>
    <button id="btn2">Show HTML</button>


  </body>
</html>
```



**.val()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .val() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("button").click(function(){
          alert("Value: " + $("#test").val());
        });
      });
    </script>


  </head>
  <body>

    <p>Name: <input type="text" id="test" value="Mickey Mouse"></p>

    <button>Show Value</button>

  </body>
</html>
```



**.attr()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .attr() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("button").click(function(){
          alert($("#w3s").attr("href"));
        });
      });
    </script>


  </head>
  <body>

    <p><a href="https://www.w3schools.com" id="w3s">W3Schools.com</a></p>

    <button>Show href Value</button>

  </body>
</html>
```



**Set text() / html() / val()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> set text / html / val </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("#btn1").click(function(){
          $("#test1").text("Hello world!");
        });
        $("#btn2").click(function(){
          $("#test2").html("<b>Hello world!</b>");
        });
        $("#btn3").click(function(){
          $("#test3").val("Dolly Duck");
        });
      });
    </script>


  </head>
  <body>

    <p id="test1">This is a paragraph.</p>
    <p id="test2">This is another paragraph.</p>

    <p>Input field: <input type="text" id="test3" value="Mickey Mouse"></p>

    <button id="btn1">Set Text</button>
    <button id="btn2">Set HTML</button>
    <button id="btn3">Set Value</button>

  </body>
</html>
```



**.append()** - 뒤쪽에 추가

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .append() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("#btn1").click(function(){
          $("p").append(" <b>Appended text</b>.");
        });

        $("#btn2").click(function(){
          $("ol").append("<li>Appended item</li>");
        });
      });
    </script>


  </head>
  <body>

    <p>This is a paragraph.</p>
    <p>This is another paragraph.</p>

    <ol>
      <li>List item 1</li>
      <li>List item 2</li>
      <li>List item 3</li>
    </ol>

    <button id="btn1">Append text</button>
    <button id="btn2">Append list items</button>

  </body>
</html>
```



**.prepend()** - 앞쪽에 추가

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .prepend() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("#btn1").click(function(){
          $("p").prepend("<b>Prepended text</b>. ");
        });
        $("#btn2").click(function(){
          $("ol").prepend("<li>Prepended item</li>");
        });
      });
    </script>


  </head>
  <body>

    <p>This is a paragraph.</p>
    <p>This is another paragraph.</p>

    <ol>
      <li>List item 1</li>
      <li>List item 2</li>
      <li>List item 3</li>
    </ol>

    <button id="btn1">Prepend text</button>
    <button id="btn2">Prepend list item</button>

  </body>
</html>
```



**.before()  /  .after()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .before()  /  .after() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("#btn1").click(function(){
          $("span").before("<b>Before </b>");
        });

        $("#btn2").click(function(){
          $("span").after("<i>After </i>");
        });
      });
    </script>


  </head>
  <body>

	<span>Hello</span>
    <br><br>

    <button id="btn1">Insert before</button>
    <button id="btn2">Insert after</button>

  </body>
</html>
```



**.remove()** - 선택한 요소를 포함하여 하위 요소들 까지 제거

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .remove() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      // remove()는 요소가 삭제된다
      $(document).ready(function(){
        $("#btn1").click(function(){
          $("#div1").remove();
        });

        $("#btn2").click(function(){
          $("p").remove(".test");
        });
      });
    </script>

    <style>
      .test {
        color: red;
        font-size: 20px;
      }
    </style>

  </head>
  <body>

    <div id="div1" style="height:100px;width:300px;border:1px solid black;background-color:yellow;">

      This is some text in the div.
      <p>This is a paragraph in the div.</p>
      <p>This is another paragraph in the div.</p>

    </div>
    <br>

    <button id="btn1">Remove div element</button>

    <p>This is a paragraph.</p>
    <p class="test">This is another paragraph.</p>
    <p class="test">This is another paragraph.</p>

    <button id="btn2">Remove all p elements with class="test"</button>

  </body>
</html>
```



**.empty()** - 선택한 요소의 하위요소들을 제거

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .empty() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      // empty()는 내용만 삭제된다
      $(document).ready(function(){
        $("button").click(function(){
          $("#div1").empty();
        });
      });
    </script>

  </head>
  <body>

    <div id="div1" style="height:300px;width:300px;border:1px solid black;background-color:yellow;">

      This is some text in the div.
      <p>This is a paragraph in the div.</p>
      <p>This is another paragraph in the div.</p>
      <h1>hello</h1>
    </div>
    
    <br>

    <button>Empty the div element</button>

  </body>
</html>
```



**.addClass()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .addClass() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("button").click(function(){
          $("#div1").addClass("important blue");
        });
      });
    </script>

    <style>
      .important {
        font-weight: bold;
        font-size: xx-large;
      }

      .blue {
        color: blue;
      }
    </style>

  </head>
  <body>

    <div id="div1">This is some text.</div>
    <div id="div2">This is some text.</div>
    <br>

    <button>Add classes to first div element</button>

  </body>
</html>
```



**.removeClass()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .removeClass() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("button").click(function(){
          $("h1, h2, p").removeClass("blue");
        });
      });
    </script>

    <style>
      .important {
        font-weight: bold;
        font-size: xx-large;
      }

      .blue {
        color: blue;
      }
    </style>

  </head>
  <body>

    <h1 class="blue">Heading 1</h1>
    <h2 class="blue">Heading 2</h2>

    <p class="blue">This is a paragraph.</p>
    <p>This is another paragraph.</p>

    <button>Remove class from elements</button>

  </body>
</html>
```



**.toggleClass()**

```html
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8" />
    <title> .toggleClass() </title>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>


    <script>
      $(document).ready(function(){
        $("button").click(function(){
          $("h1, h2, p").toggleClass("blue");
        });
      });
    </script>

    <style>
      .blue {
        color: blue;
      }
    </style>

  </head>
  <body>

    <h1>Heading 1</h1>
    <h2>Heading 2</h2>

    <p>This is a paragraph.</p>
    <p>This is another paragraph.</p>

    <button>Toggle class</button>

  </body>
</html>
```

