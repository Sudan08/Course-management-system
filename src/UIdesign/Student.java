package UIdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JMenuBar;

public class Student extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		setTitle("Student \r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 528);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(0, 0, 150, 496);
		
		JButton btnNewButton = new JButton("Course");
		btnNewButton.setBorder(UIManager.getBorder("ToolTip.border"));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.controlShadow);
		btnNewButton.setFont(new Font("Perpetua", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 89, 130, 47);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		contentPane.setLayout(null);
		contentPane.add(panel);
		
		JButton btnTeacher = new JButton("Teacher");
		btnTeacher.setForeground(Color.WHITE);
		btnTeacher.setFont(new Font("Perpetua", Font.PLAIN, 20));
		btnTeacher.setBackground(SystemColor.controlShadow);
		btnTeacher.setBounds(10, 179, 130, 47);
		panel.add(btnTeacher);
		
		JButton btnNewButton_1_1 = new JButton("Student");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Perpetua", Font.PLAIN, 20));
		btnNewButton_1_1.setBackground(SystemColor.controlShadow);
		btnNewButton_1_1.setBounds(10, 269, 130, 47);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Report");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Perpetua", Font.PLAIN, 20));
		btnNewButton_1_2.setBackground(SystemColor.controlShadow);
		btnNewButton_1_2.setBounds(10, 366, 130, 47);
		panel.add(btnNewButton_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(150, 0, 725, 496);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student");
		lblNewLabel.setBounds(325, 10, 96, 35);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 30));
	}
}
