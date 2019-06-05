# 대장 urls
from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('boards/', include('boards.urls')),  # boards 라는 app으로 가서 거기에 있는 urls를 참고하겠다.
    path('admin/', admin.site.urls),
]
