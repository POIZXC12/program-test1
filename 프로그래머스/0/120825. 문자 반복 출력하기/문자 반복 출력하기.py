def solution(my_string, n):

    answer = ""
    for i in range(0, len(my_string)):
        for j in range(0, n):
            answer += my_string[i]
        
    return answer