# Write File

# 1. open()
# f = open('mulcam.txt', 'w')  # 'w' : write, 'r' : read, 'a' : append
# for i in range(10):
#     f.write('Hello, Mulcam!\n')
#     f.write(f'Hello, Mulcam! {i}\r\n')
# f.close()    # open 을 했으면 close 도 해줘야함


# 2. with open()   # close를 안 해도 된다.
# with open('mulcam.txt', 'w') as f :
#     f.write('Hello, Mulcam!\n')

# 2-1. writelines
with open('mulcam.txt', 'w') as f:
    f.writelines(['1\n', '2\n', '3\n'])

# with : Context Manager

# \로 시작하는 문자 -> 이스케이프 시퀀스(문자)
# \n : 개행 문자
# \t : tab 문자
# \\ : 역실래쉬 문자
# \' : 따옴표 문자
# \" : 쌍따옴표 문자

"Let's go"
'Let\'s go'