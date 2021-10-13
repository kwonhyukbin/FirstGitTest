package ex19thread;

/*
 쓰레드의 우선순위
     setPriority(우선순위) : 쓰레드의 우선순위를 지정할때
     getPriority() : 쓰레드의 우선순위를 반환할때
 */
class MessageSendingThread extends Thread
{
	String message;
    //생성자1 : 이름만 지정
	public MessageSendingThread(String str)
	{
		message = str;
	}

	//생성자2 : 우선순위까지 지정
	public MessageSendingThread(String str,int pri) {
		message = str;
		setPriority(pri);
	}
	public void run() {
		for(int i=1;i<=1000;i++) {
			//각 쓰레드당 1000번씩 반복출력한다.이때 우선순위를 출력한다.
			System.out.println(message+i+"("+getPriority()+")");
			
			/*
			 기본적으로 우선순위가 높은 쓰레드가 먼저 실행되지만
			 sleep()메서드를 사용하게되면 실행중 잠깐씩 블럭상태로
			 전환되어 우선순위가 낮은 쓰레드도 가끔 실행될수 있는
			 상황이 생기게된다.
			 */
			try {
				sleep(1); //0.001초 동안 블럭상태로 전환
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}



public class Ex02Priority
{

	public static void main(String[] args)
	{
    
		/*
		 1단계실행
		    : 우선순위를 부여하지 않은 상태로 쓰레드를 생성하면
		    동일한 우선순위 5를 부여받게된다. 이때는 CPU가 알아서
		    작업을 분배한다.
		 */
//		MessageSendingThread tr1 = new MessageSendingThread("첫번째");
//		MessageSendingThread tr2 = new MessageSendingThread("두번째");
//		MessageSendingThread tr3 = new MessageSendingThread("세번째");
		
		/*
		 2단계 실행
		    : 정수대신 static(정적) 상수를 사용하여 우선순위를 부여할수도
		    있다. 결과는 3단계와 동일하다.
		 */
		MessageSendingThread tr1 = new MessageSendingThread("첫번째",Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("두번째",Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("세번째",Thread.MIN_PRIORITY);
		
		/*
		 3단계실행
		  : 우선순위 부여를 위해 정수를 사용한다.우선순위는 1~10사이에서
		  부여할수 있고 높을수록 우선순위도 높아지게된다.
		  ※ 단, 우선순위가 높다고 무조건 먼저 실행되지는 않는다.
		  전체적인 확률이 높아지게되어 먼저 실행될 가능성이 높아진다고
		  생각하면 된다.
		 */
//	    MessageSendingThread tr1 = new MessageSendingThread("첫번째",10);
//		MessageSendingThread tr2 = new MessageSendingThread("두번째",5);
//		MessageSendingThread tr3 = new MessageSendingThread("세번째",1);
//		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
