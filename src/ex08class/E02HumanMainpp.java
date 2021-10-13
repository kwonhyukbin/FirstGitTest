package ex08class;

public class E02HumanMainpp
{

	public static void main(String[] args)
	{
		Human human = new Human();
		
		human.name= "마이클";
		human.age = 28;
		human.energy =4;
		
		human.showState();
		human.eating();
		human.walk();
		human.thinking();
		human.showState();
		
		for(int i=1 ; i<=20;i++) {
			human.walk();
		}
                human.showState();
        for(int i=1;i<=20;i++) {
        	human.eating();
        }
        human.showState();
	}

}
