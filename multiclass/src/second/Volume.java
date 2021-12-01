package second;

public class Volume {

	public static void main(String[] args) {
		Box firstBox=new Box();
		Box secondBox=new Box();
		double vol;
		double vol1;
		firstBox.height=10;
		firstBox.width=33;
		
		secondBox.height=21;
		secondBox.width=22;
		vol= firstBox.volume();
		vol1=secondBox.volume();
		System.out.println(vol);
		System.out.println(vol1);
		//we can get same output without variable vol & vol1 by below 
		System.out.println(firstBox.volume());
		
		System.out.println(secondBox.volume());
		
		

	}

}
	