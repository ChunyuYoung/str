# -*- coding: cp936 -*-
# Adventure 1: HelloMinecraftWorld.py

# From the book: "Adventures in Minecraft"
# written by David Whale and Martin O'Hanlon, Wiley, 2014
# http://eu.wiley.com/WileyCDA/WileyTitle/productCd-111894691X.html

import mcpi.minecraft as minecraft      #导入minecraft模块
mc = minecraft.Minecraft.create()       #与正在运行的Minecraft建立链接
mc.postToChat("Hello Minecraft World!") 
pos = mc.player.getTilePos()            #获取玩家坐标
print("获取当前玩家坐标:")
print("X:"+str(pos.x)+" Y:"+str(pos.y)+" Z:"+str(pos.z))    #在终端中显示玩家坐标
mc.postToChat("X:"+str(pos.x)+" Y:"+str(pos.y)+" Z:"+str(pos.z))
#print("x:"+pos.x)


