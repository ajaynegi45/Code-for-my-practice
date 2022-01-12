# def sleep_in(weekday, vacation):
#   if not weekday or vacation:
#     return True
#   else:
#     return False
# message = "Hello Python world!"
# print(message)
# message = "Hello Python Crash Course world!"
# print(message)


""" Who can vote on behalf him/her age"""
# age = int(input('Enter Your Age '))
# if age > 18:
#     print('You Can Vote because you above 18')
# elif age == 18:
#     print(' You Can Vote because you are 18')
# else:
#     print('You Cannot Vote')
# print('')


""" Remainder Finding """
# a = 13
# b = 2
# print ("Remainder is ", a%b)


''' Finding the average of two Numbers '''
# a = int(input("enter the first no "))
# b = int(input("enter the second no "))
# Average = (a + b)/2
# print ("The Average is ", Average)


''' Finding the Square of any Number eg:- 12² is 144'''
# a = int(input("enter the first no "))
# Square = (a * a)
# print ("The Average is ", Square)


''' Say GoodAfternoon with Name '''
# a = input("Enter your name\n")
# print("Good Afternoon,", a)


''' Small Letter format'''
# letter = '''Dear Name,
# thanks and regards,
# Bill
# Date: aajkidate'''
# name = input("Enter Your Name ")
# date = input("Enter Your Date ")
# letter = letter.replace("Name", name)
# letter = letter.replace("aajkidate", date)
# print(letter)


""" Letter Format """
# letter = '''
# To,
# The Principal
# <school name>

# Subject <write subject>

# Respectfully, I want to request in esteemed position to that, I have been came down with <problem> since last day. Our family specialist has advised my parents about complete rest.

# Taking my above mentioned condition in your kind views, kindly grant me leave from ( <Leave date> )

# I shall be gratefull to you.

# blessing you.
# your's Obediently
# <Your Name>
# <Class>
# <Roll No.>
# '''
# schoolname = input("Enter Your School Name ")
# b = input("Enter Your Write Subject ")
# c = input("Enter Your problem ")
# d = input("Enter Your Leave date ")
# e = input("Enter Your Your Name ")
# f = input("Enter Your Class ")
# g = input("Enter Your  Roll No. ")

# letter = letter.replace("<school name>", schoolname)
# letter = letter.replace("<write subject>", b)
# letter = letter.replace("<problem>", c )
# letter = letter.replace("<Leave date>", d)
# letter = letter.replace("<Your Name>", e )
# letter = letter.replace("<Class>", f )
# letter = letter.replace("<Roll No.>", g)
# print(letter)
''' Letter Format End Here'''


''' .find function is use to find something in paragraph 
In below para .find is finding double space in papa'''
# para = " hello my name is ajay negi.  how are you bro."
# para = para.find("  ")
# print(para)


''' Reverse List '''
# l1 = [ , 8, 7, 2, 21, 15]
# l1.reverse()
# print(l1)


''' Making Fruits List '''
# fruits_1 = input("Enter the fruits name 1: ")
# fruits_2 = input("Enter the fruits name 2: ")
# fruits_3 = input("Enter the fruits name 3: ")
# fruits_4 = input("Enter the fruits name 4: ")
# fruits_5 = input("Enter the fruits name 5: ")
# fruits_6 = input("Enter the fruits name 6: ")

# My_fruits_list = (fruits_1, fruits_2, fruits_3, fruits_4, fruits_5, fruits_6)
# print(My_fruits_list)


'''Mark of student'''
# mark_1  = int(input("Enter the marks of student number 1:  "))
# mark_2  = int(input("Enter the marks of student number 2:  "))
# mark_3  = int(input("Enter the marks of student number 3:  "))
# mark_4  = int(input("Enter the marks of student number 4:  "))
# mark_5  = int(input("Enter the marks of student number 5:  "))

# mylist = [ mark_1, mark_2, mark_3, mark_4, mark_5, ]
# mylist.sort()
# print(mylist)


""" count the no. of zeros in tuple"""
# a = [ 7, 0, 8, 0, 0, 9]
# data = a.count(0)
# print(data)


''' small dic finding the key(march) Value'''
# a = { "Ajay": "Negi",
#     "March": "2004"
# }
# print(a.get("March"))


"""Making my own Dictionary"""
# mydic = {
#     "talk": " बातचीत ",
#     "laptop": " लैटोप ",
#     "bed": "बिस्तर",
#     "Minakshi": "देवी पार्वती",
#     "Nisha": "Cow,गाय"
# }
# a = input(" Enter Your English Words\n")
# print(" The Meaning is  ", mydic.get(a))


"""Making Dictionary by your enter words"""
# favlan = {}
# a = input(" Enter your language Ajay\n")
# b = input("Enter your language Nisha \n")
# favlan['Ajay'] = a
# favlan['Nisha'] = b
# print(favlan)


"""if else problem"""
# a = int(input("Enter Your Age\n"))
# if(a<18):
#     print("you are below 18")
# elif(a>18):
#     print("you are above 18")
# else:
#     print("congratulations are 18 year's Old")


"""bloon"""
# age = int(input("Enter Your Age\n"))
# if(age>=18 and age<=20):
#     print("You Can Work With Us")
# else:
#     print("You Can't work with us")


""" Greeting person which are store in database """
# l1 = ["Ajay", "Nisha", "Minakshi", "Shobha"]
# for name in l1:
#     if name.startswith("S"):
#         print("Hello " + name)


""" Fnding whether a given number is prime or not"""
# num = int(input("Enter the Number\n"))
# prime = True
# for i in range (2, num):
#     if(num%i == 0):
#         prime = False

# if prime:
#     print ("This is a Prime Number")
# else:
#     print("This is not a Prime Number")


''' Print Star '''
# n = int(input("Enter the number of star you want to print: "))
# for i in range(n):
#     print("*" * (n-i))


''' Convert cm into Inches '''
# number = int(input(" Enter the number: \n"))
# inche = ( number / 2.54)
# print("The inche is",inche)



''' convert Celsius into fahrenheit (0°C x 9/5) + 32'''
# C = int(input("Enter the temperature into celsius:\n"))
# fahrenheit = ( C ) * 9/5 + 32 
# print(fahrenheit)



''' Snake water or gun Game '''
# import random
# def gamewin(comp, you):
# # if two values are equal, declare tie 
#     if comp == you:
#         return None
# # check for all possiblities  when computer choose snake  
#     elif comp == 'S':
#        if you == 'W':
#             return False
#        elif you == 'G':
#             return True
# # check for all possiblities  when computer choose Water  
#     elif comp == "W":
#         if you == 'G':
#             return False
#         elif you == 'S':
#             return True
# ## check for all possiblities  when computer choose Gun  
#     elif comp == 'G':
#         if you == 'S':
#             return False
#         elif you == 'W':
#             return True

# print("Comp Turn: Sanke(S) water(W) or Gun(G)?")
# random_no = random.randint(1,3)
# if random_no == 1:
#     comp = 'S'
# elif random_no == 2:
#     comp = 'W'
# elif random_no == 3:
#     comp = 'G'

# you = input(" Player's Turn: Snake(S) Water(W) Gun(G)? ")
# a = gamewin(comp, you)

# print(f"You Choose {you}")
# print(f"Computer Choose {comp}")

# if a == None:
#     print("This Game is Tie!")
# elif a:
#     print("You win!")
# else:
#     print("You Lose!")


''' Using Open File Function Not Completed'''
# f =  open("","r")
# print(f)
# f.close


''' Leap Year Finder '''
# def is_leap(year):
#     leap = False
#     if year%4 == 0:
#         if year%400 == 0:
#             return True
#         if year%100 == 0:
#             return False
#         else:
#             return True
            
#     else :
#             return False
   
#     return leap
# year = int(input())

''''''
# if __name__ == '__main__':
#     n = int(input("uaygkavluya"))
# for i in range (n):
#     print( i + 1,end)

# import re
# N = input("")
# for i in range (N):
#     name, email = input(). split()
#     pattern = "<[a-z][a-zA-Z0-9\-\.\_]+@+[A-Za-z]{1,3}>"
#     if bool(re.match(pattern, email)):
#         print(name, email)




# t = int(input(""))
# for tc in range(t):

# 	(a, b) = map(int, input().split(' '))
	
# 	ans = a + b
# 	print(ans)


"""Making table of 2"""
# num = int(input("Enter the table num\n"))
# for i in range (1, 11):

# # you can print it in two way.
# # run only one print function.
# # print(str(num) + " x " + str(i) + " = " + str(i * num))

# # here use f string. {} write varibles in curly brackets
#     print(f"{num}x{i}={num*i}")


'''Table Maker'''
# a = int(input("Enter the num\n"))
# for i in range (1,11):
#     print(str(a)+ "x"+ str(i)+"="+ str(i * a))

''' Happy New Year Wisher '''
# year = "2021"
# year = list(year)
# year[-1] = "2"
# year = "".join(year)
# print("Happy New Year",year,"🎉")

'''Happy New Year Wisher'''
year = "2021"
new = year.replace("2021","2022")
print("Happy New Year", new ,"🎉")
