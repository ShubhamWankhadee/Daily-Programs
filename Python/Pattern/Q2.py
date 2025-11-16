"""

			*
		 *  *  *
      *  *  *  *  *
   *  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *

"""


for i in range(1 , 6, 1):
	for j in range(1 ,10 ,1):
		if((j<=5 and j>=6-i) or (j>5 and j<=4+i)):
			print("*",end="")
		else:
			print(" ",end="")
	print();