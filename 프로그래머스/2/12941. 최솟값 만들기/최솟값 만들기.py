def solution(A,B):
    #a는 오름차순 b는 내림
    A.sort()
    B.sort(reverse = True)
    
    result = 0
    for i in range(len(A)):
        result += A[i] * B[i]
    return result