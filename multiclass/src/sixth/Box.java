package sixth;

public class Box {
	double height;
	double width;
	double depth;
	
	Box(double h, double w, double d){
		height=h;
		width=w;
		depth=d;
	}
//constructors used when no dimension specified
	Box(){
		height=-1;
		width=-1;
		depth=-1;
	}
	//constructor used for cube creation
	Box(double len){
		height=width=depth=len;
	}
	//compute and return volume
	double volume() {
		return height*width*depth;
	}
}


