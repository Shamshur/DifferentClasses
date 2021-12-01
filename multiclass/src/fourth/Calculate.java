package fourth;

public class Calculate {

	public static void main(String[] args) {
		Circle one=new Circle();
		Circle two=new Circle();
		float areaOfCircle;
		one.setDimension(3.14F, 11F);
		two.setDimension(3.14F, 10F);
		
		areaOfCircle=one.area();
		System.out.println(areaOfCircle);

	}

}
