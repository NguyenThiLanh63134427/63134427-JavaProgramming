import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	
	public ManHinhTinhToan() {
		setTitle("Chương trình Tính Toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IbINhpSTn = new JLabel("Nhập số thứ nhất (a)  ");
		IbINhpSTn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		IbINhpSTn.setBounds(67, 39, 220, 41);
		contentPane.add(IbINhpSTn);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)  ");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(67, 110, 220, 41);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(233, 39, 270, 41);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(233, 110, 270, 41);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Cộng ở đây
				//Viết lệnh ở một thủ tục/ hàm rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(67, 183, 89, 46);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Trừ ở đây
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(198, 183, 89, 46);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Nhân ở đây
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(331, 183, 89, 46);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Chia ở đây
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(458, 183, 89, 46);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("KẾT QUẢ Tính Toán : ");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(67, 260, 220, 41);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(233, 260, 270, 41);
		contentPane.add(txtKetQua);
	} //hết hàm tạo
	void HamXuLyCong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//TinhToan
		double tong = soA + soB;
		//Dua ra hien thi len dieu khien
		txtKetQua.setText( String.valueOf(tong));
	}
	void HamXuLyTru(){
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//TinhToan
		double tong = soA - soB;
		//Dua ra hien thi len dieu khien
		txtKetQua.setText( String.valueOf(tong));
	
	}
	void HamXuLyNhan(){
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//TinhToan
		double tong = soA * soB;
		//Dua ra hien thi len dieu khien
		txtKetQua.setText( String.valueOf(tong));
	
	}
	void HamXuLyChia(){
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//TinhToan
		double tong = soA / soB;
		//Dua ra hien thi len dieu khien
		txtKetQua.setText( String.valueOf(tong));
	}
	
}
