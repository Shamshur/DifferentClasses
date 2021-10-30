package eight;

class Main {

	public static void main(String[] args) {
		Alpha ob=new Alpha();
		double calc;//jab yahan variable calc hoga usme sirf ";" yeh hoga
		
		Gamma subOb=new Gamma(10,20);
		int sum;
		subOb.see();
		sum=subOb.sumUP();
		System.out.println(sum);
		
		ob.setParameter(100, 200, 300);
        calc=ob.vol();
        System.out.println(calc);
		
			
	}

}

