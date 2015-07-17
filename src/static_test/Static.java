package static_test;

//static 키워드
//1. 메모리 1순위 등록
//2. 같은 타입의 객체들이 공용으로 참조하는 값

class Account1{ //은행 계과 클래스
	
	private String name; //예금주
	private int money; // 예금액
	public float rate; // 이자율
	
	public Account1(String name, int money, float rate){
		this.money=money;
		this.name=name;
		this.rate=rate;
	}
	
	public void info()
	{
		System.out.println(name+"님의 잔액 : " + money +"원");
		System.out.println(", 적용 이율 : " + rate * 100 +"%");
	}
}

public class Static { 
	public static void main(String[] args) {
		System.out.println("=========영업 개시===========");
		//첫번 째 고객 등장
		Account1 account1= new Account1("유재석", 1000, 0.05f);
		Account1 account2 = new Account1("김구라", 1000, 0.02f);
		Account1 account3 = new Account1("신동엽", 1000, 0.04f);
		
		account1.info();
		
		System.out.println("==============================");
		
		
		account2.info();
		

		System.out.println("==============================");
		
		
		account1.rate = 0.04f;
		account2.rate = 0.04f;
		
		//시장 이율이 바뀔 때 마다 개개인의 이율을 하나하나 바꿀수 는 없다.
		//그래서 개개인의 이율 모두가 하나를 쳐다보게 한다.
		
		//즉 유재석, 김구라, 신동엽의 rate는 '이율'의 주소를 가지고 있게 한다.
		//그럼으로 인해서 '이율'의 데이터가 바뀌면 그것을 참조하고 있는
		//3사람의 rate값도 변환된다.(일괄 적용 / 누적이 된다 / c언어의 전역변수와 동일)		
		
		account1.info();
		account2.info();
		account3.info();
		
		
		System.out.println("=========영업 종료===========");
	}
}
