#!e:\github代码库\MyCode\PythonTest0711 TodayTest678.py
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 10:27 AM
#    Desc  :    习题6：字符串和文本
#				键入大量的字符串变量和格式化字符
#				并且将他们淡印出来，练习简写的变量名
	
#				加分题：
#				1、每一行加注解并解释其作用
#				2、找到所有的“字符串包含字符串的位置”，共四个
#				
#				3、解释意思啊为什么w和e用+号连起来就能生成一个更长的字符串
#				w和e分别都赋值了字符串，所以显示的是连接后的字符串

#
#
#

print ("\n\n\n----------part one of test 6----------")
#将后面的字符串赋值给x，人群的种类用格式化字符串进行赋值
x = "There are %d ytpes pf people."%10
#赋值
binary = "binary"
#继续赋值
do_not = "don't"
#带格式化的赋值，第一个字符串包含字符串的位置
y = "Those who know %s and those who %s."%(binary,do_not)
#输出
print (x)
#输出
print (y)
#输出，第2，3个字符串包含字符串的位置
print ("I said: %r."%x)
print ("I said: %s."%y)
hilarious = False
#分别进行赋值，也是第四个字符串包含字符串的位置
joke_evaluation = "Isn't that joke so funny?! %r"
print (joke_evaluation % hilarious)
w = "This is the left side of..."
e = "a string with a right side."
#将两个字符串进行连接在输出，先将两个字符串分别赋值给变量，再把变量用+号进行连接后输出
print (w+e)

#
#
#

#    Note:    1、%r与%s有什么区别
#             %r用来debug比较好，因为它会显示变量的原始数据（raw data）
#             而其他的符号则是向用户显示输出的
#             2、注意第39行和第40行代码
#             先在前一行代码中留出来了%r的位置，在下一行输出时才把相应的位置字符串补充上								
#             3、在格式化字符串时%后接的不是加“”的字符串就得是赋值后的变量

print ("\n")
print ("\n\n\n----------part two of test 6----------")
i = "There are %d types of people."%10
lixueliang  = "lixueliang"
do_not_new = "don't"
j = "Those who know %s and those who %s."%(lixueliang,do_not_new)
print (i)
print (j)
print ("I said: %r."%i)
print ("I also said: %s"%j)
false = False
joke = "Isn't that joke so funny? %s"
print (joke % false)
a = "My name is %s"%lixueliang
b = "My brother's name is %s"%"lixuechao" 
print (a + b)

#
#
#

#!e:\github代码库\MyCode\PythonTest0711 TodayTest678.py
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 11:29 AM
#    Desc  :    习题7：打印

#               加分题：总结错误，在每一篇代码中添加解释文档和学到的编程知识，用note的形式体现出来	

#
#
#

print ("\n\n\n----------part one test 7----------")
print ("Mary hada a little lamb.")
print ("Its fleece was white as %s" % "snow")
print ("And everywhere that Mary went.")
#what's that do?
print ("." * 10)

end1 = "C"
end2 = "h"
end3 = "e"
end4 = "e"
end5 = "s"
end6 = "e"
end7 = "B"
end8 = "u"
end9 = "r"
end10 = "g"
end11 = "e"
end12 = "r"

#watch that comma at the end. try removing it to see what happens
print (end1 + end2 + end3 + end4 + end5 + end6,end7 + end8 + end9 + end10 + end11 +end12)
print (end1 + end2 + end3 + end4 + end5 + end6 + "\n" + end7 + end8 + end9 + end10 + end11 +end12)

#
#
#

#    Note:    1、想要输出换行时，对于\n需要加""号

#
#
#

#!e:\github代码库\MyCode\PythonTest0711 TodayTest678.py
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 11:54 AM
#    Desc  :    习题8：继续打印

#    Sup   :    加分习题：
#               1、最后一行程序中既有单引号又有双引号，即使他们是如何工作的
#               因为只有第三句话中间出现‘号。字符串中既可以有单引号也可以有双引号，单引号可以括双引号，双引号可以括单引号；
#               单不能扩单，双不能括双           

#
#
#

print ("\n\n\n----------part one of test 8----------")
formatter = "%r %r %r %r"
formatter_one = "%s\n%s\n%s\n%s\n"
formatter_two = "%r\n%r\n%r\n%r\n"
print (formatter % (1,2,3,4))
print (formatter % ("one","two","three","four"))
print (formatter % (True,False,False,True))
print (formatter % (formatter,formatter,formatter,formatter))
print (formatter_one % ("I had this thing.","That you could type up right.","But it didn't sing.","So I said goodnight."))
print (formatter_two % ("I had this thing.","That you could type up right.","But it didn't sing.","So I said goodnight."))

#
#
#

#    Note:    1、用了给变量赋值字符串的方式，打印时才会出现单引号

#
#
#

#!e:\github代码库\MyCode\PythonTest0711 TodayTest6789
#-*- coding utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 14:14 PM
#    Desc  :    习题9：接着打印

#    Sup   :    加分习题：
#               检查错误

#
#
#

print ("\n\n\n----------part one of test 9----------")
#Here's some new strange stuff, remember type it exactly.

days = "Mon Tue Wed Thu Fri Sat Sun"
months = "Jan\nFeb\nMar\nApr\nMay\nJun\nJul\nAug"

print ("Here are the days: ",days)
print ("Here are the months: ",months)

print ("""
There's something going here.
With the three double-quotes.
We'll be able to type as much as we like .
Even 4 line if we want, or 5, or 6.  
""")

#
#
#

#    Note:    null



















