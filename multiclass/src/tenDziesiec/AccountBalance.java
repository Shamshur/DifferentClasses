package tenDziesiec;

public class AccountBalance {

	public static void main(String[] args) {
		Balance current[]=new Balance[3];
		current[0]=new Balance("k.j. Fielding", 23.33);
		current[1]=new Balance("William .Thomas", 35.22);
		current[2]=new Balance("thomas.Clarke", 44.99);
		
		for(int i=0;i<3;i++) current [i].show();

	}

}
