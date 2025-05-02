def solution(s, n):
    result = ''
    for char in s:
        if char == ' ':
            result += ' '
        elif char.isupper():
            result += chr((ord(char) - ord('A') + n) % 26 + ord('A'))
        elif char.islower():
            result += chr((ord(char) - ord('a') + n) % 26 + ord('a'))
    return result