/**
 * 
 */
package hw;

class CCircle {
	double pi = 3.14;
	double radius;

	void show_periphery() {
		System.out.println("periphety=" + 2 * pi * radius);
	}
}
	public class hw2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CCircle cir1 = new CCircle();
			cir1.radius = 3.0;
			cir1.show_periphery();

		}

	}
