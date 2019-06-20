from django.db import models

class User(models.Model):
    name = models.CharField(max_length=20)

    def __str__(self):
        return f'{self.name}'

class Board(models.Model):
    title = models.CharField(max_length=20)
    user = models.ForeignKey(User, on_delete=models.CASCADE)

    def __str__(self):
        return f'{self.title}'

class Comment(models.Model):
    content = models.CharField(max_length=20)
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    board = models.ForeignKey(Board, on_delete=models.CASCADE) # 하나의 게시글이 삭제되면 그 게시글을 참조하는 댓글들 모두 삭제

    def __str__(self):
        return f'{self.content}'
