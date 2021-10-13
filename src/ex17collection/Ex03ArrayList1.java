package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
 ArrayList<E> : List계열의 컬렉션
 -데이터의 중복 저장이 허용된다.
 -데이터의 저장 순서를 보장한다.
 -데이터 접근시 get() 혹은 iterator()를 이용한다.
 -Array라는 이름처럼 '배열'의 특성을 가지고있어, index를 통한
   저장 및 접근이 가능하다.
 */
public class Ex03ArrayList1
{

	public static void main(String[] args)
	{
     
	/*
	 String 객체를 저장하기 위한 List컬렉션을 생성한다.
	 */
    ArrayList<String> list = new ArrayList<String>();
   // LinkedList<String> list = new LinkedList <String>();
   // Vector<String> list = new Vector<String>();
    
    /*
     객체저장
        add(객체) : 순차적으로 저장하면서 인덱스는 0부터 자동으로 부여된다.
        add(인덱스, 객체) : 인덱스를 개발자가 직접 부여하여 객체를 저장한다.
           단, 인덱스를 건너뛰면 에러가 발생한다.
        size() : 컬렉션에 저장된 객체의 갯수를 반환한다.   
     */
    list.add("소녀시대");
    list.add("빅뱅");
    list.add("트와이스");
    list.add(3,"워너원");
    //  list.add(5,"소방차");
    list.add(list.size(),"오마이걸");
    list.add(list.size(),"BTS");
    System.out.println("중복 저장전 객체수:"+ list.size());//6개 출력
    
    /*
     중복저장
       : List는 배열의 속성을 가지므로 데이터의 중복저장이 허용된다.
       add()메서드는 추가에 성공한 경우 true를 반환한다.
     */
    System.out.println(list.add("트와이스")?"중복저장됨":
    	"중복저장안됨");
    System.out.println("중복 저장후 객체수:"+ list.size());//7개 출력
    
    /*
     출력하기
        : 컬렉션을 다룰때는 주로 확장 for문을 사용한다.
        get(인덱스) : 인덱스에 해당하는 객체를 반환한다.
     */
    System.out.println("\n[일반for문 사용]");
    //일반for문은 인덱스를 통해 컬렉션에 접근해야 한다.
    for(int i=0;i<list.size();i++) {
    	System.out.print(list.get(i)+" ");
    }
    System.out.println("\n[확장for문 사용]");
    //확장for문은 인덱스 없이 바로 객체에 접근할 수 있다.
    for(Object obj : list) {
    	System.out.print(obj +" ");
    }
    
    /*
     Iterator 사용법
     1.컬렉션에 저장된 내용을 Iterator에게 알려주기 위해 객체를
      생성한다.
     2.hasNext()로 반환할 객체가 있는지 확인하고, next()로 객체를
     반환한다
     3.모든객체가 반환되었다면 hasNext()는 false를 반환한다.  
     */
    System.out.println("\n[반복자(Iterator) 사용]");
    Iterator itr = list.iterator();
    while(itr.hasNext()) {
    	System.out.print(itr.next()+"  ");
    }
    System.out.println("\n====================================\n");
    
    /*
     덮어쓰기
       : 기존의 내용을 변경한다. 기존의 내용은 삭제된다
       인덱스를 지정한 후 변경할 객체를 기술하면 된다.
     */
    list.set(4, "오마이걸>덮어쓰기");
    for(Object obj : list) {
    	System.out.print(obj +" ");
    }
    System.out.println("\n================================\n");
    
    /*
     삽입하기(끼워넣기)
       : 인덱스를 지정한 후 삽입할 객체를 기술한다.
       기존데이터는 자동으로 뒤로 밀리게된다.
     */
    list.add(4,"블랙핑크>끼워넣기");
    for(Object obj : list) {
    	System.out.print(obj+"  ");
    }
    System.out.println("\n================================\n");
    
    
    /*
     포함여부확인
        : 컬렉션에 찾고자 하는 객체가 있는지 확인한다.
        만약 포함되어 있다면 true를 반환한다. 위치한 인덱스까지는
        확인할 수 없다.
     */
    System.out.println(list.contains("빅뱅")
            ? "빅뱅 있음":"빅뱅 없음" );
    System.out.println(list.contains("블랙핑크") 
    		? "블랙핑크 있음":"블랙핑크 없음" );
    
    /*
     삭제
     방법1 : 인덱스로 삭제한다. 삭제가 완료되면 삭제된 객체를 반환한다.
         그리고 삭제후에는 인덱스가 자동으로 재부여된다.
         삭제성공시 해당 객체를 반환하므로 어떤 객체를 삭제했는지
         확인할 수 있다.
     */
    Object obj = list.remove(2);
    System.out.println("삭제된 객체: "+ obj);
    
    
    /*
     방법2 : indexOf()메서드로 인덱스를 확인한 후 삭제한다.
     */
    int index = list.indexOf("빅뱅");
    System.out.println("빅뱅의 index="+ index);
    list.remove(index);
    
    /*
     방법3 : 인스턴스(객체)의 참조값을 통해 삭제한다. 이 경우에 삭제에 
              성공하면 true가 반환된다.
     */
    System.out.println(list.remove("BTS")? "삭제성공(bts)": "삭제실패");
    //삭제할 객체가 없더라도 에러가 발생하지는 않는다.
    System.out.println(list.remove("오마이걸")? "삭제성공": "삭제실패");
    
    System.out.println("삭제후 출력");
    for(Object ob : list) {
    	System.out.print(ob +"  ");
    }
    System.out.println();
    
    /*
     전체삭제 :두가지 메서드를 통해 전체삭제할수 있다.
     */
    list.removeAll(list);
    list.clear();
    System.out.println("전체삭제후 객체수:"+ list.size());
    
	}

}
