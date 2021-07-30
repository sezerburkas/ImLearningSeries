number = int(input("Please write your number: "))
result = 1

for x in range(1,number+1):
    result = result*x
    print(str(result))

print("Result: "+str(result))