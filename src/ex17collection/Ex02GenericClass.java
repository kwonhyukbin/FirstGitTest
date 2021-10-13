package ex17collection;

//과일을 표현한 클래스
class Apple{
	int weight;
	public Apple(int w) {
		weight = w;
	}
	public void showInfo() {
		System.out.println("사과의 무게는"+ weight +"입니다.");
	}
}
class Banana {
	int sugar;
	public Banana(int s) {
		sugar = s;
	}
	public void showInfo() {
		System.out.println("바나나의 당도는"+ sugar +"입니다.");
	}
}
/*
class FruitBox{
	Object item;
	public FruitBox(Object item) {
		this.item = item;
	}
	public void store(Object item) {
		this.item  = item;
	}
	public Object pullOut() {
		return item;
	}
} =>기존 Object기반의 FruitBox를 아래와 같이 제네릭 클래스로
변경한다.자료형에 해당하는 부분을 타입매개변수<T>로 교체하고
객체생성시 자료형을 결정하기 위해 클래스명<자료형>형태로
기술한다
*/
class GenericFruitBox<T> {
	T item; 
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}
public class Ex02GenericClass
{

	public static void main(String[] args)
	{
		/*
		 인스턴스 생성시 T부분을 결정하므로 구현의 편의성이 보장된다.
		 각각 Apple, Banana객체를 저장할 수 있는 인스턴스가 생성되었다.
		 */
     GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
     appleBox.store(new Apple(10));
     Apple apple = appleBox.pullOut();
     apple.showInfo();
     
     GenericFruitBox<Banana> BananaBox = new GenericFruitBox<Banana>();
     BananaBox.store(new Banana(20));
     Banana Banana = BananaBox.pullOut();
     Banana.showInfo();
     
     /*
      OrangeBox는 인스턴스 생성시 Orange를 저장할수 있는 용도로
      생성되었기 때문에 다른 객체는 저장할수 없다.
      아래 코드에서 컴파일 에러가 발생하므로 자료형에도 안전한
      코드가 된다.
      */
     GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
     //orangeBox.store("나는 오렌지"); =>컴파일에러 발생됨
     //orangeBox.store(apple); =>컴파일에러 발생됨
     //orangeBox.store(Banana); =>컴파일에러 발생됨
     
	}

}
