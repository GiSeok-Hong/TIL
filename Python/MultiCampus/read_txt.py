# Read Files

# 1. open()
# f = open('mulcam.txt', 'r')
# all_text = f.read()
# print(all_text)
# f.close()


# 2. with open()
with open('mulcam.txt', 'r') as f:
    lines = f.readlines() # List
    print(lines)    # ['1\n', '2\n', '3\n'] 이렇게 나온다
    for line in lines:
        print(line)   # print 에도 기본적으로 줄 바꿈이 있다.