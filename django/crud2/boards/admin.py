from django.contrib import admin
from .models import Board, Comment

class BoardAdmin(admin.ModelAdmin):
    list_display = ('id', 'title', 'content', 'created_at', 'updated_at', )

admin.site.register(Board, BoardAdmin)

class CommentAdmin(admin.ModelAdmin):
    list_display = ('content', 'created_at', 'updated_at',)

admin.site.register(Comment, CommentAdmin)


# pip install django-extensions     django shell 을 좀 더 편하게 사용하기 위해 설치   app 등록도 해야함
# python manage.py shell_plus
