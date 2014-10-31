liner = raw_input().split(" ")
n = int(liner[0])
p = int(liner[1])

arr = []
for x in range(n):
    tmpLine = map(int, raw_input().split())
    if min(tmpLine[1:]) < p:
        arr.append(x+1)

ans = map(str, sorted(arr))
print(len(ans))

if len(ans) != 0:
    print " ".join(ans)
else:
    print "";
    
    
    
dict = {'name': 'luke', 'last': 'mehringer'}
print dict['name']

print hash('name')

dict2 = {hash('luke'):'luke', hash('mehringer'):'mehringer'}

print dict2[hash('luke')]
print 101 in dict2