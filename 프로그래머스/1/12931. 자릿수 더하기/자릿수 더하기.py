def solution(n):
    num = 0
    
    for i in range(0, len(str(n))):
        num += int(str(n)[i])
        
    return num