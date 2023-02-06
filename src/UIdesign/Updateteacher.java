package UIdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backend.connector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Updateteacher extends JDialog {
	private int selectedRow ;
	public void setSelectedRow(int selectedRow) {
		this.selectedRow = selectedRow;
	}

	private JPanel contentPane;
	private JTextField Nametf;
	private JTextField phonetf;
	public JTextField getNametf() {
		return Nametf;
	}

	public JTextField getPhonetf() {
		return phonetf;
	}

	public JTextField getAddresstf() {
		return addresstf;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public JTextField getEmailtf() {
		return emailtf;
	}

	public JTextField getModuletf() {
		return moduletf;
	}

	public JTextField getQualificationtf() {
		return qualificationtf;
	}

	public JTextField getPositiontf() {
		return positiontf;
	}

	private JTextField addresstf;
	public JButton getUpdate() {
		return update;
	}

	private JTextField textField_3;
	private JTextField emailtf;
	private JTextField moduletf;
	private JTextField qualificationtf;
	private JTextField positiontf;
	private JButton update;
	private JLabel DOB;
	private JTextField DOBtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Updateteacher frame = new Updateteacher();
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
	public Updateteacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Name");
		
		Nametf = new JTextField();
		Nametf.setColumns(10);
		
		phonetf = new JTextField();
		phonetf.setColumns(10);
		
		JLabel lblPhonenumber = new JLabel("PhoneNumber");
		
		addresstf = new JTextField();
		addresstf.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		
		emailtf = new JTextField();
		emailtf.setColumns(10);
		
		JLabel lblEmailaddress = new JLabel("EmailAddress");
		
		JLabel lblModule = new JLabel("Module");
		
		JLabel lblQualification = new JLabel("Qualification");
		
		JLabel lblPosition = new JLabel("Position");
		
		moduletf = new JTextField();
		moduletf.setColumns(10);
		
		qualificationtf = new JTextField();
		qualificationtf.setColumns(10);
		
		positiontf = new JTextField();
		positiontf.setColumns(10);
		
		update = new JButton("Update");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement statement = connector.getStatement();
				
				String Name = Nametf.getText();
				String DOB = DOBtextField.getText();
				int PhoneNumber = Integer.parseInt(phonetf.getText());
				String Address = addresstf.getText();
				String EmailAddress = emailtf.getText();
				String Module = moduletf.getText();
				String Qualification = qualificationtf.getText();
				String Postition = positiontf.getText();
				String updateQuery = "UPDATE `teacherdetails` SET `Name`='"+Name+"',`DOB`='"+DOB+"',`Phonenumber`='"+PhoneNumber+"',`Address`='"+Address+"',`EmailAddress`='"+EmailAddress+"',`Module`='"+Module+"',`Qualification`='"+Qualification+"',`Position`='"+Postition+"' WHERE TeacherDetailsID = '"+selectedRow+"'";
				try {
					int updateSuccess = statement.executeUpdate(updateQuery);
					if(updateSuccess == 1) {
						System.out.println("updated");
					}else {
						System.out.println("no updated");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		DOB = new JLabel("DOB");
		
		DOBtextField = new JTextField();
		DOBtextField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblModule, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(moduletf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblQualification, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(qualificationtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPosition, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(positiontf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(524)
							.addComponent(update))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPhonenumber)
								.addComponent(lblEmailaddress, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(addresstf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(emailtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(phonetf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(DOB, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(47)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(DOBtextField, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addComponent(Nametf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(266))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(Nametf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(DOBtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(phonetf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(DOB)
							.addGap(16)
							.addComponent(lblPhonenumber)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(addresstf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailaddress)
						.addComponent(emailtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModule)
						.addComponent(moduletf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQualification)
						.addComponent(qualificationtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPosition)
						.addComponent(positiontf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(update))
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(334)
							.addComponent(lblNewLabel_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(331)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getDOBtextField() {
		return DOBtextField;
	}

	public JButton getSubmitButton() {
		// TODO Auto-generated method stub
		return null;
	}
}
