def solution(d, budget):
    
    #지원한 부서랑 사용예산 변수
    a = 0
    result = 0
    
    d.sort()
    #인덱스 순회, 신청 금액
    for i in range(0, len(d)):
        if result + d[i] <= budget:
        #사용한 예산이랑 신청금액 더하고 이게 예산 넘지않으면 지원
            result += d[i]
        #예산 사용
            a += 1
        else:
            break
    
    return a