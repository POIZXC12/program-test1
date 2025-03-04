def solution(arr):
    min_arr = min(arr)
    result = []
    
    if len(arr) == 1:
        return [-1]
    
    for i in arr:
        if i not in [min_arr]:
            result.append(i)
            
    return result
            
            