package UIdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;

public class AdminDashboard{

	private JFrame frmAdminPanel;
	private CardLayout cl_cardPanel= new CardLayout(0,0);
	private JPanel cardPanel;
	private JTable Logtable;
	private JTable table_1;
	private JTable table;
	private JTable table_2;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard window = new AdminDashboard();
					window.frmAdminPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminPanel = new JFrame();
		frmAdminPanel.setTitle("Admin Panel");
		frmAdminPanel.setBounds(100, 100, 1228, 592);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(0);
		frmAdminPanel.setContentPane(splitPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(242, 239, 233));
		splitPane.setLeftComponent(panel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setIconTextGap(35);
		btnNewButton.setIcon(new ImageIcon(AdminDashboard.class.getResource("/image/home.png")));
		btnNewButton.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel,"name_219236766039800");
			}
		});
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\home.png"));
		btnNewButton.setForeground(new Color(86, 78, 88));
		btnNewButton.setBackground(new Color(208, 252, 179));
		
		JButton btnNewButton_1 = new JButton("Course");
		btnNewButton_1.setIconTextGap(35);
		btnNewButton_1.setIcon(new ImageIcon(AdminDashboard.class.getResource("/image/online-learning.png")));
		btnNewButton_1.setForeground(new Color(86, 78, 88));
		btnNewButton_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_1.setBackground(new Color(191, 180, 143));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel,"name_654837823487100");
			}
		});
		
		JButton btnNewButton_2 = new JButton("Setting ");
		btnNewButton_2.setIconTextGap(35);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\gear.png"));
		btnNewButton_2.setForeground(new Color(86, 78, 88));
		btnNewButton_2.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_2.setBackground(new Color(191, 180, 143));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel,"name_659175453723500");
			}
		});
		
		JButton btnNewButton_3 = new JButton("Log out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdminPanel.dispose();
				Login login = new Login();
			}
		});
		btnNewButton_3.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_3.setForeground(new Color(242, 239, 233));
		btnNewButton_3.setBackground(new Color(37, 38, 39));
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sudan\\eclipse-workspace\\CourseManagementSystem\\src\\image\\user2.png"));
		
		JButton btnNewButton_1_1 = new JButton("Teacher");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel,"name_219288303900400");
			}
		});
		btnNewButton_1_1.setIconTextGap(35);
		btnNewButton_1_1.setIcon(new ImageIcon(AdminDashboard.class.getResource("/image/training.png")));
		btnNewButton_1_1.setForeground(new Color(86, 78, 88));
		btnNewButton_1_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_1_1.setBackground(new Color(191, 180, 143));
		
		JButton btnNewButton_1_1_1 = new JButton("Student");
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\reading.png"));
		btnNewButton_1_1_1.setIconTextGap(35);
		btnNewButton_1_1_1.setForeground(new Color(86, 78, 88));
		btnNewButton_1_1_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_1_1_1.setBackground(new Color(191, 180, 143));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(39, Short.MAX_VALUE)
					.addComponent(lblDashboard)
					.addGap(36))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(55)
					.addComponent(lblNewLabel)
					.addContainerGap(59, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(76)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(78, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel_3)
					.addGap(2)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_1);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setBorder(null);
		splitPane_1.setLeftComponent(splitPane_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(242, 239, 233));
		splitPane_2.setLeftComponent(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Students");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 28));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sudan\\eclipse-workspace\\CourseManagementSystem\\src\\image\\Students-icon.png"));
		
		JLabel lblNewLabel_5 = new JLabel("102");
		lblNewLabel_5.setFont(new Font("Perpetua", Font.BOLD, 50));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(64, Short.MAX_VALUE) 
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(38))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel_5)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(242, 239, 233));
		splitPane_2.setRightComponent(panel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Teachers");
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.PLAIN, 28));
		
		JLabel lblNewLabel_5_1 = new JLabel("30");
		lblNewLabel_5_1.setFont(new Font("Perpetua", Font.BOLD, 50));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sudan\\eclipse-workspace\\CourseManagementSystem\\src\\image\\Teacher-icon.png"));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(144)
					.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1_1)
					.addGap(60))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(29)
							.addComponent(lblNewLabel_1_1))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		splitPane_2.setDividerLocation(450);
		
		cardPanel = new JPanel();
		splitPane_1.setRightComponent(cardPanel);
		cardPanel.setLayout(cl_cardPanel);
		
		JPanel dashboard = new JPanel();
		dashboard.setBackground(new Color(242, 239, 233));
		cardPanel.add(dashboard, "name_219236766039800");
		
		JLabel lblNewLabel_6 = new JLabel("Dashboard");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		GroupLayout gl_dashboard = new GroupLayout(dashboard);
		gl_dashboard.setHorizontalGroup(
			gl_dashboard.createParallelGroup(Alignment.TRAILING)
				.addComponent(splitPane_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING, gl_dashboard.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6)
					.addContainerGap(884, Short.MAX_VALUE))
		);
		gl_dashboard.setVerticalGroup(
			gl_dashboard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashboard.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6)
					.addGap(10)
					.addComponent(splitPane_3, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(242, 239, 233));
		panel_3.setBorder(null);
		splitPane_3.setLeftComponent(panel_3);
		
		JLabel lblNewLabel_7 = new JLabel("Log History");
		lblNewLabel_7.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
						.addComponent(lblNewLabel_7))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		Logtable = new JTable();
		Logtable.setModel(new DefaultTableModel(
			new Object[][] {
				{"12:45 AM", "Juja Logged in"},
				{"1:45 AM", "Assignement portal open"},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Time", "Activity"
			}
		));
		scrollPane.setViewportView(Logtable);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(242, 239, 233));
		splitPane_3.setRightComponent(panel_4);
		
		JLabel lblNewLabel_7_1 = new JLabel("Feedbacks");
		lblNewLabel_7_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
						.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_7_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Free Food chayo", "npcs54H432432", "Sakar Shrestha"},
				{"I dont know", "npcdgo225ndfi3", "Muskan Shrestha"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Feedback", "StudentID", "StudentName"
			}
		));
		scrollPane_1.setViewportView(table_1);
		panel_4.setLayout(gl_panel_4);
		splitPane_3.setDividerLocation(450);
		dashboard.setLayout(gl_dashboard);
		
		JPanel teacher = new JPanel();
		teacher.setBackground(new Color(242, 239, 233));
		cardPanel.add(teacher, "name_219288303900400");
		
		JLabel Teacher = new JLabel("Teacher Management");
		Teacher.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JButton btnAddTeachers = new JButton("Add teacher");
		btnAddTeachers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addteacher window = new Addteacher();
				window.setVisible(true);
			}
		});
		btnAddTeachers.setIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\add-user.png"));
		btnAddTeachers.setIconTextGap(15);
		btnAddTeachers.setForeground(new Color(0, 0, 0));
		btnAddTeachers.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnAddTeachers.setFocusCycleRoot(true);
		btnAddTeachers.setBackground(new Color(208, 252, 179));
		GroupLayout gl_teacher = new GroupLayout(teacher);
		gl_teacher.setHorizontalGroup(
			gl_teacher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_teacher.createSequentialGroup()
					.addGroup(gl_teacher.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_teacher.createSequentialGroup()
							.addGap(378)
							.addComponent(Teacher))
						.addGroup(gl_teacher.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
						.addGroup(gl_teacher.createSequentialGroup()
							.addGap(395)
							.addComponent(btnAddTeachers, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_teacher.setVerticalGroup(
			gl_teacher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_teacher.createSequentialGroup()
					.addGap(21)
					.addComponent(Teacher)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(btnAddTeachers, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Juja Manandhar ", "9845123768", "Human Computer Interaction", "Module Leader"},
				{"2", "Raj Shrestha", "9841948371", "Object Oriented Programming", "Module Leader"},
				{"3", "Sir Issac Newton", "9841957103", "Gravitaion", "Inventer"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Teacher ID", "Teacher Name", "Phone Number", "Module ", "Postition"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(126);
		table.getColumnModel().getColumn(2).setPreferredWidth(95);
		scrollPane_2.setViewportView(table);
		teacher.setLayout(gl_teacher);
		
		JPanel courses = new JPanel();
		courses.setBackground(new Color(242, 239, 233));
		cardPanel.add(courses, "name_654837823487100");
		
		JLabel lblNewLabel_8 = new JLabel("Course Management");
		lblNewLabel_8.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		JButton btnNewButton_2_1 = new JButton("Add Course");
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\sudan\\Downloads\\plus.png"));
		btnNewButton_2_1.setIconTextGap(15);
		btnNewButton_2_1.setForeground(new Color(86, 78, 88));
		btnNewButton_2_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_2_1.setBackground(new Color(208, 252, 179));
		GroupLayout gl_courses = new GroupLayout(courses);
		gl_courses.setHorizontalGroup(
			gl_courses.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_courses.createSequentialGroup()
					.addGroup(gl_courses.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_courses.createSequentialGroup()
							.addGap(342)
							.addComponent(lblNewLabel_8))
						.addGroup(gl_courses.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
						.addGroup(gl_courses.createSequentialGroup()
							.addGap(409)
							.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_courses.setVerticalGroup(
			gl_courses.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_courses.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "BIT", "3 Years", "8", "Nirmal Thapa", "160"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"CourseID", "CourseName", "Course Duration", "Modules", "Course Leader", "Credit hour"
			}
		));
		table_2.getColumnModel().getColumn(2).setPreferredWidth(107);
		table_2.getColumnModel().getColumn(4).setPreferredWidth(99);
		scrollPane_3.setViewportView(table_2);
		courses.setLayout(gl_courses);
		
		JPanel setting = new JPanel();
		setting.setBackground(new Color(242, 239, 233));
		cardPanel.add(setting, "name_659175453723500");
		
		JLabel lblNewLabel_9 = new JLabel("Setting");
		lblNewLabel_9.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JButton btnNewButton_4 = new JButton("Delete Database");
		btnNewButton_4.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_4.setBackground(new Color(230, 57, 70));
		
		JButton btnNewButton_4_1 = new JButton("Publish Report");
		btnNewButton_4_1.setBackground(new Color(208, 252, 179));
		btnNewButton_4_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JLabel lblNewLabel_10 = new JLabel("UserName:");
		lblNewLabel_10.setFont(new Font("Perpetua", Font.PLAIN, 22));
		
		JTextField textField = new JTextField();
		textField.setBackground(new Color(242, 239, 233));
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Change Username");
		btnNewButton_5.setBackground(new Color(208, 252, 179));
		btnNewButton_5.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JLabel lblNewLabel_10_1 = new JLabel("Confirm Password");
		lblNewLabel_10_1.setFont(new Font("Perpetua", Font.PLAIN, 22));
		
		JLabel lblNewLabel_10_1_1 = new JLabel("New Password");
		lblNewLabel_10_1_1.setFont(new Font("Perpetua", Font.PLAIN, 22));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_1.setBackground(new Color(242, 239, 233));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_2.setBackground(new Color(242, 239, 233));
		
		JButton btnNewButton_5_1 = new JButton("Change Password");
		btnNewButton_5_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		btnNewButton_5_1.setBackground(new Color(230, 57, 70));
		GroupLayout gl_setting = new GroupLayout(setting);
		gl_setting.setHorizontalGroup(
			gl_setting.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_setting.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_setting.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_setting.createSequentialGroup()
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_10_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_setting.createSequentialGroup()
							.addGroup(gl_setting.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_10_1_1)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
								.addComponent(btnNewButton_4_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(btnNewButton_5_1, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addGap(357)
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
					.addGap(20))
		);
		gl_setting.setVerticalGroup(
			gl_setting.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_setting.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_setting.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_setting.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_setting.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_5)))
						.addGroup(gl_setting.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel_10)))
					.addGap(29)
					.addGroup(gl_setting.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_setting.createSequentialGroup()
							.addComponent(lblNewLabel_10_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblNewLabel_10_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_5_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_setting.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(66))
		);
		setting.setLayout(gl_setting);
		splitPane_1.setDividerLocation(100);
		splitPane.setDividerLocation(200);
		frmAdminPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminPanel.setVisible(true);
	}
}
