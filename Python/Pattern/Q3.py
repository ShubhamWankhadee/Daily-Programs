"""
	*	*	*	*	*	*	*	*	*
	*	*	*	*		*	*	*	*
	*	*	*				*	*	*
	*	*						*	*
	*								*
	*	*						*	*
	*	*	*				*	*	*
	*	*	*	*		*	*	*	*
	*	*	*	*	*	*	*	*	*
"""

for i in range(1,10,1):
	for j in range(1, 10,1):
		if((((j<=5 and j<=6-i) or (j>5 and j>=4+i)) and i<=5) or (i>5 and(( j<=5 and j<=i-4) or( j>5 and j>=14-i)))):
			print(" * ",end ="")
		else:
			print("   ",end ="")
	print();