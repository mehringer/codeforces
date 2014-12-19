n = int(raw_input())
arr = map(lambda x : int(x), str.split(raw_input(), " "))

origdiff = 10000

for x in range(n-1):
    diff = arr[x] - arr[x+1]
    origdiff = diff if origdiff > diff else origdiff

mindiff = -10000
for x in range(n-2):
    diff = min(arr[x] - arr[x+2], origdiff)
    mindiff = diff if diff > mindiff else mindiff


print (-1 * mindiff)
