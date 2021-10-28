package seventh;

public class B {

	public static void main(String[] args) {
		A box=new A();
		A box1=new A();
		int volume;
		
		box.setParameter(22, 55);
		int dim;
		box1.k=10;
		box1.l=33;
		
		
		volume=box.vol();
		System.out.println(volume);
		
		dim=box1.diam();
		System.out.println(dim);

	}

}
