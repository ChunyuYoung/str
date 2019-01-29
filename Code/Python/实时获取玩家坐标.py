import mcpi.minecraft as minecraft
import time
mc = minecraft.Minecraft.create()   #½¨Á¢Á´½Ó
while True:
    time.sleep(1)
    pos = mc.player.getTilePos()
    mc.postToChat("X:"+str(pos.x)+" Y:"+str(pos.y)+" Z:"+str(pos.z))

