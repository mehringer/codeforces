#took about 13 minutes
n = int(raw_input())
arr = map(int, raw_input().split(" "))
hundreds = 0
for a in arr:
	if(a == 100):
		hundreds += 1
twohunds = len(arr) - hundreds
if (hundreds % 2 == 0 and twohunds % 2 == 0): 
	print "YES"
elif (hundreds % 2 == 0 and hundreds > 0):
	print "YES"
else:
	print "NO"
