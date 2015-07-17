package static_test;

//static 키워드
//1. 메모리 1순위 등록
//2. 같은 타입의 객체들이 공용으로 참조하는 값

class Account{ //은행 계과 클래스
	
	private String name; //예금주
	private int money; // 예금액
	
	//static 초기설정 방법 1
	
	//public static float rate = 0.05f; // 이자율 
	//static 정적
	
	//static 초기설정 방법 2
	public static float rate; //이자율 - 일괄 적용
	static{
		rate = (float)(Math.random());
	}

//	stack		heap		상수 및 메소드 부
//	a1			rate
//	a2			rate           Account.rate
//	a3			rate
	
	
	public Account(String name, int money, float rate){
		this.money=money;
		this.name=name;
		//this.rate=rate;
		Account.rate=rate;
		
	}
	
	public void info()
	{
		System.out.println(name+"님의 잔액 : " + money +"원");
		System.out.println(", 적용 이율 : " + rate * 100 +"%");
	}
}

public class Static2 { 
	public static void main(String[] args) {
		System.out.println("=========영업 개시===========");
		System.out.println("은행 이율 : " +Account.rate*100);
		//첫번 째 고객 등장
		Account account1= new Account("유재석", 1000, 0.05f);
		Account account2 = new Account("김구라", 1000, 0.02f);
		Account account3 = new Account("신동엽", 1000, 0.04f);
		
		account1.info();
		
		System.out.println("==============================");
		
		
		account2.info();
		

		System.out.println("==============================");
		
		
		//account1.rate = 0.04f;
		//account2.rate = 0.04f;
		
		account1.info();
		account2.info();
		account3.info();
		
		
		System.out.println("=========영업 종료===========");
	}
}
