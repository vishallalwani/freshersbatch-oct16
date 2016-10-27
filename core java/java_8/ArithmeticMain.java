package conn;

public class ArithmeticMain {
 public static void main(String[] args) {
	 
	 
	 calculation<Integer,Integer> plus = ( a, b) -> a + b;
     System.out.println("Sum of 10,34 : " + plus.operation(10, 34));
     
     calculation<Double,Double> minus = (a, b) -> a - b;
     System.out.println("Subtraction of 10,34 : " + minus.operation(10.5, 34.8));
     
     calculation<Integer,Integer> mult = (a, b) -> a * b;
     System.out.println("multiplication of 10,34 : " + mult.operation(10, 34));
}
}
