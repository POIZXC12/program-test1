def solution(s):
    len_s = len(s)
    
    if len_s != 4 and len_s != 6:
        return False
    
    for i in range(len_s):
        if s[i] < '0' or s[i] > '9':
            return False
    
    return True