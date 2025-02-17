def solution(x, n):
    answer = [0] * n
    a = 0
    
    for i in range(n):
        a += x
        answer[i] += a
        
    return answer