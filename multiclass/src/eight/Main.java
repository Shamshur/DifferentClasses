package eight;

class Main {

	public static void main(String[] args) {
		Alpha ob=new Alpha();
		double calc;//jab yahan variable calc hoga usme sirf ";" yeh hoga
		
		Gamma subOb=new Gamma(10,20);
		subOb.see();
		
		
		ob.setParameter(100, 200, 300);
        calc=ob.vol();
        System.out.println(calc);
		
			
	}

}

