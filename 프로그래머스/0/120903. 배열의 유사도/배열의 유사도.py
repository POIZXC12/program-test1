def solution(s1, s2):
    count = 0
    for elem in s1:
        if elem in s2:
            count += 1
            s2.remove(elem)  # 중복 카운트 방지
    return count