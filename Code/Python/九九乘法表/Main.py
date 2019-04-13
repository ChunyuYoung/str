# 九九乘法表
row = 1

print("\t\t\t\t\t\t\t九九乘法表:\n")

while row <= 9:

    col = 1

    while col <= row:

        # print("*", end="")
        print("%d * %d = %d" % (col, row, col*row), end="\t")

        col += 1

    # print("%d" % row)
    print("")
    row += 1
