import requests
from bs4 import BeautifulSoup
import lxml

html_url = requests.get("https://user.qzone.qq.com/2823847284/main")
html_text = html_url.text
html_code = BeautifulSoup(html_text, "lxml")
number = html_code.find("script")
text = ""
for list in number:
    text += "{}".format(number)
with open("code.txt", "w", encoding = "utf-8") as str:
    str.write(text)
