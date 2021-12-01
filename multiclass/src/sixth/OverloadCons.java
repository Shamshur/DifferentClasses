package sixth;

public class OverloadCons {

	public static void main(String[] args) {
	Box box1= new Box(10,20,15);
	Box box2= new Box();
	Box box3= new Box(7);
	double vol;
	
	//get vol of first box
	vol=box1.volume();
	System.out.println("Vol of box1 is :" + vol);
	
	//get vol of second box
	vol=box2.volume();
	System.out.println("Vol of box2 is :" + vol);
	
	//get volume of cube
	vol=box3.volume();
	System.out.println("Vol of cube is :" + vol);

	}

}
