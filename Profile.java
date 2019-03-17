package Method_task;

public class Profile {

	public static void main(String[] args) {
		Character aruth = new Knight("アルス",100,50,30);
		Character cloud = new Magician("クラウド",50,100,25);

		aruth.Introduce();
		cloud.Introduce();

		System.out.println("--------------------------");
		aruth.attack(cloud);
		cloud.attack(aruth);

	}

}
