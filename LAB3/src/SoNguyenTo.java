/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class SoNguyenTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Nhập vào giá trị một số nguyên
		System.out.println("Nhập giá trị cho số nguyên N : ");
		int N = scanner.nextInt();
		
		boolean ok = true;
		for(int i=2; i < N-1; i++){ 
			if(N % i == 0){
				ok = false;
				break;
			}
			i++;
		}
		
		if(ok == true) {
			System.out.println("N là số nguyên tố.");
		}
		else {
			System.out.println("N không phải là số nguyên tố.");
		}
		
	scanner.close();
		
	}

}
