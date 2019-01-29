import mcpi.minecraft as minecraft
import time
mc = minecraft.Minecraft.create()   #连接服务器
while True:
    time.sleep(0.5)
    pos = mc.player.getTilePos()    #获取坐标
    if pos.x == -61 and pos.z == 109:
        mc.postToChat("Welcome to MyHome")
    if pos.x == -61 and pos.z == 108:
        mc.postToChat("Welcome to MyHome")
