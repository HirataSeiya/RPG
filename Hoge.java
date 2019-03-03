package Method_task;

public class Hoge {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Introduce i1;
		i1 = new Introduce();

		i1.name = "アルス";
		i1.hp = 100;
		i1.mp = 50;

		Introduce i2;
		i2 = new Introduce();

		i2.name = "クラウド";
		i2.hp = 50;
		i2.mp = 100;
		
		i1.hello();
		i2.hello();
	}

}
