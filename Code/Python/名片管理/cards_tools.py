card_list = []


def system_menu():
    """系统菜单"""
    print("=" * 50)
    print("欢迎使用 [名片管理系统] V1.0")
    print("1. 新建名片")
    print("2. 显示全部")
    print("3. 查询名片")
    print("0. 退出系统")
    print("=" * 50)


def new_card():
    """新建卡片"""
    name = input("请输入名字: ")
    age = input("请输入年龄: ")
    qq = input("请输入QQ: ")
    email = input("请输入email: ")

    card_dict = {"name": name,
                 "age": age,
                 "qq": qq,
                 "email": email}
    card_list.append(card_dict)


def show_cards():
    for card in ["姓名", "年龄", "扣扣", "邮箱"]:
        print(card.lstrip(), end="\t\t")
    print()
    for card_dict in card_list:
        print("%s\t\t%s\t\t%s\t\t%s" % (card_dict["name"], card_dict["age"], card_dict["qq"], card_dict["email"]))


def search_cards():
    found_str = input("输入要查询的姓名: ")
