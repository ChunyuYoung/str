# Hello World
print("Hello World\n")

'''
Hello 
        Python
'''

print("Hello Python\n")

# while
a = 0
print("while")
while a < 5:
    a += 1
    print("%d" % a, end=" ")

# if else
print("\nif else")
b = 0
if b == 1:
    print("true")
else:
    print("false")

# for
c = 0
print("\nfor")
for c in range(1, 5):
    print("%d" % c, end=" ")
print()

# 列表
name_list = ["one", "two", "three"]

# 插入
print("插入元素str:", name_list.insert(0, "str"), "更改后的列表:", name_list)

# 移除
print("移除元素three", name_list.remove("three"), "更改后的列表:", name_list)

# 修改
print("修改元素str为StringOD", name_list.pop(0), name_list.insert(0, "StringOD"), "更改后的列表:", name_list)

# 末尾追加
print("末尾追加:", name_list.append("str233"), "更改后的列表:", name_list)


# 函数定义
'''
选中函数 会显示黄色小灯泡 点击插入文档注释
在使用这个自定义函数 或者 使用第三方,官方的函数时选中函数 按下 Ctrl+Q 显示文档注释
'''


# 函数上面和下面如果有代码则必须空两行,否则不符合代码规范
def strInteger(str):
    """字符串转换整数

    :param str: 接收字符串
    :return: 返回整数
    """
    return int(str)


# 函数调用
inte = strInteger(input("请输入一个整数"))
print(inte, "类型:", type(inte))


# len(length 长度) 函数可以统计列表中元素的总数
name_list_str = ["str1", "str2", "str3", "str1"]
list_len = len(name_list_str)
print("列表中包含 %d 个元素" % list_len)

# count 方法可以统计列表中某一个数据出现的次数
count = name_list_str.count("str1")
print("str1 出现了 %d 次" % count)

# 从列表中删除第一次出现的数据,如果数据不存在,程序会报错
name_list_str.remove("str3")    # name_list_str.remove("str6") 会提示元素不在列表中
print(name_list_str)
