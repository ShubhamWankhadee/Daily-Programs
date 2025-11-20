/*
9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.


*/


class TemperatureConverter{
	public int convertToFahrenheit(int cels){
		 
		int Fahrenheit = (cels *9/5)+32;
		return Fahrenheit;
	}
	 
}
public class Q9{
	public static void main(String args[]){
		TemperatureConverter obj = new TemperatureConverter();
		 
		int b=10;
		System.out.println("Celsius to Fahrenheit is: "+ obj.convertToFahrenheit(b));
		 
		
	}
}