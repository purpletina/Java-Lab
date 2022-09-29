/**
 * 
 */
package hw;
class CBox{
	int length;
	int width;
	int height;
	void volume() {
		System.out.println("volume=" + length*width*height);
	}
	void surfaceArea() {
		System.out.println("surfaceArea=" + (length*width + width*height + height*length)*2);
	}
	void showData() {
		System.out.println("length=" + length);
		System.out.println("width=" + width);
		System.out.println("height=" + height);
	}
	void showAll() {
		showData();
		surfaceArea();
		volume();
	}
}
public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box;
		box = new CBox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.showAll();
	}

}
