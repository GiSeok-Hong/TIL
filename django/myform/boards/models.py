from django.db import models
from django.conf import settings   # 190619 추가

class Board(models.Model):
    title = models.CharField(max_length=20)
    content = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    user = models.ForeignKey(settings.AUTH_USER_MODEL, on_delete=models.CASCADE)  # 190619추가
    # AUTH_USER_MODEL : 장고가 기본적으로 갖고 있는 유저 모델

    # blank 옵션은 좋아요를 누르지 않은 경우를 생각해서 True로 설정.
    like_users = models.ManyToManyField(settings.AUTH_USER_MODEL, related_name='like_boards', blank=True)

    def __str__(self):
        return f'글 번호 -> {self.id}, 글 제목 -> {self.title}, 글 내용 -> {self.content}'


class Comment(models.Model):
    content = models.CharField(max_length=100)
    user = models.ForeignKey(settings.AUTH_USER_MODEL, on_delete=models.CASCADE)  # 1 대 N 의 관계
    board = models.ForeignKey(Board, on_delete=models.CASCADE)
    # class Meta:
    #     ordering = ('-pk',)