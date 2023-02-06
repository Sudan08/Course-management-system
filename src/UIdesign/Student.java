package UIdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import backend.AssignmentQuery;
import backend.StudentQuery;
import backend.SubmissionQuery;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.awt.CardLayout;

public class Student {
	private String StudentID;
	private String UniID;
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public String getStudentID() {
		return StudentID;
	}

	public String getUniID() {
		return UniID;
	}

	public void setUniID(String uniID) {
		UniID = uniID;
	}

	public int getStudentName() {
		return StudentName;
	}

	public void setStudentName(int studentName) {
		StudentName = studentName;
	}

	private int StudentName;
	private JFrame frame;
	private static DefaultTableModel SubmissionModel= new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"AssignmentID", "Question", "Module"
			}
		);
	
	private static DefaultTableModel ResultModel= new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"AssignmentID", "Question", "Module"
			}
		);
	
	private JTable ResultTable;
	private JTable AssignmentTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void getAssignemntData() throws SQLException{
		ResultSet resultSet = AssignmentQuery.SelectQuery();
		
		
		while (resultSet.next()) {
			int AssignmentID = resultSet.getInt("AssignmentID");
			String Question = resultSet.getString("Question");
			String Module = resultSet.getString("Module");
			SubmissionModel.addRow(new Object[] {
					AssignmentID,
					Question,
					Module,
			});
		}
		
		
	}

	/**
	 * Create the application.
	 */
	public Student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1071, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
		);
		
		JSplitPane splitPane = new JSplitPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
		);
		
		JPanel panel_1 = new JPanel();
		splitPane.setLeftComponent(panel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JLabel lblNewLabel = new JLabel("Student");
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JButton btnResult = new JButton("Result");
		
		JButton btnNewButton_2_1 = new JButton("New button");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(75)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addGap(78))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnResult, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(49)
					.addComponent(lblNewLabel)
					.addGap(46)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnResult, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		splitPane.setRightComponent(panel_2);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(splitPane_1, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
		);
		
		JPanel panel_3 = new JPanel();
		splitPane_1.setLeftComponent(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("Ai assignment updated");
		lblNewLabel_3.setFont(new Font("Perpetua", Font.PLAIN, 30));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(219)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(212, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel_3)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		splitPane_1.setRightComponent(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JPanel AssignmentSubmission = new JPanel();
		panel_4.add(AssignmentSubmission, "name_4213068297000");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_1 = new JLabel("Submission Table");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		GroupLayout gl_AssignmentSubmission = new GroupLayout(AssignmentSubmission);
		gl_AssignmentSubmission.setHorizontalGroup(
			gl_AssignmentSubmission.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AssignmentSubmission.createSequentialGroup()
					.addGroup(gl_AssignmentSubmission.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_AssignmentSubmission.createSequentialGroup()
							.addGap(304)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_AssignmentSubmission.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_AssignmentSubmission.setVerticalGroup(
			gl_AssignmentSubmission.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AssignmentSubmission.createSequentialGroup()
					.addGap(13)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		AssignmentTable = new JTable();
		scrollPane.setViewportView(AssignmentTable);
		AssignmentSubmission.setLayout(gl_AssignmentSubmission);
		
		JPanel Result = new JPanel();
		panel_4.add(Result, "name_4274684947099");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblNewLabel_2 = new JLabel("Result ");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 30));
		GroupLayout gl_Result = new GroupLayout(Result);
		gl_Result.setHorizontalGroup(
			gl_Result.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Result.createSequentialGroup()
					.addGroup(gl_Result.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Result.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 774, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Result.createSequentialGroup()
							.addGap(349)
							.addComponent(lblNewLabel_2)))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		gl_Result.setVerticalGroup(
			gl_Result.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Result.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2)
					.addGap(18)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		ResultTable = new JTable();
		ResultTable.setModel(ResultModel);
		scrollPane_1.setViewportView(ResultTable);
		Result.setLayout(gl_Result);
		splitPane_1.setDividerLocation(100);
		panel_2.setLayout(gl_panel_2);
		splitPane.setDividerLocation(250);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
		try {
			getAssignemntData();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
