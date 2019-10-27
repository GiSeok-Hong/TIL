# 2019/05/24

import requests
import bs4


# 국내증시에서 코스피지수 가져오기


# 가져올 페이지 주소를 get() 안에 넣는다.
res = requests.get("https://finance.naver.com/sise/").text        # <Response [200]>  -> 정상적으로 작동한다는 의미

#print(res)

text = bs4.BeautifulSoup(res, 'html.parser')

# chrome -> 검사 -> copy -> copy selector 를 하면 #KOSPI_now 가 복사가 됨
kospi = text.select_one('#KOSPI_now')
print(kospi)
print(kospi.text)   # 코드는 빼고 내용만 가져온다


res2 = requests.get('https://finance.naver.com/marketindex/').text
text2 = bs4.BeautifulSoup(res2, 'html.parser')
usd = text2.select_one('#exchangeList > li.on > a.head.usd > div > span.value')

print(usd)
print(usd.text)