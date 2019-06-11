from django.db import models

class Board(models.Model):
    title = models.CharField(max_length=20)  # 제목은 최대 20자까지
    content = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True) # 최초 생성한 시각
    updated_at = models.DateTimeField(auto_now=True) # 수정한 시각

    def __str__(self):  # -> __ 함수명 __ 이러한 형태의 메소드는 매직메소드라고 한다.
        return f'{self.id}번글 - {self.title} : {self.content}'

# 댓글 달기를 위한 class 선언
class Comment(models.Model):
    content = models.CharField(max_length=200)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    board = models.ForeignKey(Board, on_delete=models.CASCADE)

    def __str__(self):
        return f'<Board{self.board_id}: Comment({self.id} - {self.content})>'


# python manage.py shell_plus

#  board.comment_set.all()