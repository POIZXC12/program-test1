def solution(money):
    price = 5500
    
    a = money // price
    b = money % price
    
    return [a, b]