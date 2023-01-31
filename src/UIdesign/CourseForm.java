package UIdesign;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CourseForm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JPanel getContentPanel() {
		return contentPanel;
	}
	
	

	public JTextField getCoursetf() {
		return Coursetf;
	}

	public JTextField getCourseDestf() {
		return courseDestf;
	}

	public JTextField getNomoduletf() {
		return nomoduletf;
	}

	public JTextField getStatustf() {
		return statustf;
	}

	public JTextField getDurationtf() {
		return durationtf;
	}

	private JTextField Coursetf;
	private JTextField courseDestf;
	private JTextField nomoduletf;
	private JTextField statustf;
	private JTextField durationtf;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CourseForm dialog = new CourseForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CourseForm() {
		setBounds(100, 100, 1090, 651);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel = new JLabel("CourseName");
		
		Coursetf = new JTextField();
		Coursetf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CourseDescription");
		
		JLabel lblNewLabel_2 = new JLabel("No of Module");
		
		JLabel lblNewLabel_2_1 = new JLabel("Status");
		
		courseDestf = new JTextField();
		courseDestf.setColumns(10);
		
		nomoduletf = new JTextField();
		nomoduletf.setColumns(10);
		
		statustf = new JTextField();
		statustf.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Duration");
		
		durationtf = new JTextField();
		durationtf.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(803, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addGap(178))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(durationtf, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(nomoduletf, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(38)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(Coursetf, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
								.addComponent(courseDestf, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
								.addComponent(statustf, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(632, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(Coursetf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(courseDestf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(nomoduletf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(statustf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(durationtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(247)
					.addComponent(btnSubmit)
					.addContainerGap(61, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
		);
		getContentPane().setLayout(groupLayout);
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}
}
