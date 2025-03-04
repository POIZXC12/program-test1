def solution(n):
    sum = 0
    
    while n > 0:
        a = n % 10
        n //= 10
        sum += a
    
    return sum