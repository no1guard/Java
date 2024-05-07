package Cond;

public class If3 {

	public static void main(String[] args) {
		/*7세 이하일경우 : 미취학 
		  8세 이상 13세 이하일 경우 : 초등학생 
		  14세 이상 16세 이하일 경우 : 중학생 
		  17세 이상 19세 이하일 경우 : 고등학생 
		  20세 이상일 경우 성인
		
		 */
		int age=14;
		
		if (age<=7) {
			System.out.println("미취학입니다.");
		}if(age>=8 && age<=13) {
			System.out.println("초등학생입니다.");
		}if(age>=14 && age<=16) {
			System.out.println("중학생입니다.");
		}if(age>=17 && age<=19) {
			System.out.println("고등학생입니다.");
		}if (age>20) {
			System.out.println("성인입니다.");
		} // 이 코드가 나쁜건 아니지만 단점이 있음 
		// 불필요한 조건을 계속 진행함 
		
		//else if >> 앞선 if문의 조건이 거짓일때 다음 조건을 검사한다. 만약 앞선 if 문이 참이라면 else if를 실행하지않는다 

	}

}
