def read():
    n = int(input(""))
    num1= list(map(int,input().split()))
    n1 = int(input(""))
    num2= list(map(int,input().split()))
    num1 = list(set(num1))
    num1.sort()
    return n ,n1 , num1,num2

def solve(num1 , num2):
    for i in num2:
        EX = False
        l = 0
        h = len(num1) - 1

        while l<=h:
            mid = (l+h)//2
            if num1[mid] == i:
                EX = True
                print(1)
                break
            if num1[mid] < i :
                l = mid + 1
            if num1[mid] > i :
                h = mid - 1 
        if not EX :
            print(0)
            
            
n ,n1 ,num1, num2= read()
solve(num1 ,num2)