
public class Variable {

	public static void main(String[] args) {
		
		// 1.정수 2. 문자 3.문자열 4.실수 5.논리형(참,거짓)
		// 1. 정수엔 byte short int long이 있음
		// byte=1byte (8비트), 가장 작은단위 
		byte 바이트 = 1;
		System.out.println(바이트);
		System.out.println("바이트");
		// 파일을 저장할때 키보드에서 ctrl + s를 눌러주면 저장됨
		byte bt=2; // byte나 short는 컴퓨터안에 그릇의크기 
		System.out.println(bt);
		
		short 쇼트=3; 
		System.out.println(쇼트);
		
		int 인트 =1;// byte<short<int<long
		System.out.println(인트);
		System.out.println("ㅡㅡㅡㅡㅡ");
	
		byte bte=2;
		short shrt=2;
		int nt=2;
		long lng=2;
		System.out.println(bte);
		System.out.println(shrt);
		System.out.println(nt);
		System.out.println(lng);
		
		//2.문자
		// 문자에는 Char와 String이 있음 
		// 문자를 나타내는 char은 '' 작은 따음표를 사용해서 표현 
		// "" 큰 따옴표는 String 문자열을 나타내는 표현 
	
		char myChar='A';
		System.out.println(myChar);
	
		 
		char myChar2='a';
		System.out.println(myChar2);
		//char 에는 하나의 문자만 담을 수 있기 때문에 
		//A나 B둘중 하나만 작성가능 
		char myChar3='A'; // Invalid character constant << 잘못된 문자 상수
		
		//String
		String str1="와 드디어 문자다~~";
		System.out.println(str1);
		// String을 사용해서 이름 출력하기
		// String name = " 본인이름 " ;
		// System.out.println (name);
		
		String name= "권상정";
		System.out.print("당신의 이름은");
		System.out.println(name);
		System.out.println("입니다.");
		//만약에 여러 글자나 내용을 한줄로 출력하고 싶다면 
		// + 를 사용해서 이어서 출력할 수 있음 
		System.out.println("당신의 이름은 "+name + " 입니다. "); //16
		System.out.println("당신의 이름은"+name + "입니다. ");
		System.out.println("당 신 의 이 름 은 " + name + " 입 니 다 . ");
		// 띄어쓰기를 넣고 싶을 경우 " " 문자열 내부에 띄어쓰기를 넣으면 진행가능 
		
		// 정수+문자 +문자열 출력하기 
		/*안녕하세요. 저는요 . 서울에 사는 권상정 입니다.
		 * 제 전화번호는 000-0000-0000 입니다.
		 * 제 주민번호는 비밀입니다.
		 * 제 혈액형은 A형입니다.
		 * */
		
		String geeting="안녕하세요.";
		String introduction = " 저는요. 서울에 사는 OOO입니다.";
		int number1=111;
		int number2=2222;
		int number3=3333;
		String number4 = "111-2222-3333";
		char dash = '-';
		String secret ="비밀";
		String bloodType="A형";
		
		System.out.print(geeting);
		System.out.println(introduction);
		System.out.print("제 전화번호는 ");
		System.out.print(number4);
		System.out.println("입니다.");
		System.out.println("제 주민번호는 "+secret+"입니다.");
		System.out.println("제 혈액형은 "+bloodType+"입니다.");
		
		//4. 실수 5. 논리형 
		// 실수는 float 과 double 이 있습니다. 
		// 실수는 기본으로 double 형식으로 되어있음
		// float = 4byte double = 8byte
		// float에 실수를 담기 위해서는 f를 붙여줘야 함 
		// 실수 뒤에 f를 붙일 때 대소문자 구분 없이 사용가능!!
		//자바에서 실수형은 기본값이 double이므로 앞의 예에서 보듯이 float 변수에 값을 대입할 때에는
		//3.14F처럼 끝에 접미사로 F 자를 꼭 붙여 주어야 한다. 
		//float 자료형에 값을 대입할 때 접미사를 누락하면 컴파일 오류가 발생한다. 대문자 F 대신 소문자 f를 사용해도 된다.
		float ff = 3.14F;
		float ff2= 3.14F;
		System.out.println("ff1은"+ff+"이다");
		System.out.println("ff2는 "+ff2+"이다");
		
		double dd1 = 3.14; // 애초에 double 자체가 ㅈㄴ커서 필요없음 F같은게 float보다 훨씬큼 
		//double은 크기가 float보다 크고 애초에 double을 넣을려고 했기때문에 뒤에 수식을 붙이지않아도 사용할수있음
		
		System.out.println("double dd1 : " + dd1 );
		
		//5. 논리형 
		// boolean을 사용해서 true인지 false인지 표현할 수 있음 
		// 나중에 알고리즘이나 if for while 문을 사용할 때 자주 사용 
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("오늘 날씨는"+isTrue);
		System.out.println("내일 날씨는"+isFalse+ " ? ");
		
		
		//정수 문자 문자열 실수 논리형 ( int char String double boolean)
		int num= 10;
		System.out.println("정수 num의 값 : "+num);
		
		char ch = 'Z';
		System.out.println("문자 ch의 값 : "+ ch);
		
		String text = "Hello, World";
		System.out.println("문자열은 text = "+ text);
		
		double dbl=3.14;
		System.out.println(dbl);
		
		boolean is=true;
		System.out.println("isTrue="+ is);
		
		num =20;
		//지정값은 처음 1회만 사용한 후 
		// 변수명에 다른 숫자나 값을 넣을 땐 
		// 지정값을 굳이 한번 더 안써도됌 쓰면 애초에 오류가뜸 그래서 생략해야함
		
		System.out.println("num = "+ num);
		//num에다가 10대신에 20을 넣고싶다면? 
		
		int 숫자=10;
		
		System.out.println("숫자는 "+숫자+"입니다.");
		
		숫자=20;
		System.out.println("숫자는 "+숫자+"입니다.");
		/*
		 * 철수는 19살이었다
		 * 그런데 24년이 되면서 20살이 되었다.
		 */
		String name1 = "철수";
		String age = "19";
		System.out.println(name1+"는"+age+"살 이었다.");
		age= "20";//이러면 age지정값을 한번 더 재활용하서 쓰는거 굳이 age1지정값을 할빠엔 똑같은 지정값을 쓰는게 메모리상으로도 이득임 
		System.out.println("그런데 24년이 되면서"+age+"살이 되었다.");
		
		 
	}

}
