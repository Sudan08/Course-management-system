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
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class SubmitMarks extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public void setMarkstf(JTextField markstf) {
		this.markstf = markstf;
	}

	private JLabel lblNewLabel;
	private JTextField markstf;
	public static String assignmentQuestion;
	public static String assignmentAnswer;
	private JLabel Question;
	private JLabel Answer;
	
	public static void setQuestion(String question) {
		assignmentQuestion = question;
	}

	public static void setAnswer(String answer) {
		assignmentAnswer = answer;
	}

	public JTextField getMarkstf() {
		return markstf;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SubmitMarks dialog = new SubmitMarks();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SubmitMarks() {
		setBounds(100, 100, 1192, 694);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblNewLabel = new JLabel("Marking");
			lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 30));
		}
		
		JLabel lblQuestion = new JLabel("Question:");
		lblQuestion.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		markstf = new JTextField();
		markstf.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Perpetua", Font.PLAIN, 25));
		
		JLabel lblMarks = new JLabel("Marks:");
		lblMarks.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		Question = new JLabel(assignmentQuestion);
		Question.setFont(new Font("Perpetua", Font.PLAIN, 30));
		
		Answer = new JLabel(assignmentAnswer);
		Answer.setFont(new Font("Perpetua", Font.PLAIN, 30));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(510, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(492))
				.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
					.addGap(72)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(Answer, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 784, Short.MAX_VALUE)
									.addComponent(btnNewButton)
									.addGap(32)
									.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
							.addGap(44))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(Question, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAnswer, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMarks, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
								.addComponent(markstf, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuestion, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(611, Short.MAX_VALUE))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(lblQuestion, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(Question, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnswer, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Answer, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMarks, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(markstf, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(24))
		);
		contentPanel.setLayout(gl_contentPanel);
	}


	
}
