from django.db import models
from django.conf import settings   # 190619 추가

class Board(models.Model):
    title = models.CharField(max_length=20)
    content = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    user = models.ForeignKey(settings.AUTH_USER_MODEL, on_delete=models.CASCADE)  # 190619추가
    # AUTH_USER_MODEL : 장고가 기본적으로 갖고 있는 유저 모델

class Comment(models.Model):
    content = models.CharField(max_length=100)
    user = models.ForeignKey(settings.AUTH_USER_MODEL, on_delete=models.CASCADE)  # 1 대 N 의 관계
    board = models.ForeignKey(Board, on_delete=models.CASCADE)
    # class Meta:
    #     ordering = ('-pk',)