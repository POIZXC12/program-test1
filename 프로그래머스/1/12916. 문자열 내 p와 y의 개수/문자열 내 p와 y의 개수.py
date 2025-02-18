def solution(s):
    # 문자열을 소문자로 변환
    s = s.lower()
    
    # 'p'와 'y'의 개수를 세기
    count_p = s.count('p')
    count_y = s.count('y')
    
    # 'p'와 'y'의 개수 비교
    return count_p == count_y