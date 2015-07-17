package modifier03;
//private, public +
//기타 접근 제한자.... package 와 protected
//package 접근 제한자는 키워드를 안적으면 자동 설정
// - 같은 패키지 내부의 구성요소만 접근가능(동일 이름 생성 불가)
// 			ex.하나의 교실의 강의는 다른 교실에서 접촉할 수 없다.

import java.util.Scanner;
import test.*;


//protected 접근 제한자는 상속 단원에서 나온다.
// - package + 다른 패키지의 부모클래스 까지 접근 가능 하다.



class Same{//같은 패키지의 package 클래스
	private int a =10;
	int b=20;
	protected int c = 30;
	public int d=40;
}
public class Modifier03 {
	
	public static void main(String[] args) {
		Same same = new Same(); // 같은 package 이기 때문에 ok
		//다른 패키지의 class 객체 생성
		
		//same.a=100;
		same.b=100;
		same.c=100;
		same.d=100;
		
		Diffrent dif1 = new Diffrent();
		//처음에
		//Diffrent 에 error가 발생하는 이유는 
		//test package 의 Diffrent class를 가져오지 못하기 때문이다.
		//그래서 import test.*를 달아준다.
		
		//dif1.a=100;
		//dif1.b=100;
		//dif1.c=100;
		dif1.d=100;
		//public 이 있는 d에만 접근가능하다.
		//main에는 접근제한이 걸려있으면 프로그램 작동이 불가하기 때문에
		//public으로 설정해야 한다.
		
		//Diffrent2 dif2 = new Diffrent2();
		//하지만 Diffrent2는 그래도 public 이 아니기 때문에 여전히 불가하다.
		
		Scanner scanner = new Scanner(System.in);
		//scanner 도 import를 달아주기 전에는 error가 발생한다.
	}
}
