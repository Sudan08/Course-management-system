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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AssignmentForm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField Questiontf;
	private JButton btnNewButton;
	private JTextField Moduletf;
	private JLabel lblNewLabel_2;
	
	
	
	public JTextField getQuestiontf() {
		return Questiontf;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AssignmentForm dialog = new AssignmentForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AssignmentForm() {
		setBounds(100, 100, 1323, 745);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblNewLabel = new JLabel("Add Assignment");
			lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 25));
		}
		JLabel lblNewLabel_1 = new JLabel("Question");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		Questiontf = new JTextField();
		Questiontf.setColumns(10);
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		Moduletf = new JTextField();
		Moduletf.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Module");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 25));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(333, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addGap(552))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
							.addGap(528))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(Moduletf, GroupLayout.PREFERRED_SIZE, 704, GroupLayout.PREFERRED_SIZE)
								.addComponent(Questiontf, GroupLayout.PREFERRED_SIZE, 704, GroupLayout.PREFERRED_SIZE))
							.addGap(262))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(561))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel)
					.addGap(185)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Questiontf, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Moduletf, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(49))
		);
		contentPanel.setLayout(gl_contentPanel);
	}

	public JTextField getModuletf() {
		return Moduletf;
	}

}
