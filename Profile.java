package Method_task;

public class Profile {

	public static void main(String[] args) {
		Character c1;
		c1 = new Character();

		c1.name = "アルス";
		c1.hp = 100;
		c1.mp = 50;

		Character c2;
		c2 = new Character();

		c2.name = "クラウド";
		c2.hp = 50;
		c2.mp = 100;

		c1.Introduce();
		c2.Introduce();
	}

}
