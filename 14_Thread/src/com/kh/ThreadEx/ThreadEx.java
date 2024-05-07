package com.kh.ThreadEx;
/*
 * process: program+succes = 프로그램 실행 성공 그 말은 프로그램 실행주
 Thread(스레드) : 실 
 스레드는 컴퓨터에서 실제로 작업을 수행하는 것을 의미 
 
 두 개 이상의 스레드를 가지는 프로세스를 멀티스레드
 
 스레드를 생성하는 방법 
 1.Runnable 인터페이스 사용 클래스명 옆에 implements Runnable
 
 2.Thread 클래스 상속받기  클래스명 옆에 extends Thread
 	메서드와 관계없이 스레드를 시작할 때는 start() 사용해야지 시작할 수 있음 
 	스레드에서 순서는 스레드가 컴퓨터 안에서 생성되고 시작되는 지점에 따라 달라짐
 
 	스레드는 기본으로 우선순위가 5
 	우선순위는 1~10까지 존재 
 	Thread.MIN_PRIORITY = 우선순위 1 = CPU 자원을가장 적게 확보  
 	Thread.NORM_PRIORITY = 우선순위 5(기본)
 	Thread.MAX_PRIORITY=우선순위 10 = CPU 자원을 더 많이 확보
 	
 	만약에 우선순위에서 1 5 10 이외의 우선순위를 사용하고 싶을 때
 	
 	만약에 우선순위 3으로 두고싶다
 	setPriority(3);으로 두면 3을 사용 가능 
 	우선순위를 6으로 두고싶다.
 	setPriority(6);
 	
 스레드에서 말하는 우선순위는 CPU 자원을 더 많이 확보하는 우선순위	
 우선순위가 높은 스레드가 항상 먼저 실행되는 것은 아님 
 
 	sleep() 	: ~~초 간 잠자는 상태 유지
 					└알아서 ~~초후에 일어나서 실행
 	//현재 사용이 권장되지는 않음 있기는 하지만 권장 x
 	 				
 	suspend() : 일시 중지
 					└알아서 일어나기 x resume으로 깨워야함
 	resume() : 일시 중지한 스레드 다시 실행
 	
 	저기 위에있는걸 대체로 나온 게 
 	
 	wait():  특정 조건이 충족될때까지 대기
 	notify(): 대기중인 스레드를 깨워 특정 작업을 진행하도록 함
 	
 	
 	await():Condition이라는 객체가 있음 이 객체에 속한 스레드를 일시적으로 대기상태로 만듬  		
 	signal():await에 의해 대기하고 있는 스레드를 깨움 
 */

public class ThreadEx extends Thread{
	
	public void run() {
		System.out.println("스레드 실행 중");
		
		try {
			Thread.sleep(5000);
			System.out.println("5초 끝");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//1초 동안 정지
	}

}
