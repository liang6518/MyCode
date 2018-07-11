#!e:\github代码库\MyCode\PythonTest0711 TodayTest.py
#-*- coding:utf-8 -*-

#    Auther:    lixueliang
#    Data  :    2018/7/11 09:49 AM
#    Desc  :    习题5:更多的变量与打印
#				键入更多的变量并将它们打印出来。
#				这次使用的是一个叫格式化字符串
#				（format string）的东西。每一次
#				使用都把一些文本引用起来，你就
#				建立了一个字符串。字符串是程序
#				将信息展示给人的方式。

#
#
#

print ("\n\n\n----------part one----------")
cars = 100
space_in_a_car = 4.0
drivers = 30
passengers = 90
cars_not_driven = cars - drivers
cars_driven = drivers
carpool_capacity = cars_driven * space_in_a_car
average_passengers_per_car = passengers / cars_driven
#cars = 100
#drivers = 30
#space_in_a_car = 4.0
#passengers = 90
#cars_not_driven = cars - drivers
#cars_driven = drivers
#carpool_capacity = cars_driven * space_in_a_car
#average_passengers_per_car = passengers / car_driven
#cars = 100
#drivers = 30
#passengers = 90
#space_in_a_car = 4.0
#cars_not_driven = cars - drivers
#cars_driven = drivers
#carpool_capacity = cars_driven * space_in_a_car
#average_passengers_per_car = passengers / cars_driven
print ("There are",cars,"cars available.")
print ("There are only",cars_driven,"drivers available.")
print ("There will be",cars_not_driven,"empty cars today.")
print ("We can transport",carpool_capacity,"people tpday.")
print ("We have",passengers,"passengers to carpool today.")
print ("We need to put about",average_passengers_per_car,"in each car.")
#
#
#
print ("\n\n\n----------part two----------")
print ("www.%s.com"%"baidu")
print ("%dkm"%1996)
#注意print输出前一定要先加（），输出的前半部分用“”引起来
print (("%s,%d,%f")%("lixuelaing",123,1.23))
#
print ("\n")
my_name = "Zed A.Shaw"
my_age = 35#not a lie
my_height = 74#inches
my_weight = 180#lbs
my_eyes = "Black"
my_teeth = "White"
my_hair = "Black"
print ("Let's talk about %s."%my_name)
print ("He's %d years oid."%my_age)
print ("He's %d inches tall."%my_height)
print ("He's %d pounds weight."%my_weight)
print ("He's a little heavy,do you think so?")
print ("As you see that,he got %s hair and %s eyes,are you loved him."%(my_hair,my_eyes))
print ("His teeth ara usually %s depending on the coffee."%my_teeth)
#This line is tricky,try to get it exactly right 
print ("If I add %d,%d,and %d then I get %d."%(my_age,my_height,my_weight,my_age+my_height+my_weight))
#
print ("\n")
name = "Zed A.Shaw"
age = 35#not a lie
height = 74#inches
weight = 180#lbs
eyes = "Black"
teeth = "White"
hair = "Black"
print ("Let's talk about %s."%name)
print ("He's %d years oid."%age)
print ("He's %d inches tall."%height)
print ("He's %d pounds weight."%weight)
print ("He's a little heavy,do you think so?")
print ("As you see that,he got %s hair and %s eyes,are you loved him."%(hair,eyes))
print ("His teeth ara usually %s depending on the coffee."%teeth)
#This line is tricky,try to get it exactly right 
print ("If I add %d,%d,and %d then I get %d."%(age,height,weight,age+height+weight))
#
print ("\n")
my_height = 74#inches
transfer_my_height = my_height * 2.54#cm
my_weight = 180.0#b 
transfer_my_weight = my_weight * 0.45359237#kg
print ("My height is %sinches or %scm."%(my_height,transfer_my_height))
print ("My weight is %fb or %fkg."%(my_weight,transfer_my_weight))
#
#
#
print ("%.2f\n%.2f"%(my_weight,transfer_my_weight))



















