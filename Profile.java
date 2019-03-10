package Method_task;

public class Profile {

	public static void main(String[] args) {
		Character c1 = new Character("アルス",100,50,10);
		Character c2 = new Character("クラウド",50,100,25);

		c1.Introduce();
		c2.Introduce();

		System.out.println("--------------------------");

		c1.attack(c2);
	}

}
