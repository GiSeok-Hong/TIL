# Generated by Django 2.2.1 on 2019-06-12 14:10

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('boards', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='board',
            name='content',
            field=models.TextField(),
        ),
    ]