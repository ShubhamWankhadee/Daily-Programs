# Duck no

no = int(input("Enter the no:"))
i =1
while(i<=no):
    
    temp =i
    while(temp>0):
        
        rem = temp%10
        if(rem==0):
            print(" no is Duck",i)
            break
        
        temp = temp//10
        
    i =i+1