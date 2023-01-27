package UIdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class Student extends JFrame {

	private JPanel contentPane;
	private static Student frame = new Student();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
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
	public Student() {
		initialize();
	}
	
	public void initialize() {
		
		setTitle("Student \r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1083, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JSplitPane splitPane = new JSplitPane();
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(242, 239, 233));
		splitPane_1.setLeftComponent(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Announcement : AI report submission deadline tommrow");
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 30));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(47, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2)
					.addGap(42))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel CardLayout = new JPanel();
		CardLayout.setBackground(new Color(242, 239, 233));
		splitPane_1.setRightComponent(CardLayout);
		CardLayout.setLayout(new CardLayout(0, 0));
		
		JPanel Home = new JPanel();
		CardLayout.add(Home, "name_346511788040900");
		
		JButton btnNewButton_4_2 = new JButton("NMC");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_2.setBackground(new Color(191, 180, 143));
		btnNewButton_4_2.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JLabel lblNewLabel_3 = new JLabel("2 submission pending");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Perpetua", Font.PLAIN, 15));
		
		JButton btnNewButton_4 = new JButton("OOP");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_4.setBackground(new Color(191, 180, 143));
		
		JButton btnNewButton_4_1 = new JButton("AI");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_4_1.setBackground(new Color(191, 180, 143));
		
		JLabel lblNewLabel_3_2 = new JLabel("No submission pending");
		lblNewLabel_3_2.setForeground(Color.RED);
		lblNewLabel_3_2.setFont(new Font("Perpetua", Font.PLAIN, 15));
		
		JLabel lblNewLabel_3_1 = new JLabel("submitted");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Perpetua", Font.PLAIN, 15));
		GroupLayout gl_Home = new GroupLayout(Home);
		gl_Home.setHorizontalGroup(
			gl_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4_2, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_1)
						.addComponent(btnNewButton_4_1, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_Home.setVerticalGroup(
			gl_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home.createSequentialGroup()
					.addGap(104)
					.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4_1, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
						.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
						.addComponent(btnNewButton_4_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Home.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_3_2)
						.addComponent(lblNewLabel_3_1))
					.addGap(143))
		);
		Home.setLayout(gl_Home);
		
		JPanel History = new JPanel();
		CardLayout.add(History, "name_346899910112800");
		
		JPanel ViewResult = new JPanel();
		CardLayout.add(ViewResult, "name_346912388694800");
		
		JPanel Setting = new JPanel();
		Setting.setBackground(new Color(242, 239, 233));
		CardLayout.add(Setting, "name_347116821530900");
		
		JLabel lblNewLabel_9 = new JLabel("Setting");
		lblNewLabel_9.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JLabel lblNewLabel_10 = new JLabel("UserName:");
		lblNewLabel_10.setFont(new Font("Perpetua", Font.PLAIN, 22));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setBackground(new Color(242, 239, 233));
		
		JButton btnNewButton_5 = new JButton("Change Username");
		btnNewButton_5.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_5.setBackground(new Color(208, 252, 179));
		
		JLabel lblNewLabel_10_1 = new JLabel("Confirm Password");
		lblNewLabel_10_1.setFont(new Font("Perpetua", Font.PLAIN, 22));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_1.setBackground(new Color(242, 239, 233));
		
		JLabel lblNewLabel_10_1_1 = new JLabel("New Password");
		lblNewLabel_10_1_1.setFont(new Font("Perpetua", Font.PLAIN, 22));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_2.setBackground(new Color(242, 239, 233));
		
		JButton btnNewButton_4_1_1 = new JButton("Publish Report");
		btnNewButton_4_1_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_4_1_1.setBackground(new Color(208, 252, 179));
		
		JButton btnNewButton_5_1 = new JButton("Change Password");
		btnNewButton_5_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_5_1.setBackground(new Color(230, 57, 70));
		
		JButton btnNewButton_4_3 = new JButton("Delete Database");
		btnNewButton_4_3.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_4_3.setBackground(new Color(230, 57, 70));
		GroupLayout gl_Setting = new GroupLayout(Setting);
		gl_Setting.setHorizontalGroup(
			gl_Setting.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Setting.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Setting.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Setting.createSequentialGroup()
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_10_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Setting.createSequentialGroup()
							.addGroup(gl_Setting.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_10_1_1)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
								.addComponent(btnNewButton_4_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(btnNewButton_5_1, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addGap(177)
							.addComponent(btnNewButton_4_3, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
					.addGap(180))
		);
		gl_Setting.setVerticalGroup(
			gl_Setting.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Setting.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_Setting.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Setting.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_Setting.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_5)))
						.addGroup(gl_Setting.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel_10)))
					.addGap(29)
					.addGroup(gl_Setting.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Setting.createSequentialGroup()
							.addComponent(lblNewLabel_10_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblNewLabel_10_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_5_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_Setting.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4_1_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(66))
		);
		Setting.setLayout(gl_Setting);
		splitPane_1.setDividerLocation(125);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(242, 239, 233));
		splitPane.setLeftComponent(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Student.class.getResource("/image/Students-icon.png")));
		
		JLabel lblNewLabel_1 = new JLabel("Student ");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JButton btnNewButton = new JButton("Log out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Login login = new Login();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JButton btnDashboard = new JButton("Home");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDashboard.setBackground(new Color(191, 180, 143));
		btnDashboard.setIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\home.png"));
		btnDashboard.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JButton btnHistory = new JButton("History");
		btnHistory.setBackground(new Color(191, 180, 143));
		btnHistory.setIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\history.png"));
		btnHistory.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JButton btnSetting = new JButton("Setting");
		btnSetting.setBackground(new Color(191, 180, 143));
		btnSetting.setIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\gear.png"));
		btnSetting.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JButton btnNewButton_1 = new JButton("View Result");
		btnNewButton_1.setBackground(new Color(191, 180, 143));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\notepad.png"));
		btnNewButton_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGap(15)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addGap(46))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnSetting, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnHistory, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnDashboard, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addGap(32)
					.addComponent(btnDashboard, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnHistory, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
					.addComponent(btnSetting, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		splitPane.setDividerLocation(200);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
	}
}
