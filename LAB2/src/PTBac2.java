/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class PTBac2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Nhập a
		System.out.println("Nhập hệ số a : ");
		double a = scanner.nextDouble();
		// Nhập b
		System.out.println("Nhập hệ số b : ");
		double b = scanner.nextDouble();
		// Nhập c
		System.out.println("Nhập hệ số c : ");
		double c = scanner.nextDouble();
		
		// Tính delta
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		// Tính căn delta
		double canDelta = Math.sqrt(delta);
		
		// Tính và xuất nghiệm phương trình
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("Phuơng trình có vô số nghiệm");
				}
				else {
					System.out.println("Phương trình vô nghiệm");
				}
			}
			else {
				double x = -c/b;
				System.out.println("Phương trình có nghiệm là : " + x);
			}
		}
		else {
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}
			else if (delta == 0) {
				double x = - b / (2 *a);
				System.out.println("Phương trình có nghiệm kép là : " + x);
			}
			else {
				double x1 = ( - b + canDelta)/(2 * a);
				double x2 = ( - b - canDelta)/(2 * a);
				System.out.println("Phương trình có 2 nghiệm là : " + x1 + x2);
			}
		}
		scanner.close();
	}

}
