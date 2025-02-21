def solution(x):
    # 숫자의 각 자릿수 합 계산
    digit_sum = sum(int(digit) for digit in str(x))
    
    # x가 자릿수의 합으로 나누어 떨어지는지 확인
    return x % digit_sum == 0
