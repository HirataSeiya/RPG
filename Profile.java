package Method_task;

public class Profile {

	public static void main(String[] args) {
		Character c1 = new Character("アルス",100,50,10);
		Character c2 = new Character("クラウド",50,100,25);

		String target = c1.name;

		c1.Introduce();
		c2.Introduce();

		System.out.println("--------------------------");

		c1.attack(c1.name);
		c2.damage(c2.name,c1.power);
	}

}
