from django.db import models

class Board(models.Model):
    title = models.CharField(max_length=20)  # 제목은 최대 20자까지
    content = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True) # 최초 생성한 시각
    updated_at = models.DateTimeField(auto_now=True) # 수정한 시각