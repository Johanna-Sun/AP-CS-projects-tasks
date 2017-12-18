print("the expected result of test1 is: ")
for i in range(10):
    print(i+1)
print("")
print("the expected result of test2: ")
index = 1;
for letter in 'Python':
   print ("the letter is: " + letter)
print("")
print("the expected result of test3: ")
s = "Python"
x = len(s)
print("the length of %s is %x" %(s,x))


# test4
print("\nFibonacci sequence range(10)")
import time
start=time.time()

def fib(number,cache=None):
    if cache == None:
        cache = {}
    if number in cache:
        return cache[number]
    if number == 0 or number == 1:
        return 1
    else:
        cache[number] = fib(number-1,cache) + fib(number-2,cache)
    return cache[number]
print [fib(number) for number in range(0,100,1)]
end=time.time()
print 'cost:{}'.format(end-start)
