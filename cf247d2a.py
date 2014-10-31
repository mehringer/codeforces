arr = map(int, raw_input().split(" "))
lst =[]
se = raw_input()

for ch in se:
	lst = lst + [int(ch)]
result = 0
for num in lst:
	result += arr[num -1]

print result	

