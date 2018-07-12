
#!e:\github代码库\MyCode\PythonTest0712 TodayTest13
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/12 15:21 PM
#    Desc  :    习题13：参数、解包、变量
#               将变量传递给脚本（写的.py程序）。在命令python ***.py中，***.py就是参数部分
#               import是将python的功能引入到脚本的方法，需要什么功能就调用什么功能，使程序保持简洁。
#               argv是参数变量（argument variable）。这个变量包含了传递给python的参数
#               将每一个参数赋予一个变量名。解包的意思就是把argv中的东西解包，将所有的参数以此赋予左边的变量名
#               import引入的功能被称为模组（modules）也可以成为库

#    Sup   :    加分习题：
#               1、给脚本三个以下的参数查看错误信息并解释
#               2、分别编写接受较少变量和较多变量的脚本，变量名要有意义
#               3、与input混用得到更多的输入

#    Note  :    1、argv参数中，argv【0】第一个变量输出的是文件名，输入的参数之间用空格隔开
#               2、argv是啥sys的一个属性，它与input可以混合使用

#
#
#

print ("\n\n\n----------part one of test 13----------")

import sys
from sys import argv
script, first, second, third = argv
print ("The script is called: ", script)
print ("My first variable is: ", first)
print ("My second variable is: ", second)
print ("My third variable is: ", third)
#
print ("\n\n\n----------part two of test 13----------")

#one, two, three, four, five = argv
#print (one, "cat")
#print (two, "cat")
#print (three, "cat")
#print (four, "cat")
#print (five, "cat")

var_one = input()
print ("My name is %s:" % var_one)
var_two = input()
print ("My brother's name is %s:" % var_two)

#
#
#

#!e:\github代码库\MyCode\PythonTest0712 TodayTest1314.py
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/12 16:36 PM
#    Desc  :    习题14：提示和传递
#               


















































































