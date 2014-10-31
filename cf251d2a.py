n, d = map(int, raw_input().split())

arr= map(int, raw_input().split())

rest = (len(arr) - 1)*10
tot= rest

for x in range(len(arr)):
    tot = tot + arr[x]


if tot > d:
    print "-1"
else:
    t = (d + rest - tot)
    print (int(t/5))

