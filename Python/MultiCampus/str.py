# String Interpolation

# a = '123'
#
# new_a = f'{a}'

# 1. 옛날 방식
# '%s %s' % ('one', 'two')  #=> 'one, two'

# 2. Pyformat
# '{} {}'.format('one', 'two') #=> 'one, two'

# name = '홍기석'
# eng_name = 'Hong'
# print('안녕하세요, {}입니다. My name is {}.'.format(name, eng_name))
# print('안녕하세요, {0}입니다. My name is {1}.'.format(name, eng_name))
# print('안녕하세요, {1}입니다. My name is {0}.'.format(name, eng_name))

# 3. F-string
# a, b = 'one', 'two'
# f'{a}{b}' #=> 'one two'

name1 = '홍길동'

print(f'안녕하세요, {name1}입니다.')