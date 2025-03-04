def solution(s):
    sorted_chars = sorted(s, reverse=True)
    result = ''.join(sorted_chars)
    return result