print ("\n\n\n----------part one----------")
#A comment(注释) ,this is so you can read 
#your program later.
#python中#号的用法
#Anything after the # is ignored by python.
print("I could have code like this.")#and the 
#comment after is ignored
#You can also use a comment to "disable" or 
#comment out to a piece of code:
#print "This won't run."
print("This will run.")


print ("\n\n\n----------part two----------")
print ("I will now count my chickens")#我现在要数小鸡了
print ("Hens",25.0+30.0/6.0)#母鸡30
print ("Roosters",100.0-25.0*3.0%4.0)#公鸡97
print ("Now I will count the eggs:")#我现在马上数鸡蛋
print (3.0+2.0+1.0-5.0+4.0%2.0-1.0/4.0+6.0)#七个蛋//运算符与/运算符的区别要注意
print ("Is it true that 3+2<5-7?")#这个表达式正确吗
print (3.0+2.0<5.0-7.0)
print ("What is 3+2?",3.0+2.0)#3加2等于多少
print ("What is 5-7?",5.0-7.0)#5-7等于多少
print ("Oh.that's why it's false.")#原来坐错了呢
print ("How about some more.")#再多做写计算怎么样
print ("Is it greater?",5.0>-2.0)#5大于-2吗
print ("Is it greater or equal?",5.0>=-2.0)#5大于等于-2吗
print ("Is it less or equal?",5.0<=-2.0)#5小于-2吗


print ("\n\n\n----------part three----------")
#一共有100辆车
cars = 100
#每辆车可以坐4个人
space_in_a_car = 4.0
#有30个司机
drivers = 30
#有90个乘客
passengers = 90
#不能被驾驶的车辆
cars_not_driven = cars - drivers
#能够驾驶的车辆
cars_driven = drivers
#最多能够乘坐多少人
carpool_capacity = cars_driven * space_in_a_car
#每辆车上平均有多少乘客
average_passengers_per_car = passengers / cars_driven
print ("There are",cars,"cars available.")
print ("There are",drivers,"drivers available.")
print ("There will be",cars_not_driven,"empty cars today.")
print ("You can transport",carpool_capacity,"people today")
print ("We have",passengers,"to carpool today.")
print ("We need to put about",average_passengers_per_car,"people in each car")
#出现错误的原因是定义的是carpool_capacity而没有加分题中的_，所以显示变量没有被定义
print ('\n')
i = input()
j = input()
print ("i * j =",i * j)





































