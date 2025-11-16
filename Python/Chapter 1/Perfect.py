# Perfetc

no = int(input("Enter the no"))
temp =no
k=1
sum =0
while(no/2>=k):
	if(no%k==0):
		sum = sum+k
	k=k+1
if(sum == temp):
	print("No is perfect")
