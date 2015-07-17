package static_method_package;
//final - 마지막
//변수 - 값 설정이 마지막
//메소드 - 내용 설정이 마지막
//클래스 - 상속이 마지막

class StaticFinal{
	//static final 은 상수를 의미한다.
	//메모리에 등록되어 아무나 접근할 수 있지만 변경은 불가하는 것이므로
	//1, "a", "T" 와 같은 역할을 수행
	//보통(99%) public과 같이 쓴다.
	
	public static final String name = "황인빈";
}

public class Final {
	public static void main(String[] args) {
		final int a=10;
		
		//a = 20; // Error !!
		//final 은 값설정이 마지막 즉, 고정이라는 뜻이므로 오류가 난다.
		
		System.out.println("a = " + a); // final 은 값은 한번은 주어야 한다.
		
		//name 출력
		System.out.println(StaticFinal.name);  //static이기 때문에 객체를 만들지 않고도 변경 가능
		//StaticFinal.name="빌게이츠"; //final 이기 때문에 변경이 불가하다.
		
		//Fianl의 대표 예)
		System.out.println("원주율 = " +Math.PI);
		System.out.println("e = " +Math.E);
	}
}
