package seventh;

class B {

	public static void main(String[] args) {
		A box=new A();
		A box1=new A();
		int volume;
		
		C box2=new C();
		int totaly;
		box2.m=23;
		box2.n=33;
		box2.k=2;
		
		box.setParameter(22, 55);
		int dim;
		box1.k=10;
		box1.l=33;
		
		
		volume=box.vol();
		System.out.println(volume);
		
		dim=box1.diam();
		System.out.println(dim);
		
		totaly=box2.totel();
		System.out.println(totaly);

	}

}
