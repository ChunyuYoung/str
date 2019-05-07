
# 字典是一个无序的数据集合
# 输出的顺序和定义的顺序是不相同的
name_list = {"name1": "阳光下没有梦想的少年",
             "name2": "阳光下的少年",
             "name3": "StringOD"}

# 取字典中所有的键(key)
print(name_list.keys())

# 取值 指定取值的key
print(name_list["name1"])

# 增加键值对
name_list["name4"] = "阳光下没有基霸的少年"
print(name_list)

'''
如果要修改的键值对存在则修改
否则增加键值对
'''
# 修改
name_list["name1"] = "小丁丁"
print(name_list)

# 删除
name_list.pop("name4")
print(name_list)

# 统计键值对数量
print(len(name_list))

# 合并字典
temp_dict = {"height": 1.75}

# 如果被合并的字典中包含已有的键值对,会覆盖原有的键值对
name_list.update(temp_dict)
print(name_list)

# 清空字典
# print(name_list.clear())

# 遍历字典
# 变量i是每一次循环中,获取到的键值对中的key
for i in name_list:
    print("%s - %s" % (i, name_list))


# 列表字典
car_list = [
    {"StringOD": 22,
     "身高": 175},
    {"阳光下没有梦想的少年": 18,
     "身高": 170}
]
print(car_list)

# 字符串
str1 = '羊的外号是"羊噶"'
print(str1)
# 字符串索引输出
print(str1[0])
print()             # 换行
# 字符串子串遍历输出
'''
i = 0
for k in str1:
    print(str1[i])
    i += 1

'''
for k in str1:
    print(k)

# 统计字符串长度
print(len(str1))

# 统计字符串中子串出现的次数
print(str1.count("羊"))

# 判断字符串中的子串出现的位置
print(str1.index("的"))

# 字符串判断方法
# 字符串判空
print(str1.isspace())
print(" ".isspace())

# 判断字符串中是否只包含数字
num_str = "1"
print(num_str)
# 判断是否是纯数字
print(num_str.isdecimal())
# 判断是否是纯数字和unicode
print(num_str.isdigit())
# 判断是否是纯数字和unicode和中文的数字
print(num_str.isnumeric())
print()

# 分割线
for i in range(1, 10):
    print("-", end="")
print()

hello_str = "hello world"
# 判断是否以指定字符串开始
print(hello_str.startswith("Hello"))
print(hello_str.startswith("hello"))
# 判断是否以指定的字符串结束
print(hello_str.endswith("world"))
# 查找指定字符串
print(hello_str.find("llo"))
# 替换字符串
# 不会修改原始字符串的内容
print(hello_str.replace("world", "python"))

# 字符串对齐
song = [
    "断裂的心轨",
    "歌手:洛天依",
    "",
    "一个人",
    "走在路边",
    "街上的灯已照亮屋檐",
    "独自在",
    "人群之中寻找",
    "那天",
    "我们的约定的地点",
    "又回到",
    "最初的起点",
    "相知相识的一天",
    "答应过",
    "和你一起寻找",
    "那神秘的地平线",
    "那天(那天)",
    "湖边(湖边)",
    "寻找星星散落的地点",
    "时间(时间)",
    "来年(来年)",
    "终于愿望到达了终点",
    "...",
    "我不明白",
    "为何我们要分开",
    "我的存在",
    "就这么不值得你等待",
    "为什么走了",
    "为什么忘了",
    "最初的约定",
    "难道就是你的背影",
    "我不离开",
    "因为那记忆还在",
    "却永远无法倒退时代",
    "知道我想起了",
    "知道我明白了",
    "曾经寻找的",
    "原来是你最痛苦的回忆",
    "还记得",
    "那年夏天",
    "坐在提堤坝的笑脸",
    "迎着风",
    "在我身旁依着",
    "思念渐渐入眠",
    "曾经的风景已变",
    "房屋翻新的一遍又一遍",
    "但不管在城市之中哪边",
    "吹过的风不会变",
    "心愿(心愿)",
    "祈愿(祈愿)",
    "慢慢洒落在人间",
    "落叶...",
    "枯灭...",
    "终究回归了地面",
    "...",
    "我不明白",
    "为何我们要分开",
    "我的存在",
    "就这么不值得等待",
    "为什么走了",
    "为什么忘了",
    "最初的约定",
    "难道就是你的背影",
    "我不明白",
    "因为那情感还在",
    "只是还在",
    "却永远无法再一次循环",
    "但是我还记得",
    "永远都会记得",
    "曾经与你最快乐的记忆",
    "啊~~~~~"
]
for song_start in song:
    # print("|%s|" % song_start.center(10, "　"))
    # print("|%s|" % song_start.rjust(10, " "))
    print("|%s|" % song_start.ljust(10, " "))

# 去除空白字符
'''
string.lstrip() 去除左边的空格
string.rstrip() 去除右边的空格
string.strip()  左右两边的空格
'''
print(hello_str.strip())
print(hello_str.lstrip())
print(hello_str.rstrip())

list_name = [
    "\nstr233\t",
    "StringOD\n"
]
for i in list_name:
    print(i.strip())

# 字符串的拆分和连接
# 拆分
str2 = "阳光下没有梦想的少年\t, 阳光下的少年\t, \nStringOD\t"
list_str = str2.split()
print(list_str)
# 合并
print("".join(list_str))

# 字符串切片
# 字符串[开始索引:结束索引:步长]
# 字符串的切片结果并不包含结束的索引
# 索引是从1开始并不是0
# 截取从 2-5 位置的字符串
str_num = "0123456789"
print(str_num[2:6])
# 截取从 2-末尾 的字符串
print(str_num[2:])
# 截取从 开始-5 位置的字符串
print(str_num[:6])
# 截取完整的字符串
print(str_num[:])
# 从开始位置,每个一个字符截取字符串
print(str_num[:2])
# 从索引1开始,每隔一个取一个
print(str_num[0::2])
# 截取 2-末尾-1的字符串
print(str_num[2:-1])
# 截取字符串末尾两个字符
print(str_num[-2:])
# 字符串的逆序
print(str_num[::-1])
