def solution(numbers):
    A = 0
    for i in range(len(numbers)):
        A += numbers[i]
    return A / len(numbers)