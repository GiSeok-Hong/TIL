import pyautogui as pag   # 마우스를 조작할 수 있게 하는 패키지
import random, time, subprocess

summons_button = {
    'top_left': {
        'x': 1593,
        'y': 302
    },
    'bottom_right': {
        'x': 1680,
        'y': 430
    }
}






# pyautogui.moveTo() : duration 동안 (x,y) 좌표로 이동
# random.uniform(a,b) : a 보다 크고 b 보다 작은 랜덤한 숫자 생성
# while True:
#     duration = random.uniform(0.5, 1.5)
#     pag.moveTo(
#         x=random.uniform(summons_button['top_left']['x'], summons_button['bottom_right']['x']),
#         y=random.uniform(summons_button['top_left']['y'], summons_button['bottom_right']['y']),
#         duration=duration
#     )

# # 마우스 버튼을 누른다
# pag.mouseDown()
#
# # t초 만큼 딜레이를 준다.
# time.sleep(random.uniform(0.15001, 0.3001))
#
# # 마우스 버튼을 놓는다
# pag.mouseUp()
#
# time.sleep(random.uniform(0.32001, 0.41001))





# while True:
#     x, y = pag.position()   # 현재 마우스 커서의 좌표 받아오기
#     print('x: %s, y: %s' % (x,y))