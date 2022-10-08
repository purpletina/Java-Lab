/**
 * 
 */
package Java08;

class CSphere {
	private int x;
	private int y;
	private int z;
	private int radius;
	void setLocation(int i, int j, int k) {
		x = i; y = j; z = k;
	}
	void setRadius(int r) {
		radius = r;
	}
	double surfaceArea() {
		return (double)4*3.14*radius*radius;
	}
	double volume() {
		return (double)3.14*radius*radius;
	}
	void showCenter() {
		System.out.println("Circle center" + "x=" + x + " " + "y=" + y + " " + "z=" + z + " " + "radius" +radius);
	}
}

public class hw7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSphere cs = new CSphere();
		cs.setLocation(3,4,5);
		cs.setRadius(1);
		System.out.println("surface area="+cs.surfaceArea());
		cs.showCenter();
	}
}
