from django.urls import path
from . import views

# app_name 대소문자 구분한다.
app_name = 'boards'

# 경로 마지막에 / 이 반드시 들어가야한다.
urlpatterns = [
    path('', views.index, name='index'),
    path('new/', views.new, name='new'),
    path('<int:board_pk>/', views.detail, name='detail'),
    path('<int:board_pk>/delete/', views.delete, name='delete'),
    path('<int:board_pk>/edit/', views.edit, name='edit'),
    path('<int:board_pk>/comment/', views.comment_create, name='comment_create'),
    path('<int:board_pk>/comment/<int:comment_pk>/delete/', views.comment_delete, name='comment_delete'),
    path('<int:board_pk>/comment/<int:comment_pk>/edit/', views.comment_edit, name='comment_edit'),
]
