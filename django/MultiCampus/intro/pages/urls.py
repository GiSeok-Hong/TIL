from django.urls import path
from . import views     # . 은 현재 디렉토리를 말한다.

urlpatterns = [
    path('index/', views.index),
    path('hola/', views.hola),  # hola/ 라는 경로를 들어갔을 때 views.py 파일에서 hola 함수를 실행하겠다
    path('dinner/', views.dinner),
    path('hello/<str:name>/', views.hello),  # <>의 default 값은 str이므로 str: 을 쓰지 않아도 된다.
    path('introduce/<name>/<int:age>/', views.introduce),
    path('times/<int:one>/<int:two>/', views.times),
    path('area/<int:r>/', views.area),
    path('template_language/', views.template_language),
    path('isbirth/', views.isbirth),
    path('throw/', views.throw),
    path('catch/', views.catch),
    path('lotto/', views.lotto),
    path('get/', views.get),
    path('lotto2/', views.lotto2),
    path('picklotto/', views.picklotto),
    path('art/', views.art),
    path('result/', views.result),
    path('user_new/', views.user_new),
    path('user_create/', views.user_create),
    path('static_example/', views.static_example),
]
