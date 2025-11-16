# Q17. Write a Java program to convert seconds to hours, minutes and seconds. 

sec = int(input("Enter the Seconds"))

hr = sec//3600
min = (sec%3600)//60
seconds = (sec)%60
print("Hours", hr)
print("Minuts",min)
print("Seconds",seconds)

