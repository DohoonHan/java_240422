package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
//		x 값 임시 저장
		int temp = x;
		x = y;
//		임시 값을 y에 저장 x랑 y의 수가 바뀌어서 출력됨
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
	}
}
