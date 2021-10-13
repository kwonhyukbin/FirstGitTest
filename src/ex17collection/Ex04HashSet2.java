package ex17collection;

import java.util.HashSet;

import common.Student;

public class Ex04HashSet2 {
	public static void main(String[]args) {
		/*
		 아래의 경우 s3과 s3Copy는 동일한 객체이므로 중복제거를 위해서는
		 Student클래스에 hashCode(),equals() 메서드를 오버라이딩 하여
		 객체간의 hash값비교, 멤버변수간의 비교를 진행해야 한다.
		 */
		HashSet<Student> hashSet = new HashSet<Student>();
		
		Student s1 = new Student("정우성",40,"2000-01");
		Student s2 = new Student("황정민",42,"2000-02");
		Student s3 = new Student("최민식",44,"2000-03");
		
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		
		System.out.println("hashSet의 크기"+ hashSet.size());
		//오버라이딩 후에는 저장되지 않는다.
		
		Student s3copy = new Student("최민식",44,"2000-03");
		/*
		 현재는 Student클래스에 stNumber(학번)만을 비교하고 있으므로
		 학번이 동일하면 같은 객체로 취급된다.
		 */
		System.out.println("s3Copy저장여부:"+ hashSet.add(s3copy));
		System.out.println("hashSet의 크기"+ hashSet.size());
	}
}
