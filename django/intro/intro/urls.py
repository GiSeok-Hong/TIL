
from django.contrib import admin
from django.urls import path
from pages import views

# 경로를 설정하는 곳
urlpatterns = [
    path('admin/', admin.site.urls),
    path('index/', views.index),
    path('hola/', views.hola), # hola/ 라는 경로를 들어갔을 때 views.py 파일에서 hola 함수를 실행하겠다
    path('dinner/', views.dinner),
    path('hello/<str:name>/', views.hello), # <>의 default 값은 str이므로 str: 을 쓰지 않아도 된다.
    path('introduce/<name>/<int:age>/', views.introduce),
    path('times/<int:one>/<int:two>/', views.times),
    path('area/<int:r>/', views.area),
    path('template_language/', views.template_language),
    path('isbirth/', views.isbirth),
    path('throw/', views.throw),
    path('catch/', views.catch),
    path('lotto/', views.lotto),
    path('get/', views.get),
]
