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
	private JTable SubTable;
	private static DefaultTableModel SubmissionModel= new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"AssignmentID", "Question", "Module"
			}
		);

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
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(62, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(75)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(78))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addGap(49)
					.addComponent(lblNewLabel)
					.addGap(115)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
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
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 799, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 99, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		splitPane_1.setRightComponent(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_1 = new JLabel("Submission Table");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(323)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		
		SubTable = new JTable();
		SubTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options= {"Submit","Cancel"};
				int selecterOption=JOptionPane.showOptionDialog(null, "Do you want to update or delete?", "Update or delete teacher",
						JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
				int selectedRow = SubTable.getSelectedRow();
				if (selecterOption == 0) {
					String ID = SubTable.getValueAt(selectedRow, 0).toString();
					ResultSet resultSet = SubmissionQuery.getQuestion(ID);
					String question = null;
					String marks = null;
					
					try {
						while (resultSet.next()) {
							question = resultSet.getString("Question");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					SubmissionForm.setQuestion(question);
					SubmissionForm form = new SubmissionForm();
					form.setVisible(true);
					JButton submitbtn = form.getSubmitbtn();
					submitbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							HashMap<String, String> submitData = new HashMap<>();
							String StudentName = "";
							ResultSet result = StudentQuery.getStudentName(StudentID);
							try {
								while (result.next()) {
									StudentName = result.getString("Name");
								}
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							String Answer = form.getAnswertf().getText();
							submitData.put("Question",SubTable.getValueAt(selectedRow,1).toString());
							submitData.put("AssignmentID", SubTable.getValueAt(selectedRow,0).toString() );
							submitData.put("Module", SubTable.getValueAt(selectedRow,2).toString() );
							submitData.put("StudentID", StudentID);
							submitData.put("UniID", UniID);
							submitData.put("StudentName", StudentName);
							submitData.put("Answer", Answer);
							submitData.put("Marks", marks);
							
							SubmissionQuery.InsertQuery(submitData);
						}
					});
					
					
					
					
				}
			}
		});
		SubTable.setModel(SubmissionModel);
		scrollPane.setViewportView(SubTable);
		panel_4.setLayout(gl_panel_4);
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
