/**
 * 
 */
package hw1;

class CCircle {
	double area;

	double area(double r) {
		area = r * r * 3.14;
		return (double) area;
	}

	float area(float r) {
		area = r * r * 3.14;
		return (float) area;
	}

	int area(int r) {
		area = r * r * 3.14;
		return (int) area;
	}

	public void show() {
		System.out.println("area=" + area);
	}
}

public class hw7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle a = new CCircle();
		a.area(2);
		a.show();
		a.area(2.2f);
		a.show();
		a.area(2.2);
		a.show();
	}
}
