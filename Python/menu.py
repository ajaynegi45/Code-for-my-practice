# a = 13
# b = 2
# c = a / b 
# print (c)


# a = 1324
# b = 13362
# c = a * b
# print(c)

# num = int(input("Enter the Number "))
# if num % 2 == 0:
#     print("Even")
# else :
#     print("Odd")

# name =  input("Enter your name\n")
# print(type(name))

# name = int(input("enter your number "))
# for i in range (1,11):
#     print(name, " X ", i," = ", name * i)



# def ajay(name, department):
#     print("Your name is " + name)
#     print("You are from "+ department)
# ajay("Ajay", "Web Developer")

# def school(name, School):
#     print("\nMy name is "+ name +"\n \nMy School name is " + School)
# school("Ajay Negi", "Gyan Sagar Public School\n")




# def ajay(name):
#     print("Welcom"+name)

# result = ajay("Ajay bhai")
# print(result)


# june_days = 30
# print("June has " + str(june_days) + " days.")
# july_days = 31
# print("July has " + str(july_days) + " days.")


# def month_days(month, days):
#     print(month + " has " + str(days) + " days.")

# month_days("June","30")
# month_days("July","31")

# print(10>1)

# print(1!=2)


# print(1 == 1 and 2==2)


# print(1==2 or 2==3)
# print((2**2) == 4)
# number = 10
# if (number > 11): 
#   print(0)
# elif (number != 10):
#   print(1)
# elif (number >= 20 or number < 12):
#   print(2)
# else:
#   print(3)
# def sum(x, y):
# 		return(x+y)
# print(sum(sum(1,2), sum(3,4)))

# print((10 >= 5*2) and (10 <= 5*2))
# Number = input("Enter the number :- ")
# table = 1
# while table < 11:
# 	print (Number, str(" X "), table, str(" = "), str(table*Number))
# 	table = table+1



# def print_range(start, end):
# 	# Loop through the numbers from start to end
# 	n = 1
# 	while n <= 5:
# 		print(n)
# 		n = n+1
# # print_range(1, 5)



# num1 = int(input("Enter your number:- "))
# num2 = int(input("Enter your number:- "))
# print("Your Answer is:- ", num1 + num2)



# # taking two inputs at a time
# x, y = input("Enter two values: ").split()
# print("Number of boys: ", x)
# print("Number of girls: ", y)
# print()

# # taking three inputs at a time
# x, y, z = input("Enter three values: ").split()
# print("Total number of students: ", x)
# print("Number of boys is : ", y)
# print("Number of girls is : ", z)
# print()

# # taking two inputs at a time
# a, b = input("Enter two values: ").split()
# print("First number is {} and second number is {}".format(a, b))
# print()

# # taking multiple inputs at a time
# # and type casting using list() function
# x = list(map(int, input("Enter multiple values: ").split()))
# print("List of students: ", x)



print("\n")
import time

count_seconds = 3
for i in reversed(range(count_seconds + 1)):
	if i > 0:
		print(i, end=' >>> ', flush = True)
		time.sleep(1)
	else:
		print('Start Your Game \n')




