#Amstrong no

no = int(input("Enter the no:"))
i=1
while( i< no):
    count=0
    temp = i
    ori =i
    while(temp>0):
        count+=1
        temp =temp//10
     
    store =0
    while(i>0):
        rem = i%10
        add = rem
        dec = count
        while(dec>1):
            add = add*rem
            dec = dec-1
        
        store= store+ add
        i = i//10
    i = ori
    if(store == ori):
        print(ori)
 
    i=i+1