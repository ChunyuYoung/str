import mcpi.minecraft as minecraft
import time
mc = minecraft.Minecraft.create()   #���ӷ�����
while True:
    time.sleep(0.5)
    pos = mc.player.getTilePos()    #��ȡ����
    if pos.x == -61 and pos.z == 109:
        mc.postToChat("Welcome to MyHome")
    if pos.x == -61 and pos.z == 108:
        mc.postToChat("Welcome to MyHome")
