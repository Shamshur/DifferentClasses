package elevenJedenascie;

public class SecondMain {

	public static void main(String[] args) {
		FirstOne one=new FirstOne();
		FirstOne two=new FirstOne();
		float total;
		float totally;
		//isme individual value de hay one by one
			one.a=22;
			one.b=55;
			total=one.totalArea();
			System.out.println(total);
			//isme object pe laga de hay pata nahi object boolte ki kya
			two.toCalculate(32, 33);
			totally=two.totalArea();
			System.out.println(totally);
		}

	}


