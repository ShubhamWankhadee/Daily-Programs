"""
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
"""

for i in range(1,10,1):
	for j in range(1,10,1):
		if((((j<=i and j<=5) or (j>=10-i and j>5))and i<=5) or ( i>5 and((j<=5 and j<=10-i ) or (j>5 and j>=i)))):
			print("*",end="")
		else:
			print(" ",end="")
	print();