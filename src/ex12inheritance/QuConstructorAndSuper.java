package ex12inheritance;

class Car	{
	
	int gasoline;
	public Car(int gasoline) {
		this.gasoline = gasoline;
		System.out.println("Car생성자 호출");
	}

}
class HybridCar extends Car{
	
	int electric;
	public HybridCar(int gasoline, int electric) {
		super(gasoline);
		this.electric = electric;
		System.out.println("HybridCar생성자 호출");
	}
}
class HybridWaterCar extends HybridCar {
	int water;
    public HybridWaterCar(int gasoline,int electric, int water) {
    	super(gasoline,electric);
    	this.water = water;
    	System.out.println("HybridWaterCar생성자 호출");
    	
    }
	
	public void showNowGauge() {
		System.out.println("남은가솔린:"+gasoline);
		System.out.println("남은전기량:"+electric);
		System.out.println("남은워터량:"+water);
	}
}
public class QuConstructorAndSuper
{

	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
       
	}

}
