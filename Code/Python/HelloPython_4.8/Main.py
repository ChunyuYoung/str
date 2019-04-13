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
name_list_str.remove("str3")  # name_list_str.remove("str6") 会提示元素不在列表中
print(name_list_str)

# Python 对象引用
print("123 类型为:", type(123))
print("123 id为", id(123))

# 通过类对象来创建实例对象
print("类对象创建实例对象:%d" % (int(123)))

# 变量和对象的引用
abc_1 = 1
abc_2 = 2
# abc_3 = abc_1 + abc_2
# print("abc_1%d + abc_2%d = %d" % (abc_1, abc_2, abc_3))
print("%d + %d = %d" % (abc_1, abc_2, abc_1 + abc_2))

print("Abs:", abs(-123))

# 对象的值比较 == 和 引用判断 is
abc_q = "qq"
print(1 == 1)
print(1 is 1)
print(abc_q is "qq")
print(abc_q == "qq")

# 链式赋值
str = str233 = "123"
print("str:%s\t str233:%s" % (str, str233))

# 复合赋值语句
num_1 = 1
num_2 = 2
# +=
num_1 += num_2
print("num_1 += num_2 = %d" % num_1)
# -=
num_2 -= num_1
print("num_2 -= num_1 %d" % num_2)
# *=
num_1 *= num_2
print("num_1 *= num_2 = %d" % num_1)
# /=
num_2 /= num_1
print("num_2 /= num_1 = %d" % num_2)
# //= 整除
num_2 //= num_1
print("num_2 //= num_1 = %d" % num_2)
# %= 取模
num_2 %= num_1
'''
print("num_2 %= num_1 = %d" % num_2)
这么写解释器会报错
原因:%=不是格式控制符,说明解释器认为%=应该是一个格式控制符,但事实上他只是赋值操作符
解决方法: 表达式写到外部 或者 下面的写法
'''
print("num_2 %= num_1", num_2)
# **= 幂运算
num_1 **= num_2
print("num_1 **= num_2 = %d" % num_1)
# <<= 左移赋值
num_1 = 2
num_2 = 4
num_1 <<= num_2
print("num_1 <<= num_2 = %d" % num_1)
# >>= 右移赋值
num_1 >>= num_2
print("num_1 >>= num_2 = %d" % num_1)
# &= 按位于运算
num_1 &= num_2
print("num_1 &= num_2 = %d" % num_1)
# |= 按位异或运算
num_2 |= num_1
print("num_2 |= num_1 = %d" % num_2)
# ^= 按位异或赋值
num_2 ^= num_1
print("num_2 ^= num_1 = %d" % num_2)

# del 删除变量
x = 5
print("x = %d" % x)
del x
'''
print("删除变量之后: x = %d" % x)
这么写会报错
NameError: name 'x' is not defined
原因:解释器发现x并没有被定义,说明删除变量成功
'''
print("x变量 已被删除")

# 系列解包赋值
num_a, num_b, num_c = 1, 2, 3
print("num_a = %d\t num_b = %d\t num_c = %d" % (num_a, num_b, num_c))
num_d, num_e, num_f = (4, 5, 6)
print("num_d = %d\t num_e = %d\t num_f = %d" % (num_d, num_e, num_f))

# 常量 大写命名
STR = "str"
print("STR = %s" % STR)

# 表达式的组成
import math

# float .48f 貌似是最大支持长度
print("π值: %.48f" % math.pi)

# Python 运算符及其优先级
'''
lambda                  Lambda 表达式
or                      或
and                     与
not                     非
in, not in              成员测试
is, is not              同一性测试
<, <=, >, >=, !=, ==    比较
|                       按位或
^                       按位异或
&                       按位与
<<, >>                  移位
+, -                    加法与减法
*, /, %, //             乘法, 除法, 取余, 整数除法
+x, -x                  正负号
~x                      按位翻转
**                      指数幂
x.attribute             属性参考
x[index]                下标
x[index:index]          寻址段
f(arguments...)         函数调用
(expression,...)        绑定或元组显示
[expression,...]        列表显示
{key:datum,...}         字典显示
'expression,...'        字符串转换
'''

# Python 语句
import math  # 导入math模块

r = float(input("请输入圆的半径r: "))
p = 2 * math.pi * r  # 周长
s = math.pi * r ** 2  # 面积
print("圆的周长:", p)
print("圆的面积:", s)

# 续行符 在要换行的末尾空一格然后输入 续行符
print("Hello \
World")

# ; 用于在一行抒写多条语句
num_g = 1;
num_h = 2;
num_i = 3;
print(num_g, num_h, num_i);
print();
print(num_g + num_h + num_i)


# 空语句 pass
def null():
    pass;


# 调用空语句
null()


# 实例对象的创建和调用
'''
anObject = 类名(参数列表)
anObject.对象方法 或 anObject.对象属性
'''


class Person:
    @staticmethod
    def sayHello():
        print("StringOD")


# 实例化对象
p = Person
# 方法调用
p.sayHello()

# 2.9 模块和包
