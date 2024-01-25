/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class HinhChuNhat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Nhập chiều dài và chiều rộng từ bàn phím
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double rong = scanner.nextDouble();

        // Tính chu vi, diện tích và cạnh nhỏ nhất
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất kết quả
        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + canhNhoNhat);

        // Đóng Scanner
        scanner.close();
    }

}
