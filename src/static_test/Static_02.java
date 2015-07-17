//static 멤버 변수 사용하는 방법



package static_test;


class StaticMember{
	int a = 10; 
	static int b=20;
}

public class Static_02 {
	public static void main(String[] args) {
		//문제 : a의 값을 main화면에 출력하시오
		//문제 : b의 값을 main화면에 출력하시오
		
		StaticMember member = new StaticMember();
		
		System.out.println("a의 값은 : " +member.a);
		System.out.println("b의 값은 : " +StaticMember.b);
		
	}
}
