package Bank.CustomerPlatform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MakeDeposit implements ActionListener {
	
	String username;
	JFrame frame;
	JLabel chooseAccount;
	JLabel amount;
	JComboBox accounts;
	JTextField amountField;
	JButton button;
	
	public MakeDeposit(String username) {
		
		this.username = username;
		//Search the database using this username to retrieve all savings and checking accounts id that this customer has
		//Use these ids to form a String array to create the combox
		//First get how many savings and checking accounts this customer has
		int n = 10;//Change it to the number of checking and savings accounts
		String[] ids = new String[n];
		for(int i = 0; i < n; i++) {
			ids[i] = "";//Get from the database
		}
		frame = new JFrame("Make a deposit");
		frame.setSize(500, 400);
		chooseAccount = new JLabel("Choose an account");
		chooseAccount.setBounds(50, 100, 150, 20);
		accounts = new JComboBox(ids);
		accounts.setBounds(50, 200, 150, 20);
		amount = new JLabel("Amount");
		amount.setBounds(300, 100, 150, 20);
		amountField = new JTextField();
		amountField.setBounds(300, 200, 150, 20);
		button = new JButton("Deposit");
		button.setBounds(150, 300, 200, 50);
		button.addActionListener(this);
		frame.add(chooseAccount);
		frame.add(accounts);
		frame.add(amount);
		frame.add(amountField);
		frame.add(button);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String id = accounts.getItemAt(accounts.getSelectedIndex()).toString();
		//Search this id in database and add balance to this account to renew the database
		double balance = Double.parseDouble(amountField.getText());
		//Then add balance to the account.
		
		
	}
}
