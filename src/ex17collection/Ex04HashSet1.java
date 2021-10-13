package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

/*
 HashSet컬렉션
    : Set계열의 인터페이스를 구현한 컬렉션으로
    -객체가 순서없이 저장된다.
    -객체의 중복저장을 기본적으로 혀횽하지 않는다.
    단,기본클래스가 아닌 새롭게 정의한 클래스라면
    hashCode(),equals()를 적절히 오버라이딩하여 정의해야한다.
    -List가 배열의 성격이라면 set은 집합의 성격을 가진다.
 */
public class Ex04HashSet1
{

	public static void main(String[] args)
	{
     //Object를 기반으로 한 Set컬렉션 생성
    HashSet<Object> set = new HashSet<Object>();
    
    //다양한 객체 생성
    String strObject1 = "JAVA";
    String strObject2 = new String("KOSMO15기");
    Date dateObject = new Date();
    int number =100;//정수타입은 컬렉션에 저장시 Integer형으로 객체로 Boxing된다.
    Teacher teacher = new Teacher("김봉두",55,"체육");
    
    /*
     객체저장
       : add()메서드를 통해 저장되고, 문제가 없다면 true가
       반환된다.
     */
    System.out.println(set.add(strObject1));
    set.add(strObject2);
    set.add(dateObject);
    set.add(number);
    set.add(teacher);
    
    System.out.println("[중복저장전 객체수]:"+ set.size());//5개
    /*
     기본클래스의 객체 중복저장
      : 기본클래스인 경우 별도의 오버라이딩 없어도
        중복이 제거된다.따라서 아래의 경우 false가 반환된다.
     */
    System.out.println(set.add(strObject2) ? "저장성공":"저장실패");
    System.out.println("[중복(String)저장후 객체수]:"+ set.size());//5개
    
    /*
     개발자가 직접 정의한 객체의 중복저장
      : 사용자정의 클래스인 경우 hashCode, equals메서드를
      오버라이딩 하지 않으면 중복저장이 허용된다. 아래의 경우
      저장에 성공하여 true가 반환된다.
     */
    Teacher teacher2 = new Teacher("김봉두",55,"체육");
    System.out.println(set.add(teacher2)? "성공":"실패");
    System.out.println("[중복(teacher2)저장후 객체수]:"+set.size());//6개
    
    /*
     이터레이터를 통한 객체 출력
      : 순서없이 저장되므로 출력의 순서도 정할수 없다.
     */
    Iterator itr = set.iterator();//이터레이터 객체 생성 및 준비
    while(itr.hasNext()) {//추출할 객체가 있는지 확인 후
    	Object object = itr.next();//추출
    	
    	/*
    	 Set에 저장된 모든 객체는 Object형으로 업캐스팅되므로
    	 사용시에는 다운캐스팅 하는것이 좋다.
    	 */
    	if(object instanceof String) {
    		System.out.println("String타입:"+ object);
    	}
    	else if(object instanceof Date) {
    		System.out.println("Date타입"+ object);
    	}
    	else if(object instanceof Integer ) {
    		System.out.println("Integer타입:"+ object);
    	}
    	else if(object instanceof Teacher) {
    		System.out.println("Teacher타입:"+((Teacher)object).getInfo());
    	}
    	else {
    		System.out.println("넌 뭐임");
    	}
    }
    
    /*
     포함여부 확인
        : Set컬렉션 내에 해당 객체가 있는지만 확인한다.
     */
    System.out.println(set.contains(strObject1)?
    		"strObject1있다":"strObject1없다");
    System.out.println(set.contains("JaVa")?"JAVA있다":"JAVA없다");
    
    /*
     객체 삭제
        : Set은 인덱스가 없으므로 객체의 참조값을 통해서만
        삭제할 수 있다.
     */
    System.out.println(set.remove(strObject2)?
    		"strObject2삭제성공":"strObject2삭제실패");
    System.out.println(set.remove("Android")?"Android삭제성공":"Android삭제실패"); 
    System.out.println("[삭제 후 객체수]"+ set.size());
    
    /*
     전체삭제
     */
    set.clear();
    System.out.println("전체삭제:"+set.removeAll(set));
    System.out.println("[전체삭제후 객체수]:"+set.size());
   }

}
