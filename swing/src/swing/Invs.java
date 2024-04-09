
package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Invs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invs frame = new Invs();
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
	public Invs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 112, 214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 601, 403);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		lblNewLabel.setBounds(96, 0, 495, 61);
		panel.add(lblNewLabel);
		
		JLabel lblInvsys = new JLabel("InvSys");
		lblInvsys.setBackground(new Color(230, 230, 250));
		lblInvsys.setForeground(Color.RED);
		lblInvsys.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblInvsys.setBounds(243, 172, 96, 40);
		panel.add(lblInvsys);
		
		JLabel lblInvsys_1 = new JLabel("");
		lblInvsys_1.setIcon(new ImageIcon("C:\\Users\\Atul Singh\\Downloads\\java ques\\Invent.jpg"));
		lblInvsys_1.setForeground(Color.RED);
		lblInvsys_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblInvsys_1.setBackground(new Color(230, 230, 250));
		lblInvsys_1.setBounds(98, 101, 245, 201);
		panel.add(lblInvsys_1);
		
		JButton btnNewButton = new JButton("Next Page ");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				HomePage hp=new HomePage();
				
				hp.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(436, 348, 122, 31);
		panel.add(btnNewButton);
	}
}
