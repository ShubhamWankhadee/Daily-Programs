""" Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                                	Basic Salary <= 10000 : HRA = 20%, DA = 80%
                                	Basic Salary <= 20000 : HRA = 25%, DA = 90%
                                	Basic Salary > 20000 : HRA = 30%, DA = 95%
 
"""



salary = int(input("Enter the salary:"))

if(salary <= 10000 ):
    hra = salary*20/100
    da = salary*80/100
    salary = salary+hra+da
    print("Gross salary is: ",salary)

elif(salary <= 20000):
    hra = salary*0.25
    da = salary*0.90
    salary = salary+hra+da
    print("Gross salary is: ",salary)

else:
    hra= 0.30*salary
    da = salary* 0.95
    salary = salary+hra+da
    print("Gross salary is: ",salary)
