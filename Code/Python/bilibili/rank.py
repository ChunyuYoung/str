# author: StringOD
# update: 2019.5.2
# brief: 来源 bilibili [憧憬少]

import requests
from bs4 import BeautifulSoup
import lxml

response = requests.get("https://www.bilibili.com/ranking/all/1/1/3/", )
'''
request()返回一个状态
如果返回值是404则为找不到网页
'''
html = response.text
soup = BeautifulSoup(html, 'lxml')
# print(soup.prettify())
a = soup.find("a", class_ = "title")
a_list = soup.findAll("a", class_ = "title")
# a_list = soup.find_all("a", class_ = "tittle")

count = 0
text = ""
for list in a_list:
    count += 1
    text += "{} {}\n".format(count, list.string)
    print(count, list.string)

# 保存到文件
with open("rank.txt", "w", encoding="utf-8") as fout:
    fout.write(text)
