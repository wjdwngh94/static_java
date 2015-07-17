package static_method_package;

class StaticMethod
{
	int a= 10;
	static int b= 20; // 1순위
	
	void info()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("info() 호출");
	}
	static void info2()		// 1순위
	{
		int c= 30;
		//System.out.println("a="+a);	
		// a 가 등록되는 것은 1순위가 아니기 때문에 static 생성 때 모른다.
		//static 은 자신이 알고있는 것(static변수 / static class)만 가져올 수 있다.
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		
		System.out.println("info2() 호출");
	}
}

public class Static_03 {
	public static void main(String[] args) { 
		// main은 static method이기 때문에 class가 등록 되기 때문에
		// static이 아닌 class들을 읽어 올 수 없다.
		// 그래서 class를 밖에 만들어 준다.
		
		StaticMethod staticMethod = new StaticMethod();
		
		staticMethod.info();
		//info는 static이 아니기 때문에 new 한다.
		
		//staticMethod.info2(); 는 둘러간다.
		StaticMethod.info2();
	}
}
