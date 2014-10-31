

def powerset(arr):
    if arr == []:return [[]]
    else:
        result = powerset(arr[:-1])
        tmp = len(result)
        for i in range(tmp):
            result = result + [(result[i] + [arr[len(arr)-1]])]
    return result


print powerset([1,2,3])