def solution(t, p):
    count = 0
    p_len = len(p)  # p의 길이
    p_num = int(p)  # p를 정수로 변환
    
    # t에서 p와 같은 길이의 부분 문자열 추출
    for i in range(len(t) - p_len + 1):
        substring = t[i:i + p_len]  # 부분 문자열
        if int(substring) <= p_num:  # 부분 문자열을 정수로 변환하여 비교
            count += 1
    
    return count
