package Method_task;


public class Knight extends Character{
	 Knight(String name,int hp,int mp,int power) {
		super(name,hp,mp,power);
	}

	@Override
	void introduce() {
		System.out.println("オレの名前は"+this.name+",体力は"+this.hp+"魔力は"+mp+"でパワーが"+this.power);
	}

	public void ken() {
		System.out.println("おれは剣技が得意だぜ!");
		System.out.println("くらえ,はやぶさ切り!");
		System.out.println(this.power+"のダメージ!");
	}

	@Override
	public void attack(Character knight) {
		ken();
		knight.damage(this.power);
	}

}
