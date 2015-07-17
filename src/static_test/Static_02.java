//static 멤버 변수 사용하는 방법



package static_test;


class StaticMember{
	int a = 10; 
	//static int b=20;
	
	static int b=0;
	public StaticMember() {
		b++;
	}
}

public class Static_02 {
	public static void main(String[] args) {
		//문제 : a의 값을 main화면에 출력하시오
		//문제 : b의 값을 main화면에 출력하시오
		
		StaticMember member = new StaticMember();
		
		System.out.println("a의 값은 : " +member.a); // private가 없는 a의 값은 바로 가져올 수 있다.
		System.out.println("객체 갯수 : " +member.b); // 방법1 - 외부 객체를 거쳐서 간다.
		System.out.println("객체 갯수 : " +StaticMember.b); // 방법2 - 권장, 바로가는 것
		// class StaticMember 안에 등록되어 있기 때문에 바로 사용 할 수 있다.
	
		//static멤버는 외부 객체 없이도 사용 가능 하다.
		
		new StaticMember();
		System.out.println("객체 갯수 : " + StaticMember.b);
		
		
	}
}
