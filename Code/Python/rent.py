import mcpi.minecraft as minecraft
import time
mc = minecraft.Minecraft.create()
# x:-65 y:-1 z:110
# x:-60 y:-1 z:114
X1 = -65
Z1 = 110
X2 = -60
Z2 = 114
HOME_X = -65
HOME_Y = 16
HOME_Z = 108
rent = 0
inField = 0
while True:
    time.sleep(1)
    pos = mc.player.getTilePos()
    #if pos.x>X1 and pos.x<X2 and pos.z>Z1 and pos.z<Z2:
    if pos.x<X1 and pos.x<X2 and pos.z>Z1 and pos.z<Z2:
        rent = rent + 1
        mc.postToChat("你的租金为:"+str(rent))
        inField +=1
    else:
        mc.postToChat("不在区域内")
        inField = 0
    if inField>3:
        mc.postToChat("超时")
        mc.player.setPos(HOME_X,HOME_Y,HOME_Z)
