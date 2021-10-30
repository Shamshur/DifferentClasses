package eight;

class Gamma {
int x;
int y;

int sumUP() {
	return x+y;
}

Gamma(int c, int d){
	x=c;
	y=d;
}
void see() {
	System.out.println("value of x & y :" + x + "  "+ y);
}
}
