package UIdesign;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Form extends JDialog {
	private JTextField FullNameTextField;
	private JTextField PhoneNumberTextField;
	private JTextField AddressTextField;
	private JLabel lblNewLabel_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form dialog = new Form();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Form() {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		setTitle("Form");
		setBounds(100, 100, 1014, 483);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		getContentPane().add(lblNewLabel);
		
		FullNameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, -10, SpringLayout.NORTH, FullNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -21, SpringLayout.WEST, FullNameTextField);
		springLayout.putConstraint(SpringLayout.NORTH, FullNameTextField, 55, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, FullNameTextField, 229, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, FullNameTextField, -473, SpringLayout.EAST, getContentPane());
		getContentPane().add(FullNameTextField);
		FullNameTextField.setColumns(10);
		
		PhoneNumberTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, PhoneNumberTextField, 43, SpringLayout.SOUTH, FullNameTextField);
		springLayout.putConstraint(SpringLayout.WEST, PhoneNumberTextField, 0, SpringLayout.WEST, FullNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, PhoneNumberTextField, 0, SpringLayout.EAST, FullNameTextField);
		PhoneNumberTextField.setColumns(10);
		getContentPane().add(PhoneNumberTextField);
		
		JLabel lblPhonenumber = new JLabel("PhoneNumber");
		springLayout.putConstraint(SpringLayout.NORTH, lblPhonenumber, -10, SpringLayout.NORTH, PhoneNumberTextField);
		springLayout.putConstraint(SpringLayout.EAST, lblPhonenumber, -6, SpringLayout.WEST, PhoneNumberTextField);
		lblPhonenumber.setFont(new Font("Tahoma", Font.PLAIN, 23));
		getContentPane().add(lblPhonenumber);
		
		JLabel lblAddress = new JLabel("Address");
		springLayout.putConstraint(SpringLayout.NORTH, lblAddress, 37, SpringLayout.SOUTH, lblPhonenumber);
		springLayout.putConstraint(SpringLayout.EAST, lblAddress, 0, SpringLayout.EAST, lblNewLabel);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 23));
		getContentPane().add(lblAddress);
		
		AddressTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, AddressTextField, 46, SpringLayout.SOUTH, PhoneNumberTextField);
		springLayout.putConstraint(SpringLayout.WEST, AddressTextField, 21, SpringLayout.EAST, lblAddress);
		springLayout.putConstraint(SpringLayout.EAST, AddressTextField, 319, SpringLayout.EAST, lblAddress);
		AddressTextField.setColumns(10);
		getContentPane().add(AddressTextField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(FullNameTextField.getText().isEmpty() ) {
					lblNewLabel_1.setVisible(true);
				}else {
					lblNewLabel_1.setVisible(false);
				}
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -57, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -160, SpringLayout.EAST, getContentPane());
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Full name can't be null dumbass");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, FullNameTextField);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, FullNameTextField);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 38, SpringLayout.SOUTH, AddressTextField);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 200, SpringLayout.WEST, getContentPane());
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_1);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton_1, 0, SpringLayout.SOUTH, rdbtnNewRadioButton);
		springLayout.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_1, 0, SpringLayout.EAST, lblNewLabel_1);
		getContentPane().add(rdbtnNewRadioButton_1);

	}
}
