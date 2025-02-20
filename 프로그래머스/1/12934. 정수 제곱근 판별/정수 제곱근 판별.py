def solution(n):
    x = int(n ** 0.5)  # n의 제곱근을 계산하고 정수로 변환
    if x * x == n:  # n이 x의 제곱인지 확인
        return (x + 1) ** 2  # x+1의 제곱을 반환
    else:
        return -1  # n이 어떤 정수의 제곱이 아니면 -1 반환