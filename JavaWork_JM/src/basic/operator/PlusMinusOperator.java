package basic.operator;

public class PlusMinusOperator {

	public static void main(String[] args) {
		
		//증감 연산자(++,--)
		int i = 1;
		i++;
		System.out.println("i = " +i);
		i++;
		System.out.println("i = " +i);
		++i;
		System.out.println("i = " +i);
		i--;
		System.out.println("i = " +i);
		
		int a = 1;
		int b = a++; // 후위 연산 (선연산 후증감)
		int c = a--;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);

		int x = 1;
		int y = ++x; // 전위 연산 (선증감 후연산)
		int z = --x;
		
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		System.out.println("z = " +z);
		
		int f = 3;
		int g = f++ +5*3;
		System.out.println(g);
		
		
		
		
		
		
		
		

	}

}
