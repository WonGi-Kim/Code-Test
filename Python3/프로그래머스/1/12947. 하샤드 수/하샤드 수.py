def solution(x):
    str_x = str(x)
    list_x =[]
    for i in range(len(str_x)):
        list_x.append(int(str_x[i]))
    sum_x = sum(list_x)
    
    if x % sum_x == 0:
        answer = True
    if x % sum_x != 0:
        answer = False
        
    
    return answer