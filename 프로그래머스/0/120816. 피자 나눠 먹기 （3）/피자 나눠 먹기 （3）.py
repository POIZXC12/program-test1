def solution(slice, n):
    pizza = 1
    sum = slice
    while True:
        if sum >= n:
            return pizza
        else:
            pizza = pizza + 1
            sum += slice