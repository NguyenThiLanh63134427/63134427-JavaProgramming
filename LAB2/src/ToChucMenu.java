/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class ToChucMenu {
	//Phương thức hiển thị menu 
	public static void menu() {	
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("+---------------------------------------------------+");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int luaChon;
		
		do {
			menu();
			System.out.println("Chọn chức năng (1 - 4) : ");
			luaChon = scanner.nextInt();
			
			switch(luaChon) {
				case 1:
					PTBac1();
					break;
				case 2:
					PTBac2();
					break;
				case 3: 
					TienDien();
					break;
				case 4:
					System.out.println("Kết thúc chương trình");
					break;
			default:
				System.out.println("Sai lựa chọn. Vui lòng chọn lại.");
			}
		} while(luaChon != 4);
	scanner.close();
	}
	public static void PTBac1() {
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
		
	}
	public static void PTBac2() {
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
				System.out.println("Phương trình có 2 nghiệm lần lượt là : " + x1 + x2);
			}
		}
	}
	public static void TienDien() {
		Scanner scanner = new Scanner(System.in);
		
		// Nhập số kg điện đã dùng tháng này
		System.out.println("Nhập vào số kg điện đã sử dụng của tháng này: ");
		int soDien = scanner.nextInt();
		int tien; 
		
		// Tính tiền điện
		if(soDien<50) {
			tien = soDien * 1000;
		}
		else {
			tien = 50 * 1000 + (soDien - 50) * 1200;
		}
		
		// Xuất tiền điện
		System.out.println("Tiền điện tháng này của bạn là : " + tien + "VND");
	}
}
