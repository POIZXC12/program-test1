def solution(my_string):
    num = ''
    
    l = len(my_string)
    
    for i in range(l - 1, -1, -1):
        num += my_string[i]
        
    return num
            
            