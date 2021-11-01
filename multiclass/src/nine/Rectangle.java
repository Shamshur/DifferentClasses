package nine;

class Rectangle extends Figure {
Rectangle(double a, double b){
	super(a,b);
}
//override area for rectangle
double area() {
	System.out.println("Inside area of rectangle");
	return dim1 * dim2;
}
}
