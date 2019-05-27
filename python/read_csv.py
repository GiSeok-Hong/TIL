# 1. string split

with open('lunch.csv', 'r', encoding='utf-8') as f :
    lines = f.readlines()
    for line in lines :
        # '양자강, 02-557-4211\n'
        # '양자강, 02-557-4211'
        # ['양자강, 02-557-4211']
        print(line.strip().split(',')) # 개행문자를 제거 (strip()), split(',') , 로 구분


# 2. csv
import csv
with open('lunch.csv', 'r', encoding='utf-8') as f :
    items = csv.reader(f)  #
    for item in items:
        print(item)