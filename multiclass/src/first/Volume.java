package first;

public class Volume {

	public static void main(String[] args) {
		Box myBox=new Box();
		Box myBox1=new Box();
		double vol;  //If i choose int instead of double error populate
		myBox.width=10;
		myBox1.height=20;
		vol=myBox.width*myBox1.height;
		System.out.println(vol);

	}

}
