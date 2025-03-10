def solution(n):
    a = ''
    result = ''
    
    #10 진법 > 3진법
    while n > 0:
        a = str(n % 3) + a
        n //= 3
        
    #3진법 뒤집기
    reverse_n = a[::-1]
    
    #3진법 > 10진법
    result = int(reverse_n, 3)
        
    return result