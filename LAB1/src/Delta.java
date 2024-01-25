/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Delta {

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
        
        // Xuất kết quả
        System.out.println("Delta của phương trình là: " + delta);
        System.out.println("Căn delta của phương trình là: " + canDelta);

        scanner.close();
	}

}
