import requests
import random
from decouple import config

token = config('TELE_TOKEN')   # 텔레그램 토큰
api_url = f'https://api.telegram.org/bot{token}'
chat_id = config("CHAT_ID")  # 본인 telegram 계정 id
#text = input('메시지를 입력하세요: ')   # '안녕하세요 좋은 하루 되시길!'
text = random.sample(range(1,46), 6)

response = requests.get(f'{api_url}/sendMessage?chat_id={chat_id}&text={text}')













