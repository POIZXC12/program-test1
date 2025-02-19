def solution(s):
    count_p = 0
    count_y = 0
    
    for char in s.lower():
        if char == 'p':
            count_p += 1
        elif char == 'y':
            count_y += 1
    
    return count_p == count_y