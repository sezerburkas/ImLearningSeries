# Welcome to Python

This is our first lesson of Python and this is the first post of I'm learning series. Open your IDE right now. If you don't have one here is online python complier: https://www.programiz.com/python-programming/online-compiler/

Ok there is no such time lets go. C'mon hurry up. 

# Hello World!

First thing first, we need to prompt "Hello World!" it's a tradition. If you don't know about this tradition I suggest you to read here: https://blog.hackerrank.com/the-history-of-hello-world/

Our first Python code is: Print()

print("Hello World!")

And we just write our first code. Yaaaay. Save this as "helloWorld.py" and open new one so we can move on.

# Variables

Variables are one of most important things in coding. First you need to understand what is a variable is. Here is a short and fun video about variables : https://www.youtube.com/watch?v=ghCbURMWBD8 Go ahead watch it, I'll wait...

Oh you're done watching. Ok, now we learned what a variable is. Lets do a quick research on Google how variable works on Python?.  Write "Python variables" on Google.

name = "Sezer"
age = 23
gender = "Fluid"

#Do you remember our first code go look at how to use this with variables.
print("Name = "+name)
print("Age = "+age)
print("Gender = "+gender)

 When you try to run this, you gonna see we have our first error its should look like this.

Traceback (most recent call last):

  File "C:\Users\sezer\Desktop\Python\PartOne\variables.py", line 12, in 

    print("Age = "+age)

TypeError: can only concatenate str (not "int") to str

Don't worry when something happens like this. We gonna see errors in coding a lot. So how we are gonna fix this? It is simple actually. Go and search "TypeError: can only concatenate str (not "int") to str" line that is last line of the error prompt.
So problem is caused by our variable type.  Our  "age" variable is a int (integer) but we need a str (string) when we want to use with text. So you can see the solution if you done research. We need to transform our variable.

print("Age = "+str(age))

We changed our code into this. And now we fixed our first error. Save this as "variables.py" and open new one so we can move on.

# User Input

Lets add some user input. We need a program that we input our name, age and gender. Go and search "How to do user input in python". I'll wait for you.

name = input("Please write your name= ")
print("Your name is= "+name) 

Ok, I'll let you develop more. Add age and gender too. When you done save this as "userInput.py" and open new one so we can move on.
Summing up the Two Variables

Lets do our first math. (God I hate math)

sum = 1 + 2

print("Your result= "+str(sum))

And lets develop and add user input.

number1 = input("Please add your first number= ")
number2 = input("Please add your second number= ")

sum = number1 + number2

print("Your result = "+str(sum))

When you run that code you gonna see a bug. (WTF!)

Please add your first number = 1

Please add your second number = 2

Your result = 12

According to my math the result is wrong. (I guess...)
So what is our bug? Go head and research. Let me give you a hint. Google "Python summing two variables". Shhh don't tell anyone but cheating is great for coding.

Did you look at it? So when we do input its record as string type.  So we need to transform into int(integer).

number1 = int(input("Please add your first number= "))
number2 = int(input("Please add your second number= "))

sum = number1 + number2

print("Your result = "+str(sum))

Ok now everything is working fine. Unless we write string into it. But we're not gonna fix that for now.  Maybe later...
Save this as "varSum.py" and open new one so we can move on.

# Big or Small?

Lets do something that tell us our first number greater than second one or not. You might think how we can tell which one is greater. You learned how to Google stuff so you can do that. But still I'm gonna teach you my friend. I introduce you the mighty codes: if and else (Yaaaaaay)

number1 = int(input("Please add your first number = "))
number2 = int(input("Please add your second number = "))

if number1 > number2:
   print("First number is greater.")
elif number1 < number2:
   print("Second number is greater.")
else:
   print("Both numbers are equal")

Save this as "isGreater.py" and open a new one so we can move on.

# Factorial Finder

It's been a long session for all of us. But don't worry this is our last program for this session. Lets write a code that finds a value of factorial. Before that you might look at that code: For Loops

number = int(input("Please write your number: "))
result = 1
#We determine our result variable as one because its needs a value.

for x in range(1,number+1)
    result = result*x
    print(str(result))

print("Result : "+str(result))

You might ask "Why we didn't use a math formula instead?". Because we learn python, not math John! C'mon man get your sh*t together and put it in the sh*t museum.  Ofcourse it is more clever that using a math code. Do that later but for now we need to use for loops.

Save this as "factorial.py".

# Challenge: Basic Calculator

So this is our end of this session. I hope you had fun and learned something. So I have a challenge for you. That works like image that below.

Good Luck!
