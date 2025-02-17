def solution(arr):
    a = 0
    
    for i in range(len(arr)):
        a += arr[i]
    return a/len(arr)