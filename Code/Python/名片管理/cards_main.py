import cards_tools
# TODO StringOD

while True:
    cards_tools.system_menu()
    str_input = input("请输入对应的序号:")
    if str_input == "1":
        cards_tools.new_card()
    elif str_input == "2":
        cards_tools.show_cards()
    elif str_input == "3":
        pass
    else:
        pass
# 216
