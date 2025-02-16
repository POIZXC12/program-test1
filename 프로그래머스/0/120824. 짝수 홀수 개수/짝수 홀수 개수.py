def solution(num_list):
    a = 0
    b = 0
    
    for i in range(0, len(num_list)):
        if num_list[i] % 2 == 0:
            a += 1
        else:
            b += 1
            
    return a, b