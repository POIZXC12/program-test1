def solution(numbers):
    a = 0
    for i in range(0, 10):
        if i in numbers:
            continue
        a += i

    return a