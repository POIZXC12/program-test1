def solution(n):
    a = []
    b = 1
    while n > 0:
        digit = n % 10
        a.append((digit, b))
        n //= 10
        b += 1

    for i in range(len(a)):
        for j in range(i + 1, len(a)):
            if a[i][0] < a[j][0] or (a[i][0] == a[j][0] and a[i][1] < a[j][1]):
                a[i], a[j] = a[j], a[i]

    result = 0
    for k in range(len(a)):
        result = result * 10 + a[k][0]
    return result