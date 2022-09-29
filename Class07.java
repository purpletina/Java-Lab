/**
 * 
 */
package hw1;

class CTest {
	int x;
	void test(int x) {
		if(x == 0) {
			System.out.println("此數為0");
		}else if(x%2!=0) {
			System.out.println("此數為奇數");
		}else {
			System.out.println("此數為偶數");
		}
	}
}
	public class hw7 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CTest s = new CTest();
			System.out.println("test(0)");
			s.test(0);
			System.out.println("test(3)");
			s.test(3);
			System.out.println("test(8)");
			s.test(8);
}
	}
