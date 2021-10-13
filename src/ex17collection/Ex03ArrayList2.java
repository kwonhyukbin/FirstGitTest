package ex17collection;

import common.Person;
import common.Student;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03ArrayList2
{

	public static void main(String[] args)
	{
	/*
	 아래 2개의 컬렉션은 내부적인 자료구조만 다를뿐, 구현방법은
	 완전히 동일하다.
	 컬렉션 생성시 Student 형의 타입매개변수를 사용한다.
	 */
		
       LinkedList<Student> list2 = new LinkedList<Student>(); 
       
       //개발자가 정의한 인스턴스 생성(외부패키지에 정의함)
       Student st1 = new Student("정우성",10,"2018"); 
       Student st2 = new Student("원빈",20,"2017"); 
       Student st3 = new Student("장동건",10,"2016"); 
       Student st4 = new Student("공유",10,"2015"); 
       
       //컬렉션에 인스턴스 저장
       list2.add(st1);//인덱스0
       list2.add(st2);
       list2.add(st3);
       list2.add(st4);//인덱스3
       list2.add(st2);//리스트이므로 중복저장 가능
       
       System.out.println("[중복저장후]");
       for(Student st : list2) {
    	   st.showInfo(); //5개출력
       }
       
       /*
        객체삭제 : 인덱스가 아닌 인스턴스의 참조값을 통해 삭제하는 경우
         중복된 객체가 있으면 앞에있는 인스턴스 하나만 삭제된다.
        */
	   list2.remove(st2);
	   System.out.println("중복 저장된 객체 삭제후");
	   for(Student st : list2) {
		   st.showInfo();//4개출력
	   }
	   System.out.println("이터레이터 사용");
	   Iterator<Student> it2 = list2.iterator()	;
	   while(it2.hasNext()) {
//		   Student student = it2.next();
//		   student.showInfo();
		   //위 2줄의 코드를 아래 1줄로 고칠수있다.
		   it2.next().showInfo();
	   }
	   
	   //List 계열의 컬렉션은 인덱스로 접근할 수 있다.
	   System.out.println("[일반 for문 사용]");
	   for(int i=0; i<list2.size();i++) {
		   list2.get(i).showInfo();
	   }
	   
	   System.out.println("[확장 for문 사용]");
	   for(Student st : list2) {
		   st.showInfo();
	   }
	   /*
	    Person객체의 멤버변수는 모두 private으로 선언했으므로 외부에서는
	    직접 접근할수 없다.getter/setter를 통해 접근해야한다.
	    remove()메서드는 삭제에 성공할경우 삭제된 객체를 반환하므로
	    삭제된 객체의 정보를 출력할 수 있다.
	    */
	   //인덱스를 통한 삭제(객체 자체가 반환됨)
	   System.out.println("삭제된 객체의 이름:"+ list2.remove(2).getName());
	   //인스턴스의 참조값을 통한 삭제(boolean값이 반환됨)
	   System.out.println("인스턴스를 통한 삭제:"+list2.remove(st1));
	   
	   System.out.println("[인스턴스 삭제후]");
	   for(Student st : list2) {
		   st.showInfo();
	   }
	}
	

}
