package third;

public class Box {
	int width;
	int height;
	//most effective way to write these kind of program
	int volume() {
		return width*height;
	}
	void setDimension(int w, int h) {
		width=w;
		height=h;
	}

}
