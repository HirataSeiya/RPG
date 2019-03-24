package Method_task;

public class Profile {

	public static void main(String[] args) {

		int m1 = 2;
		int m2 = 2;

		Character party1[] = new Character[m1];
		party1[0] = new Knight("アルス",100,50,30);
		party1[1] = new Magician("アリーナ",70,80,50);

		Character party2[] = new Character[m2];
		party2[0] = new Magician("クラウド",50,70,25);
		party2[1] = new Knight("スコール",100,50,70);

	    for(int i=0;i<m1;i++) {
	    	party1[i].Introduce();
			party1[i].attack(party2[i]);
			System.out.println("--------------------------");
		}

		for(int i=0;i<m2;i++) {
			party2[i].Introduce();
			party2[i].attack(party1[i]);
			System.out.println("--------------------------");
		}
	}
}


