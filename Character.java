package Method_task;

public abstract class Character{
	protected String name;
	protected int hp,mp;
	protected int power;

	public Character(String name, int hp, int mp ,int power) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.power = power;
	}

	abstract void introduce();

	public void damage(int power) {
		this.hp -= power;
		System.out.println(this.name+"の体力は残り"+this.hp+"だ!");
		if (this.hp == 0){

			System.out.println("---"+this.name+"は力尽きた---");
			System.exit(0);
		}else {
			System.out.println("ターンエンド");
		}
		System.out.println("");
	}
	abstract void attack(Character target);
}
