# -*- coding: cp936 -*-
# Adventure 1: HelloMinecraftWorld.py

# From the book: "Adventures in Minecraft"
# written by David Whale and Martin O'Hanlon, Wiley, 2014
# http://eu.wiley.com/WileyCDA/WileyTitle/productCd-111894691X.html

import mcpi.minecraft as minecraft      #����minecraftģ��
mc = minecraft.Minecraft.create()       #���������е�Minecraft��������
mc.postToChat("Hello Minecraft World!") 
pos = mc.player.getTilePos()            #��ȡ�������
print("��ȡ��ǰ�������:")
print("X:"+str(pos.x)+" Y:"+str(pos.y)+" Z:"+str(pos.z))    #���ն�����ʾ�������
mc.postToChat("X:"+str(pos.x)+" Y:"+str(pos.y)+" Z:"+str(pos.z))
#print("x:"+pos.x)


