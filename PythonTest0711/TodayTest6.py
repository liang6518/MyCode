#!e:\github代码库\MyCode\PythonTest0711 TodayTest6.py
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 10:27 AM
#    desc  :    习题6：字符串和文本
#				键入大量的字符串变量和格式化字符
#				并且将他们淡印出来，练习简写的变量名

#				加分题：
#				1、每一行加注解并解释其作用
#				2、找到所有的“字符串包含字符串的位置”，共四个
#				3、解释意思啊为什么w和e用+号连起来就能生成一个更长的字符串

#
#
#

print ("\n\n\n----------part one----------")
x = "There are %d ytpes pf people."%10
binary = "binary"
do_not = "don't"
y = "Those who know %s and those who %s."%(binary,do_not)
print (x)
print (y)
print ("I said: %r."%x)
print ("I said: %s."%y)
hilarious = false
joke_evaluation = "Isn't that joke so funny?! %r"
print (joke_evaluation % hilarious)
w = "This is the left side of..."
e = "a string with a right side."
print (w+e)


















