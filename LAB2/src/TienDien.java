/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class TienDien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
	scanner.close();
	}
	

}
