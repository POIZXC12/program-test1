def solution(n, m):
    
    #작은거부터 최대공약수 찾아보자
    for i in range(min(n, m), 0, -1):
        if n % i == 0 and m % i == 0:
            max_gong = i
            break
            
    min_gong = max(n, m)
    
    while True:
        if min_gong % n == 0 and min_gong % m == 0:
            break
        min_gong = min_gong + 1
    
    return [max_gong, min_gong]

