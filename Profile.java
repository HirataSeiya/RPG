package Method_task;

public class Profile {

	public static void main(String[] args) {
//		Character aruth = new Knight("アルス",100,50,30);
//		Character cloud = new Magician("クラウド",50,100,25);

		int m1 = 2;
		int m2 = 2;

		Character party1[] = new Character[m1];
		party1[0] = new Knight("アルス",100,50,30);
		party1[1] = new Magician("アリーナ",70,40,50);

		Character party2[] = new Character[m2];
		party2[0] = new Magician("クラウド",50,100,25);
		party2[1] = new Knight("スコール",40,50,70);

	    int i = 0;
	    for(i=0;i<=m1;i++) {
		party1[i].Introduce();
			party1[i].attack(party2[i]);
			System.out.println("--------------------------");
		}

		for(i=0;i<=m1;i++) {
			party2[i].Introduce();
			party2[i].attack(party1[i]);
			System.out.println("--------------------------");
		}
	}
}


