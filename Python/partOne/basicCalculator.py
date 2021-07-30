print("\n------------- Welcome To Basic Calculator --------------\n")

print("Possible actions :\n")
print("1 - Addition")
print("2 - Subtraction")
print("3 - Division")
print("4 - Multiplaction")
print("5 - Average")
print("6 - Greatest/Lowest")

action = int(input("\nPlease select your action by writing id: "))

numCount = int(input("How many numbers will you use? : "))

result = 0
#Addition
if action == 1:
    for x in range(numCount):
        number = int(input("Please add your #"+str(x+1)+" number = "))
        result = result+number
#Substraction
if action == 2:
    for x in range(numCount):
        number = int(input("Please add your #"+str(x+1)+" number = "))
        if x == 0:
            result = number
        else:
            result = result-number
#Division
if action == 3:
    for x in range(numCount):
        number = int(input("Please add your #"+str(x+1)+" number = "))
        if x == 0:
            result = number
        else:
            result = result/number
#Multiplaction
if action == 4:
    for x in range(numCount):
        number = int(input("Please add your #"+str(x+1)+" number = "))
        if x == 0:
            result = number
        else:
            result = result*number
#Average
if action == 5:
    for x in range(numCount):
        number = int(input("Please add your #"+str(x+1)+" number = "))
        result = result+number
    result = result/numCount
#Greatest/Lowest
if action == 6:
    number = []
    for x in range(numCount):
        number.append(int(input("Please add your #"+str(x+1)+" number = ")))
    number.sort()
    print("Greatest = "+str(number[-1])+"  Lowest = "+str(number[1]))
else:
    print("Result = "+str(result))
