def solution(n):
    answer = [0] * len(str(n))
    
    for i in range(len(str(n))-1, -1, -1):
        answer[len(str(n)) - i - 1] = int(str(n)[i])
        
    return answer
    