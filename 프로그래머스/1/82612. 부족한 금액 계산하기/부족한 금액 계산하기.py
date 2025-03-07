def solution(price, money, count):
    total_cost = 0
    for i in range(1, count + 1):
        total_cost += price * i
    
    shortage = total_cost - money
    return max(shortage, 0)