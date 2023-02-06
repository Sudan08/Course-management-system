package UIdesign;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModuleForm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel Course;
	private JTextField CourseIDtextField;
	private JTextField Moduletf;
	private JLabel lblModuleleader;
	private JTextField ModuleLeadertf;
	private JLabel lblLevel;
	private JLabel lblSemester;
	private JLabel lblCredithour;
	private JTextField Leveltf;
	private JTextField Semestertf;
	private JTextField CreditHouttf;
	private JButton Submit;

	public JTextField getCourseIDtextField() {
		return CourseIDtextField;
	}


	public JTextField getLeveltf() {
		return Leveltf;
	}


	public JTextField getSemestertf() {
		return Semestertf;
	}


	public JTextField getCreditHouttf() {
		return CreditHouttf;
	}


	public JButton getSubmit() {
		return Submit;
	}


	public JTextField getModuletf() {
		return Moduletf;
	}

	public JTextField getModuleLeadertf() {
		return ModuleLeadertf;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModuleForm dialog = new ModuleForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModuleForm() {
		setBounds(100, 100, 1245, 734);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		{
			Course = new JLabel("CourseID:");
		}
		
		CourseIDtextField = new JTextField();
		CourseIDtextField.setColumns(10);
		
		JLabel lblModulename = new JLabel("ModuleName:");
		
		Moduletf = new JTextField();
		Moduletf.setColumns(10);
		
		lblModuleleader = new JLabel("ModuleLeader:");
		
		ModuleLeadertf = new JTextField();
		ModuleLeadertf.setColumns(10);
		
		lblLevel = new JLabel("Level:");
		
		lblSemester = new JLabel("Semester:");
		
		lblCredithour = new JLabel("CreditHour:");
		
		Leveltf = new JTextField();
		Leveltf.setColumns(10);
		
		Semestertf = new JTextField();
		Semestertf.setColumns(10);
		
		CreditHouttf = new JTextField();
		CreditHouttf.setColumns(10);
		
		Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(Course, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(CourseIDtextField, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblModulename, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Moduletf, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblModuleleader, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ModuleLeadertf, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblLevel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Leveltf, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblSemester, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Semestertf, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblCredithour, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(CreditHouttf, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(921, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(892, Short.MAX_VALUE)
					.addComponent(Submit)
					.addGap(244))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(Course, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(CourseIDtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModulename, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(Moduletf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModuleleader, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(ModuleLeadertf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLevel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(Leveltf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSemester, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(Semestertf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCredithour, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(CreditHouttf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(156)
					.addComponent(Submit)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
}
