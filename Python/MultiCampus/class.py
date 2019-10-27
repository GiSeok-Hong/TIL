class Person:
    name = '사람의 고유한 속성'
    age = '출생 이후부터 삶을 마감할 때까지의 기간'

    def greeting(self): # 일반적으로 method를 정의하면 self(인스턴스 자기자신) 인자가 기본적으로 사용된다.
        print(f'{self.name}이(가) 인사합니다. 안녕하세요!')

    def eating(self):
        print(f'{self.name}은(는) 밥을 먹고 있습니다.')

    def aging(self):
        print(f'{self.name}은(는) 현재 {self.age}살이고 현재 나이를 먹어가는 중입니다.')

HongGi = Person()  # Person이라는 class에서 HongGi라는 인스턴스 생성
print(HongGi.name)  # -> 사람의 고유한 속성
print(HongGi.age)   # -> 출생 이후부터 삶을 마감할 때까지의 기간
HongGi.name = 'HongGi'
HongGi.age = 29
print(HongGi.name)  # -> HongGi
print(HongGi.age)   # -> 29
HongGi.greeting()   # -> HongGi이 인사합니다. 안녕하세요!
HongGi.eating()     # -> HongGi은 밥을 먹고 있습니다.
HongGi.aging()      # -> HongGi은 현재 29살이고 현재 나이를 먹어가는 중입니다.


