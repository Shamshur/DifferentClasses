package third;

public class Volume {

	public static void main(String[] args) {
		Box firstBox= new Box();
		Box secondBox=new Box();
		int vol;
		
		firstBox.setDimension(22, 30);
		secondBox.setDimension(26, 50);
		
		vol=firstBox.volume();
		System.out.println(vol);

	}

}
