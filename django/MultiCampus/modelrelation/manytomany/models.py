from django.db import models

# M:N 관계 테이블 생성

class Doctor(models.Model):
    name = models.CharField(max_length=20)

    def __str__(self):
        return f'{self.id}번 의사 {self.name}'

class Patient(models.Model):
    name = models.CharField(max_length=20)
    # doctors = models.ManyToManyField(Doctor, through='Reservation')
    # doctors = models.ManyToManyField(Doctor, through='Reservation', related_name='patients')
    # related_name 을 설정하면 역으로도 부르는게 가능...
    doctors = models.ManyToManyField(Doctor, related_name='patients')


    def __str__(self):
        return f'{self.id}번 환자 {self.name}'

# 중개모델
# class Reservation(models.Model):
#     doctor = models.ForeignKey(Doctor, on_delete=models.CASCADE)
#     patient = models.ForeignKey(Patient, on_delete=models.CASCADE)
#
#     def __str__(self):
#         return f'{self.doctor}의 {self.patient}'