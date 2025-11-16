# Strong no

no = int(input("Enter the no:"))
i =1
while(i<=no):
    ori =i
    store=0
    dig=i
    while(dig>0):
        rem = dig%10
        dec = rem-1
        add = rem
        while(dec>0):
            add = add*dec
            dec -=1
        store = store+add
        dig=dig//10
    if(store == ori):
        print(i)
     
    i =i+1
    
		
		
		