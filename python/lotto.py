import random

numbers = range(1, 46)

lotto = random.sample(numbers, 6)

print(lotto)
print(f'오늘의 행운의 번호는 {lotto} 입니다')
print(f'오늘의 행운의 번호는 {sorted(lotto)} 입니다')

#
# for i in range(0,5) :
#   lotto = random.sample(numbers, 6)
#   print(lotto)
# print("\n1등 가즈아!")