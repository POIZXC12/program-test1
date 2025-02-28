def solution(arr, divisor):
    result = [x for x in arr if x % divisor == 0]
    return sorted(result) if result else [-1]