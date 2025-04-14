import sys

input = sys.stdin.readline

def read():
    N = int(input())
    num_list = []
    for i in range(N):
        num_list.append(int(input()))

    
    return num_list , N


def merge(arr1 , arr2):
    res = []
    index1 = index2 = 0
    while index1 < len(arr1) and index2 < len(arr2):
        if arr1[index1] <= arr2[index2]:
            res.append(arr1[index1])
            index1 += 1
        else : 
            res.append(arr2[index2])
            index2 += 1
    
    if index1 == len(arr1):
        res += arr2[index2:]
    elif index2 == len(arr2):
        res += arr1[index1:]
    return res

def merge_sort(arr):
    if len(arr) == 1:
        return arr
    m = len(arr) //2
    l = merge_sort(arr[:m])
    r = merge_sort(arr[m:])
    return merge(l,r)

num_list, N = read()
num = merge_sort(num_list)
for i in num:
    print(i)