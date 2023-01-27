package UIdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addteacher extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private CardLayout cl_cardPanel= new CardLayout(0,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addteacher frame = new Addteacher();
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
	public Addteacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, 1041, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Addteacher.class.getResource("/image/Hidden person-pana.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 439, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(87)
					.addComponent(lblNewLabel)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(cl_cardPanel);
		
		JPanel First = new JPanel();
		panel_1.add(First, "name_411082232382600");
		
		JLabel lblNewLabel_1 = new JLabel("Add Teacher");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("UserName:");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("ConfirmPassword");
		lblNewLabel_2_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Password");
		lblNewLabel_2_2.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Procced");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_2_4 = new JLabel("Gender");
		lblNewLabel_2_4.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		
		JPanel Third1 = new JPanel();
		panel_1.add(Third1, "name_411358559619900");
		
		GroupLayout gl_Third1 = new GroupLayout(Third1);
		gl_Third1.setHorizontalGroup(
			gl_Third1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_Third1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Third1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Third1.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(230))
						.addGroup(gl_Third1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_Third1.createSequentialGroup()
								.addGroup(gl_Third1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 503, GroupLayout.PREFERRED_SIZE)
									.addGroup(Alignment.TRAILING, gl_Third1.createSequentialGroup()
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addContainerGap(41, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_Third1.createSequentialGroup()
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(264, Short.MAX_VALUE))
							.addGroup(gl_Third1.createSequentialGroup()
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(396, Short.MAX_VALUE))
							.addGroup(gl_Third1.createSequentialGroup()
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(439, Short.MAX_VALUE))
							.addGroup(gl_Third1.createSequentialGroup()
								.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(439, Short.MAX_VALUE))
							.addGroup(gl_Third1.createSequentialGroup()
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(264, Short.MAX_VALUE))
							.addGroup(gl_Third1.createSequentialGroup()
								.addComponent(lblNewLabel_2_4, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(439, Short.MAX_VALUE)))))
		);
		gl_Third1.setVerticalGroup(
			gl_Third1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Third1.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_Third1.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton_2))
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2)
					.addGap(22)
					.addGroup(gl_Third1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(54))
		);
		Third1.setLayout(gl_Third1);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Add Teacher");
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.BOLD, 30));
		
		JLabel lblNewLabel_2_3 = new JLabel("Name:");
		lblNewLabel_2_3.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("DateOfBirth :");
		lblNewLabel_2_3_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JDateChooser dateChooser = new JDateChooser();
		
		JLabel lblNewLabel_2_3_2 = new JLabel("PhoneNumber:");
		lblNewLabel_2_3_2.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("EmailAddress:");
		lblNewLabel_2_3_2_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(panel_1,"name_411912748962900");
			}
		});
		GroupLayout gl_First = new GroupLayout(First);
		gl_First.setHorizontalGroup(
			gl_First.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_First.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_First.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_First.createSequentialGroup()
							.addComponent(lblNewLabel_2_3_2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(53))
						.addGroup(gl_First.createSequentialGroup()
							.addGroup(gl_First.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_First.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_1_1)
									.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
									.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_3_2_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(264, Short.MAX_VALUE))
						.addGroup(gl_First.createSequentialGroup()
							.addComponent(lblNewLabel_2_3_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(439, Short.MAX_VALUE))))
		);
		gl_First.setVerticalGroup(
			gl_First.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_First.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_2_3_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_First.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblNewLabel_2_3_2_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(85, Short.MAX_VALUE))
		);
		First.setLayout(gl_First);
		
		JPanel Second = new JPanel();
		panel_1.add(Second, "name_411912748962900");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Add Teacher");
		lblNewLabel_1_1_1.setFont(new Font("Perpetua", Font.BOLD, 30));
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Address:");
		lblNewLabel_2_3_3.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_2_3_3_1 = new JLabel("Module Taught");
		lblNewLabel_2_3_3_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_2_3_3_1_1 = new JLabel("Qualification:");
		lblNewLabel_2_3_3_1_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_2_3_3_1_1_1 = new JLabel("Position:");
		lblNewLabel_2_3_3_1_1_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JButton btnNewButton_1_1 = new JButton("Next");
		GroupLayout gl_Second = new GroupLayout(Second);
		gl_Second.setHorizontalGroup(
			gl_Second.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Second.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Second.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Second.createSequentialGroup()
							.addComponent(lblNewLabel_2_3_3_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(58))
						.addGroup(gl_Second.createSequentialGroup()
							.addGroup(gl_Second.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_3_3_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_3_3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_3_3_1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(264, Short.MAX_VALUE))))
		);
		gl_Second.setVerticalGroup(
			gl_Second.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Second.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Second.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Second.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(lblNewLabel_2_3_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_3_3_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2_3_3_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_2_3_3_1_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(71))
		);
		Second.setLayout(gl_Second);
		splitPane.setDividerLocation(450);
		contentPane.setLayout(gl_contentPane);
	}
}
