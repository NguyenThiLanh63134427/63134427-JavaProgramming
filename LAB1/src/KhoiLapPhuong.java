/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class KhoiLapPhuong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Nhập cạnh của khối lập phương từ bàn phím 
		System.out.println("Nhập giá trị cho cạnh của khối lập phương : ");
		double canh = scanner.nextDouble();
		
		// Tính thể tích khối lập phương
		double theTich = Math.pow(canh,3);
		
		// Xuất thể tích khối lập phương
		System.out.println("Thể tích khối lập phương là : " + theTich);
		
	scanner.close();
	}

}
