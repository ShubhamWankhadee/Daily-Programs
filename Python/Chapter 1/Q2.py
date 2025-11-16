#Q2. Write a Java program to check whether a triangle is valid or not.
 
  

a =int(input("Enter the First Angle:\n"));
b= int(input("Enter the Sec Angle:\n"));
c= int(input("Enter the Third Angle: \n"));

if a+b+c == 180:
    print(" Triangle is Valid");
else:
    print("Tringle is not Valid");