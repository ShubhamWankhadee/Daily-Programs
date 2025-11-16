#Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.

a = int(input("Enter the first Angle:\n"));
b = int (input("Enter the Sec Angle: \n"));
c= int (input("Enter the thirs Angle:\n"));


if a == b and b==c and a==c :
	print("Tringle is equilateral");

elif a!=b and b!=c and a!=c :
	print("Tringle is Scalene");
else:
	print ("Triangle is isoscale");
