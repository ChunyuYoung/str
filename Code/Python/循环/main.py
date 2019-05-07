# for 循环
for num in [1, 2, 3]:
    print(num)
    if num == 2:
        break
else:
    print("あお")
for line in range(1,11):
    print("=",end="")
print()

number = [1, 2, 3, 4]
for num_number in number:
    print(num_number)
    if num_number == 2:
        print(True)
    else:
        print(False)

# 完整的for循环
for i in range(1, 5):
    print(i, end="")
else:
    print("\n当i遍历完成之后,我会被执行")
'''
如果在for循环中内嵌一个if else语句
如果if语句每次执行else语句也会被每次执行
但是在for循环语句下加上else则是在内嵌的if全部得不到想要的结果时才会在for循环下的else执行
'''
name_list = [1, 2, 3]
for select in name_list:
    if select == 4:
        break
else:
    print("没有找到-->4<--")

# 202