package Method_task;

public class Hoge {

	public static void main(String[] args) {
		RPG r1;
		r1 = new RPG();

		r1.name = "アルス";
		r1.hp = 100;
		r1.mp = 50;

		RPG r2;
		r2 = new RPG();

		r2.name = "クラウド";
		r2.hp = 50;
		r2.mp = 100;
		
		r1.Introduce();
		r2.Introduce();
	}

}
