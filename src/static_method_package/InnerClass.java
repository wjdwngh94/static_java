package static_method_package;
class Buy{//외주 맡긴 프로그램
	public void a(){
		System.out.println("a()실행");
	}
	public void b(){
		System.out.println("d()실행");
	}
	public void c(){
		System.out.println("c()실행");
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Buy d= new Buy(){
			//하나의 클래스 공간 (이름이 없어서 익명 중첩 클래스)
			@Override // 재 정의 / 수정
			public void b() {
				System.out.println("b()실행");
			}
		}; //잘못된 부분을 고친다.
		//class부분을 직접적으로 고치지 않고
		//b에게만 내용을 수정한다.
		
		d.a();
		d.b();
		d.c();
	}
}
