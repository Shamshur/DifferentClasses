package second;

public class Volume {

	public static void main(String[] args) {
		Box firstBox=new Box();
		Box secondBox=new Box();
		double vol;
		firstBox.height=10;
		firstBox.width=33;
		vol= firstBox.volume();
		System.out.println(vol);
		
		

	}

}
