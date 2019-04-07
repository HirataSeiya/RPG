package Method_task;

public class Magician extends Character{
	Magician(String name,int hp,int mp,int power) {
		super(name,hp,mp,power);
	}

	@Override
	void introduce() {
		System.out.println("オレの名前は"+this.name+",体力は"+this.hp+"魔力は"+mp+"でパワーが"+this.power);
	}

	public void magic() {
		System.out.println("ボクは魔法が得意だ!");
		System.out.println("メラゾーマ!");
		System.out.println(this.mp+"のダメージ!");
	}

	@Override
	public void attack(Character magician) {
		magic();
		magician.damage(this.mp);
	}

}
