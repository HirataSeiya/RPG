package Method_task;

public class Character{
	public String name;
	public int hp,mp;
	public int power;


	public Character() { //初期値
		name = "名無し";
		hp = 1;
		mp = 1;
		power = 1;
	}

	public Character(String name, int hp, int mp ,int power) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.power = power;
	}

	public void Introduce(){
		System.out.println("自己紹介をします。");
		System.out.println("私の名前は"+name+"です。");
		System.out.println("体力は"+hp+"です,魔力は"+mp+"です。");
		System.out.println("攻撃力は"+power+"です!");
		System.out.println("");
	}

	public void damage(String name,int power) {
		System.out.println(name+"は"+power+"のダメージを受けた!");
		this.hp -= power;
		System.out.println(this.name+"の体力は残り"+this.hp+"だ!");
	}

	public void attack(String name) {
		System.out.println(name+"の攻撃");
	}


}
