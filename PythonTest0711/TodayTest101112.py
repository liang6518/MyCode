
#!e:\github代码库\MyCode\PythonTest0711 TodayTest10.py
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 15:27 PM
#    Desc  :    习题10：还是打印

#    Sup   :    加分习题：
#               1、搜索所有的可用转义字符
#                  在第二部分的输出练习中，如果不加\转义字符，两个输出均会报错
#               2、使用三个单引号取代三个双引号
#                  输出没有区别
#               3、将转义序列和格式化字符串放到一起
#                  哈哈哈，做了呀
#               4、继续比较%r与%s的区别
#                  %r打印出来的是写在脚本里的内容，而%s打印的是应该看到的内容

#    Note  :    1、m和n字母打错了
#               2、\t的意思是转义输出一个tab键位

#
#
#

print ("\n\n\n-----------part one of test 10----------") 
x = "%r %r"
print (x % ("I don\'t like paly pcgame.","really?"))
print ("%r" % "I don\'t like paly pcgame.")
print ("%r" % "I don't lile paly pcgame.")
#
print ("\n\n\n-----------part two of test 10----------")
print ("I am 6'2\" tall.")
print ('I am 6\'2" tall.')
#
print ("\n\n\n----------part three of test 10----------")
tabby_cat = "\tI'm tabbed in."
persian_cat = "I'm split\non a line."
backslash_cat = "I'm \\ a \\ cat.miao~ miao~ miao~"

fat_cat = '''
I'll do a list:
\t* Cat food
\t* Fishies
\t* Catnip\n\t* Grass
'''

print (tabby_cat)
print (persian_cat)
print (backslash_cat)
print (fat_cat)

print ("\n\n\n----------part two of test 10----------")
cat_one = "I'm little one!"
cat_two = "I'm little two!"
cat_three = "I'm little three!"
cat_four = "I'm little four!"

print ("%r\n%r\n%r\n%r\n" % (cat_one,cat_two,cat_three,cat_four))
print ("%s\n%s\n%s\n%s\n" % (cat_one,cat_two,cat_three,cat_four))

#
#
#

#!e:\github代码库\MyCode\PythonTest0711 TodayTest1011.py
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 16:18 PM
#    Desc  :    习题11：开始进行输入值的练习
#               1、一般软件做的主要是三件事：接受用户的输入，改变用户的输入，输出改变了的输入
#               2、可能目前input的含义，先去练习

#    Sup   :    加分习题：、
#               1、查查raw_input实现的是什么功能
#                  接受控制台输入值的作用，将所有输入默认为自飞船进行处理，并返回字符串的类型
#               2、利用实例练习别的用法
#                  sys.stdin.readline(),使用之前一定要先引入相应的包才能使用该方法
#               3、为什么'6\'2"'中'需要被转义
#                  单引号需要被转义，从而防止使他被识别为字符串的结尾

#    Note  :    1、最后一行输出时，%d会出错，电脑显示器上键入的数字被默认作为字符串，应该用%r最保险
#               2、python3之后没有了raw_input()输入，直接用input()进行输入
#               3、输出的字符串后面加上，可以防止输入时换到下一行进行输入

#
#
#

print ("\n\n\n----------part one of test 11----------")

import sys

print ("How old are you?")
age = sys.stdin.readline()
print ("How tall are you?")
height = input()
print ("How much do you weight?")
weight = input()

print ("So you're %r years old, %r tall, %r heavy." % (age,height,weight))
print ("So you're %s years old, %s tall, %s heavy." % (age,height,weight))

#
#
#

#!e:\github代码库\MyCode\PythonTest0711 TodayTest101112
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 16:55 PM
#    Desc  :    习题12：提示别人
#               提示用户将要输入的内容

#    Sup   :    加分习题：
#               1、测试输入python -m pydoc input的作用
#                  前提是进入Python的安装目录：C:\Users\李学亮\AppData\Local\Programs\Python
#               2、输入q退出pydoc，查找pydoc命令是用来做什么的
#                  帮助文档，提示关键字的作用
#               3、使用pydoc查看open，file，和sys的含义，记下有意思的点就行了

#    Note  :    1、

#
#
#

print ("\n\n\n----------part one of test 11---------")
age = input("How old are you?")
height = input("How tall are you?")
weight = input("How much do you weight?")

print ("So, you are %s years old, %scm tall, %skg heavy.Oh, my god,you are perfect." % (age,height,weight))
