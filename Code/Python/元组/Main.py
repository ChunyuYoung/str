"""
元组
类型: tuple
元组是不可修改的
"""

'初始化元组'
my_name = ("阳光下的少年", 17, 175)
print(type(my_name))

'定义空元组'
tuple_void = ()
print(type(tuple_void))

'定义包含单个元素的元组'
'数据类型:int'
tuple_single = (233)
print(type(tuple_single))

'''
定义一个只包含一个整数的元组
'''
info_tuple = (233,)
print(type(info_tuple))

'''
元组:
取值
取索引
统计某个元组出现的次数
统计元组的长度
'''
info_tuple_name = ("StringOD", 22, 175, "阳光下没有梦想的少年", 18, 170, "阳光下没有梦想的少年")
print("取值: %s " % info_tuple_name[0])
print("取索引: %d " % info_tuple_name.index("阳光下没有梦想的少年"))
print("统计包含某个元组的个数: %d" % info_tuple_name.count("阳光下没有梦想的少年"))
print("统计元组的长度: %d" % len(info_tuple_name))
print("\n")

# 使用迭代遍历元组
info_name = ("阳光下没有梦想的少年", 22, 175)
for my_info in info_name:
    '元组中保存的数据类型通常是不同的'
    print(my_info)

# 元组和格式化字符串
info_tuple_name_list = ("StringOD", 22, 175)
print("%s 今年 %d 身高是 %.2f" % ("StringOD", 22, 175))
# 格式化字符串后面的 () 本质上就是元组
print("%s 今年 %d 身高是 %.2f" % info_tuple_name_list)
info_str = "%s 今年 %d 身高是 %.2f" % info_tuple_name_list
print(info_str)

'''
列表是可以被修改的
元组是不可以被修改的
'''
name_list = [1, 2, 3, 4]
name = input("尝试着修改name_list列表的第一个元素:")
name_list[0] = name
print("修改后的列表: ", name_list)

my_name_tuple = (1, 2, 3, 4)
name_tuple = input("尝试着修改不可变的元组my_name_tuple: ")
print("输出元组的第一个元素: ", my_name_tuple[0])
'''
name_tuple[0] = name_tuple
print("修改不成功的元组: ", my_name_tuple)
'''

# 元组转换列表
print(type(my_name_tuple))
print(type(list(my_name_tuple)))

# 列表转换元组
print(type(name_list))
print(type(tuple(info_tuple_name_list)))
