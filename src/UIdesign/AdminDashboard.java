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

public class AdminDashboard{

	private JFrame frmAdminPanel;
	private CardLayout cl_cardPanel= new CardLayout(0,0);
	private JPanel cardPanel;

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
		frmAdminPanel.setBounds(100, 100, 1094, 519);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(0);
		frmAdminPanel.setContentPane(splitPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(242, 239, 233));
		splitPane.setLeftComponent(panel);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel,"name_219236766039800");
			}
		});
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setSelectedIcon(null);
		btnNewButton.setForeground(new Color(86, 78, 88));
		btnNewButton.setBackground(new Color(191, 180, 143));
		
		JButton btnNewButton_1 = new JButton("Course");
		btnNewButton_1.setBackground(new Color(191, 180, 143));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("Setting ");
		btnNewButton_2.setBackground(new Color(191, 180, 143));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel,"name_219288303900400");
			}
		});
		
		JButton btnNewButton_3 = new JButton("Log out");
		btnNewButton_3.setForeground(new Color(242, 239, 233));
		btnNewButton_3.setBackground(new Color(37, 38, 39));
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sudan\\eclipse-workspace\\CourseManagementSystem\\src\\image\\user2.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(75)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(79, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(58, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(56))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addComponent(lblDashboard, 0, 0, Short.MAX_VALUE)
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
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
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sudan\\eclipse-workspace\\CourseManagementSystem\\src\\image\\Teacher-icon.png"));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(85)
					.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1)
					.addGap(81))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel_1_1))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(5, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		splitPane_2.setDividerLocation(425);
		
		cardPanel = new JPanel();
		splitPane_1.setRightComponent(cardPanel);
		cardPanel.setLayout(cl_cardPanel);
		
		JPanel dashboard = new JPanel();
		cardPanel.add(dashboard, "name_219236766039800");
		
		JLabel lblNewLabel_6 = new JLabel("Dashboard");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JSplitPane splitPane_3 = new JSplitPane();
		GroupLayout gl_dashboard = new GroupLayout(dashboard);
		gl_dashboard.setHorizontalGroup(
			gl_dashboard.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_dashboard.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6)
					.addContainerGap(750, Short.MAX_VALUE))
				.addComponent(splitPane_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
		);
		gl_dashboard.setVerticalGroup(
			gl_dashboard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashboard.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(splitPane_3, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		splitPane_3.setLeftComponent(panel_3);
		
		JLabel lblNewLabel_7_1 = new JLabel("Feedbacks");
		lblNewLabel_7_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(331, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(271, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		splitPane_3.setRightComponent(panel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Log History");
		lblNewLabel_7.setFont(new Font("Perpetua", Font.PLAIN, 25));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_7)
					.addContainerGap(303, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_7)
					.addContainerGap(271, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		splitPane_3.setDividerLocation(450);
		dashboard.setLayout(gl_dashboard);
		
		JPanel teacher = new JPanel();
		cardPanel.add(teacher, "name_219288303900400");
		splitPane_1.setDividerLocation(100);
		splitPane.setDividerLocation(200);
		frmAdminPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminPanel.setVisible(true);
	}
}
