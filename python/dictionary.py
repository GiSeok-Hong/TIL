# 1. dict 생성
lunch = {
    '중국집': '02-'
}

lunch = dict(한식집='02-1') # 딕셔너리 생성

# 2. dict item 추가
lunch['분식집'] = '031-1'

# 3. dict value 가져오기
lunch = {'한식집': {'고갯마루' : '04-1', '순남시래기' : '05-1'}}

lunch['한식집'] #=> dict
lunch['한식집']['고갯마루'] #=> '04-1'

# 추가, dict 내부 자료형
# key -> string, integer, float, boolean
# value -> 모든 자료형(list, dict)

# 4. 딕셔너리 반복문 활용
lunch = {
    '한식집' : '01-1',
    '중식집' : '02-1',
    '일식집' : '03-1'
}
# 4-1 기본
for key in lunch:
    print(key)
    print(lunch[key])

# 4-2 key 반복
for key in lunch.keys():
    print(key)

# 4-3 value 반복
for value in lunch.values():
    print(value)

# 4-4 key, valus
for key, value in lunch.items():
    print(key)
    print(value)

