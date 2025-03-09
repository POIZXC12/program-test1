def solution(arr):
    result = []
    
    for i in arr: #배열 arr 각 원소 순회
        if not result or result[-1] != i: #result가 i랑 틀릴때만?
            result.append(i)
            
    return result
        
        
        
        