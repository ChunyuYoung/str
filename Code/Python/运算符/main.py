# 字符串重复n次
# 字典是不能重复的,因为键(key)必须是唯一的
print("hi" * 5)

# + 字符串连接符
print("hello" + "world")
print((1, 2) + (3, 4))
print([1, 2] + [3, 4])
'''
字典也不可以用+运算符连接/合并
print({"name1": "StringOD",
       "name2": "阳光下没有梦想的少年"} +
      {"name3": "阳光下的少年",
       "name4": "str233"})
TypeError: unsupported operand type(s) for +: 'dict' and 'dict'
类型错误:不受支持的操作和类型:“字典”和“字典”
'''
# .extend() 合并
name_list = [1, 2]
print(name_list.extend([3, 4]))

# in
'''
3 in (1,2,3)
成员运算符
判断 in 前面的 元素 是不是后面指定的序列的成员
'''
# 包含
print("a" in "alpha")
# 不包含
print("a" not in "second")
print(1 not in [0, 1, 2])
# 元素不包含not in 后面指定序列成员
print("a" in {"a": "laowang"})
