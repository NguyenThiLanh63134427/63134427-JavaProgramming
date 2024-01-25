/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class PTBac1 {

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
		
		// Tính và xuất nghiệm
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình có vô số nghiệm");
				
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			double x = -b/a;
			System.out.println("Phương trình có nghiệm là : " + x);
		}
		
		scanner.close();
	}
	
}
