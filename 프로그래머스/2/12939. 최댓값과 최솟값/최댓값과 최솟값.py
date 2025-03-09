def solution(s):
    number = list(map(int, s.split()))
    
    min_result = min(number)
    max_result = max(number)
    
    return f"{min_result} {max_result}"