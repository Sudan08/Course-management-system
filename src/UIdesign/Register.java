package UIdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPanel panel_2;
	private CardLayout cl_cardPanel= new CardLayout(0,0);
	private String UniID;
	private String UserName;
	private String Password;
	private String Name;
	private BigInteger PhoneNumber;
	private String EmailAddress;
	private Date DOB;
	private String Address;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1347, 771);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE))
		);
		
		JSplitPane splitPane = new JSplitPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
		);
		
		JPanel imagePanel = new JPanel();
		splitPane.setLeftComponent(imagePanel);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon("C:\\Users\\sudan\\eclipse-workspace\\CourseManagementSystem\\src\\image\\Hidden person-pana.png"));
		GroupLayout gl_imagePanel = new GroupLayout(imagePanel);
		gl_imagePanel.setHorizontalGroup(
			gl_imagePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_imagePanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(image)
					.addContainerGap())
		);
		gl_imagePanel.setVerticalGroup(
			gl_imagePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_imagePanel.createSequentialGroup()
					.addGap(122)
					.addComponent(image)
					.addContainerGap(140, Short.MAX_VALUE))
		);
		imagePanel.setLayout(gl_imagePanel);
		
		JPanel panel_2 = new JPanel();
		splitPane.setRightComponent(panel_2);
		panel_2.setLayout(cl_cardPanel);
		
		JPanel first = new JPanel();
		panel_2.add(first, "name_181732992991200");
		
		JLabel lblNewLabel = new JLabel("Registration for Student");
		lblNewLabel.setFont(new Font("Perpetua", Font.BOLD, 36));
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JLabel lblDob = new JLabel("Date of Birth:");
		lblDob.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JLabel lblName_1_1 = new JLabel("Phone Number:");
		lblName_1_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JLabel lblName_1_2 = new JLabel("Email Address:");
		lblName_1_2.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JLabel lblName_1_2_1 = new JLabel("Address:");
		lblName_1_2_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		
		JButton btnNewButton = new JButton("Proceed");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cl_cardPanel.show(panel_2,"name_183512565776100");
			}
		});
		btnNewButton.setFont(new Font("Perpetua", Font.PLAIN, 25));
		GroupLayout gl_first = new GroupLayout(first);
		gl_first.setHorizontalGroup(
			gl_first.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_first.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_first.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_first.createSequentialGroup()
							.addGroup(gl_first.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_first.createSequentialGroup()
									.addGroup(gl_first.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDob, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
										.addComponent(lblName_1_1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_first.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(dateChooser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(textField_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
										.addGroup(gl_first.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_first.createSequentialGroup()
									.addGroup(gl_first.createParallelGroup(Alignment.LEADING)
										.addComponent(lblName_1_2, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblName_1_2_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
									.addGap(141)))
							.addGap(27)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
							.addGap(41))
						.addGroup(gl_first.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
							.addGap(213))))
		);
		gl_first.setVerticalGroup(
			gl_first.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_first.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDob, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblName_1_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblName_1_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblName_1_2_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_first.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		first.setLayout(gl_first);
		
		JPanel second = new JPanel();
		panel_2.add(second, "name_183512565776100");
		
		JLabel lblNewLabel_1 = new JLabel("Registration for Student");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.BOLD, 36));
		
		JLabel lblName_1_1_1 = new JLabel("UNI ID:");
		lblName_1_1_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblName_1_1_1_1 = new JLabel("Username:");
		lblName_1_1_1_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblName_1_1_1_1_1 = new JLabel("Password:");
		lblName_1_1_1_1_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JLabel lblName_1_1_1_1_1_1 = new JLabel("Confirm Password:");
		lblName_1_1_1_1_1_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		GroupLayout gl_second = new GroupLayout(second);
		gl_second.setHorizontalGroup(
			gl_second.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_second.createSequentialGroup()
					.addContainerGap(244, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
					.addGap(228))
				.addGroup(gl_second.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_second.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_second.createSequentialGroup()
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
							.addGap(63))
						.addGroup(gl_second.createSequentialGroup()
							.addGroup(gl_second.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName_1_1_1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName_1_1_1_1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(462, Short.MAX_VALUE))))
		);
		gl_second.setVerticalGroup(
			gl_second.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_second.createSequentialGroup()
					.addGap(34)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
					.addComponent(lblName_1_1_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblName_1_1_1_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(lblName_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblName_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_second.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(46))
		);
		second.setLayout(gl_second);
		splitPane.setDividerLocation(450);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
