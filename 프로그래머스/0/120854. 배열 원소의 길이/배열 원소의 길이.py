def solution(strlist):
    list = [0] * len(strlist)
    
    for i in range(0, len(strlist)):
        list[i] += len(strlist[i])
        
    return list