# Python 内置函数
# len() 计算容器元素的个数
str_1 = "01234567899"
print(len(str_1))
# del() 删除元素或者变量
a = 1
print(a)
del a
a = [1, 2, 3]
print(a)
del(a[0])
print(a)
# max() 返回容器中元素最大值
print(max(1, 2))
print(max("a", "b"))
# min() 返回容器中元素最小值
print(min(1, 2))
print(min("a", "z"))
# 字典并不能比较大小
print([0, 1, 2, 3][1:3])
print((0, 1, 2, 3)[1:3])
'''
print({"a": "a", "b": "b"}[:2])
TypeError: unhashable type: 'slice'
类型错误: 不支持'切片'
'''
