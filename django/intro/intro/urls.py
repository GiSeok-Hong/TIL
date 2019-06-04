
from django.contrib import admin
from django.urls import path,include

# 경로를 설정하는 곳
urlpatterns = [
    path('utilities/', include(('utilities.urls'))), # utilities app으로 경로를 설정한다.
    path('pages/', include('pages.urls')),           # pagse app으로 경로를 설정한다.
    path('admin/', admin.site.urls),



]
