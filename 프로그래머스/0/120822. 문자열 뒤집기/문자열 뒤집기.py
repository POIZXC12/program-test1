def solution(my_string):
    num = ''
    
    for i in range(len(my_string) - 1, -1, -1):
        num += my_string[i]
        
    return num
            
            