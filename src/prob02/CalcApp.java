package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		
		if(operation.equals("+"))
		{
			Add add = new Add();
			System.out.println(add.calculate(a, b));
		}
		else if(operation.equals("-"))
		{
			Sub add = new Sub();
			System.out.println(add.calculate(a,b));
		}
		else if(operation.equals("*"))
		{
			Mul add = new Mul();
			System.out.println(add.calculate(a,b));
		}
		else if(operation.equals("/"))
		{
			Div add = new Div();
			System.out.println(add.calculate(a,b));
		}
		
		scanner.close();
	}
}
