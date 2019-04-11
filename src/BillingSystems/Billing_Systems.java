package BillingSystems;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Billing_Systems {

	protected static final String JOptionpane = null;
	private JFrame frame;
	private JTextField txtLabour;
	private JTextField txtTravel;
	private JTextField txtPlastic;
	private JTextField txtCoper;
	private JTextField txtChrome;
	private JTextField txtSubTotal;
	private JTextField txtTax;
	private JTextField txtTotal;
	private JTextField txtCostLabour;
	private JTextField txtCostTravel;
	private JTextField txtCostPlastic;
	private JTextField txtCostCoper;
	private JTextField txtCostChrome;
	
	
	double Labour=40;
	double Travel=3;
	double Plastic=5.5;
	double Coper=6.5;
	double Chrome=8.5;
	double iTax=0.75;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing_Systems window = new Billing_Systems();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Billing_Systems() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				txtLabour.setEnabled(false);
				txtPlastic.setEnabled(false);
				txtCoper.setEnabled(false);
				txtChrome.setEnabled(false);
				txtTravel.setEnabled(false);
				
			}
		});
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 15));
		frame.setBounds(0, 0, 1370, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(30, 22, 1000, 42);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblOnlineBillingSystem = new JLabel("Online Billing Systems");
		lblOnlineBillingSystem.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblOnlineBillingSystem.setBounds(256, 0, 595, 42);
		panel.add(lblOnlineBillingSystem);
		
		JCheckBox chckbxLabour = new JCheckBox("Labour");
		chckbxLabour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(chckbxLabour.isSelected())
				{
					txtLabour.setEnabled(true);
					txtLabour.setText("0");
					txtLabour.requestFocus();
					
				}
				else {
					
					txtLabour.setEnabled(false);
					txtLabour.setText("");
					
				}
				
			}
		});
		chckbxLabour.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxLabour.setBounds(29, 117, 97, 23);
		frame.getContentPane().add(chckbxLabour);
		
		JCheckBox chckbxTravel = new JCheckBox("Travel");
		chckbxTravel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxTravel.isSelected())
				{
					txtTravel.setEnabled(true);
					txtTravel.setText("0");
					txtTravel.requestFocus();
					
				}
				else {
					
					txtTravel.setEnabled(false);
					txtTravel.setText("");
					
				}
			}
		});
		chckbxTravel.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxTravel.setBounds(30, 156, 97, 23);
		frame.getContentPane().add(chckbxTravel);
		
		JCheckBox chckbxPlastic = new JCheckBox("Plastic");
		chckbxPlastic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxPlastic.isSelected())
				{
					txtPlastic.setEnabled(true);
					txtPlastic.setText("0");
					txtPlastic.requestFocus();
					
				}
				else {
					
					txtPlastic.setEnabled(false);
					txtPlastic.setText("");
					
				}
			}
		});
		chckbxPlastic.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxPlastic.setBounds(29, 197, 97, 23);
		frame.getContentPane().add(chckbxPlastic);
		
		JCheckBox chckbxCoper = new JCheckBox("Coper");
		chckbxCoper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxCoper.isSelected())
				{
					txtCoper.setEnabled(true);
					txtCoper.setText("0");
					txtCoper.requestFocus();
					
				}
				else {
					
					txtCoper.setEnabled(false);
					txtCoper.setText("");
					
				}
			}
		});
		chckbxCoper.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxCoper.setBounds(30, 238, 97, 23);
		frame.getContentPane().add(chckbxCoper);
		
		JCheckBox chckbxChrome = new JCheckBox("Chrome");
		chckbxChrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxChrome.isSelected())
				{
					txtChrome.setEnabled(true);
					txtChrome.setText("0");
					txtChrome.requestFocus();
					
				}
				else {
					
					txtChrome.setEnabled(false);
					txtChrome.setText("");
					
				}
			}
		});
		chckbxChrome.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxChrome.setBounds(29, 283, 97, 23);
		frame.getContentPane().add(chckbxChrome);
		
		txtLabour = new JTextField();
		txtLabour.setText("0");
		txtLabour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLabour.setBounds(178, 119, 86, 20);
		frame.getContentPane().add(txtLabour);
		txtLabour.setColumns(10);
		
		txtTravel = new JTextField();
		txtTravel.setText("0");
		txtTravel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTravel.setColumns(10);
		txtTravel.setBounds(178, 158, 86, 20);
		frame.getContentPane().add(txtTravel);
		
		txtPlastic = new JTextField();
		txtPlastic.setText("0");
		txtPlastic.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPlastic.setColumns(10);
		txtPlastic.setBounds(178, 199, 86, 20);
		frame.getContentPane().add(txtPlastic);
		
		txtCoper = new JTextField();
		txtCoper.setText("0");
		txtCoper.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCoper.setColumns(10);
		txtCoper.setBounds(178, 240, 86, 20);
		frame.getContentPane().add(txtCoper);
		
		txtChrome = new JTextField();
		txtChrome.setText("0");
		txtChrome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtChrome.setColumns(10);
		txtChrome.setBounds(178, 283, 86, 20);
		frame.getContentPane().add(txtChrome);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(42, 328, 302, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(343, 101, 1, 223);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(343, 107, 1, 223);
		frame.getContentPane().add(separator_2);
		
		JTextPane txtpnSubTotal = new JTextPane();
		txtpnSubTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnSubTotal.setText("Sub Total");
		txtpnSubTotal.setBounds(30, 358, 108, 23);
		frame.getContentPane().add(txtpnSubTotal);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(178, 358, 166, 20);
		frame.getContentPane().add(txtSubTotal);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtTax.setColumns(10);
		txtTax.setBounds(178, 420, 166, 20);
		frame.getContentPane().add(txtTax);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtTotal.setColumns(10);
		txtTotal.setBounds(178, 479, 166, 20);
		frame.getContentPane().add(txtTotal);
		
		JTextPane txtpnTax = new JTextPane();
		txtpnTax.setText("Tax");
		txtpnTax.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnTax.setBounds(30, 420, 108, 23);
		frame.getContentPane().add(txtpnTax);
		
		JTextPane txtpnTotal = new JTextPane();
		txtpnTotal.setText("Total");
		txtpnTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnTotal.setBounds(30, 479, 108, 23);
		frame.getContentPane().add(txtpnTotal);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 529, 767, 2);
		frame.getContentPane().add(separator_3);
		
		JButton btnTotalCost = new JButton("Total Cost");
		btnTotalCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double L = Labour * Double.parseDouble(txtLabour.getText());
				double P = Plastic * Double.parseDouble(txtPlastic.getText());
				double C = Coper * Double.parseDouble(txtCoper.getText());
				double Ch= Chrome  * Double.parseDouble(txtChrome.getText());
				double T = Travel * Double.parseDouble(txtTravel.getText());
				
				double SumUp = L + P + C + Ch + T;
				
				double cTax = (iTax *  SumUp)/100;
				
				String s = String.format("£ % .2f", SumUp);
				txtSubTotal.setText(s);
				
				String tTax = String.format("£ % .2f", cTax);
				txtTax.setText(tTax);
				
				double SumTotal = SumUp + cTax;
				
						
				String tTotal = String.format("£ % .2f", SumTotal);
				txtTotal.setText(tTotal);
				
				
				String Cost_of_L = String.format("£ % .2f", L);
				txtCostLabour.setText(Cost_of_L);
				
				String Cost_of_T = String.format("£ % .2f", T);
				txtCostTravel.setText(Cost_of_T);
				
				String Cost_of_P = String.format("£ % .2f", P);
				txtCostPlastic.setText(Cost_of_P);
				String Cost_of_C = String.format("£ % .2f", C);
				txtCostCoper.setText(Cost_of_C);
				
				String Cost_of_Ch= String.format("£ % .2f", Ch);
				txtCostChrome.setText(Cost_of_Ch);
				
			}
		});
		btnTotalCost.setToolTipText("Total Cost");
		btnTotalCost.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTotalCost.setBounds(30, 568, 127, 23);
		frame.getContentPane().add(btnTotalCost);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0, JLabel txtReceipt) {
				
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				txtCoper.setText(null);
				txtPlastic.setText(null);
				txtChrome.setText(null);
				txtLabour.setText(null);
				txtTravel.setText(null);
				
				
				txtCostLabour.setText(null);
				txtCostTravel.setText(null);
				txtCostPlastic.setText(null);
				txtCostChrome.setText(null);
				txtCostCoper.setText(null);
				
				
				txtReceipt.setText(null);		
				chckbxLabour.setSelected(false);
				chckbxTravel.setSelected(false);
				chckbxPlastic.setSelected(false);
				chckbxCoper.setSelected(false);
				chckbxChrome.setSelected(false);
			}
		});
		btnReset.setToolTipText("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(217, 568, 127, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnRecipt = new JButton("Receipt");
		btnRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e, JTextArea txtReceipt) {
				
			String cLabour = String.format(txtLabour.getText());
			String cTravel = String.format(txtTravel.getText());
			String cPlastic = String.format(txtPlastic.getText());
			
			String cCoper = String.format(txtCoper.getText());
			String cChrome = String.format(txtChrome.getText());
			
			String CostLabour = String.format(txtCostLabour.getText());
			String CostTravel = String.format(txtCostTravel.getText());
			String CostPlastic = String.format(txtCostPlastic.getText());
			
			String CostCoper = String.format(txtCostCoper.getText());
			String CostChrome = String.format(txtCostChrome.getText());
			
			String CostTax = String.format(txtTax.getText());
			String CostSubTotal = String.format(txtSubTotal.getText());
			String CostTotal = String.format(txtTotal.getText());
			
			//***********************************************************************************
			int refs = 1325 + (int) (Math.random()*4238);
			//***********************************************************************************
			
			Calendar timer = Calendar.getInstance();
			timer.getTime();
			SimpleDateFormat tTime = new SimpleDateFormat ("HH:mm:ss");
			tTime.format(timer.getTime());
			SimpleDateFormat tdate = new SimpleDateFormat ("DD:MMM:YYYY");
			tdate.format(timer.getTime());
			
			//*********************************************************************************
			      txtReceipt.append("\tOnline Billing Systems\n"
					+ "Refrence:\t\t\t" + refs +
					"\n**********************************\t" +
					"\nLabour:\t" + cLabour + " " + "Cost Of Labour : " + CostLabour +
					"\nTravel:\t" + cTravel + " " + "Cost Of Travel: " + CostTravel +
					
					"\nCoper:\t" + cCoper + " " + "Cost Of Coper: " + CostCoper +
					"\nLabour:\t" + cChrome + " " + "Cost Of Chrome: " + CostChrome +
					"\nLabour:\t" + cPlastic + " " + "Cost Of Plastic: " + CostPlastic +
					"\n**********************************\t" +
					"\nTax: \t.................." + CostTax +
					"\nSub Total: \t.................." + CostSubTotal +
					"\nTotal: \t.................." + CostTotal +
					"\n**********************************\t" +
					"\nDate: " + tdate.format(timer.getTime()) +
					"\tTime: " + tTime.format(timer.getTime()) +
					"\n\n\n\t\t Thank you\n");
			
			
			}
			
		});
		btnRecipt.setToolTipText("Receipt");
		btnRecipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRecipt.setBounds(404, 568, 127, 23);
		frame.getContentPane().add(btnRecipt);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame,"Confirm if u want to exit","Billing System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setToolTipText("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(589, 568, 127, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(178, 542, 1, 65);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(178, 543, 1, 64);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(178, 542, 1, 65);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(178, 552, 11, 65);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(368, 552, 11, 65);
		frame.getContentPane().add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(557, 542, 11, 65);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(10, 629, 767, 2);
		frame.getContentPane().add(separator_10);
		
		JTextPane txtpnCostOfLabour = new JTextPane();
		txtpnCostOfLabour.setText("Cost Of Labour");
		txtpnCostOfLabour.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCostOfLabour.setBounds(354, 117, 166, 23);
		frame.getContentPane().add(txtpnCostOfLabour);
		
		JTextPane txtpnCostOfTravelling = new JTextPane();
		txtpnCostOfTravelling.setText("Cost Of Travelling");
		txtpnCostOfTravelling.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCostOfTravelling.setBounds(354, 156, 166, 23);
		frame.getContentPane().add(txtpnCostOfTravelling);
		
		JTextPane txtpnCostOfPlastic = new JTextPane();
		txtpnCostOfPlastic.setText("Cost Of Plastic");
		txtpnCostOfPlastic.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCostOfPlastic.setBounds(354, 197, 166, 23);
		frame.getContentPane().add(txtpnCostOfPlastic);
		
		JTextPane txtpnCostOfCoper = new JTextPane();
		txtpnCostOfCoper.setText("Cost Of Coper");
		txtpnCostOfCoper.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCostOfCoper.setBounds(354, 238, 166, 23);
		frame.getContentPane().add(txtpnCostOfCoper);
		
		JTextPane txtpnCostOfChrome = new JTextPane();
		txtpnCostOfChrome.setText("Cost Of Chrome");
		txtpnCostOfChrome.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCostOfChrome.setBounds(354, 280, 166, 23);
		frame.getContentPane().add(txtpnCostOfChrome);
		
		txtCostLabour = new JTextField();
		txtCostLabour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCostLabour.setColumns(10);
		txtCostLabour.setBounds(600, 117, 239, 20);
		frame.getContentPane().add(txtCostLabour);
		
		txtCostTravel = new JTextField();
		txtCostTravel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCostTravel.setColumns(10);
		txtCostTravel.setBounds(600, 156, 239, 20);
		frame.getContentPane().add(txtCostTravel);
		
		txtCostPlastic = new JTextField();
		txtCostPlastic.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCostPlastic.setColumns(10);
		txtCostPlastic.setBounds(600, 197, 239, 20);
		frame.getContentPane().add(txtCostPlastic);
		
		txtCostCoper = new JTextField();
		txtCostCoper.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCostCoper.setColumns(10);
		txtCostCoper.setBounds(600, 238, 239, 20);
		frame.getContentPane().add(txtCostCoper);
		
		txtCostChrome = new JTextField();
		txtCostChrome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCostChrome.setColumns(10);
		txtCostChrome.setBounds(600, 283, 239, 20);
		frame.getContentPane().add(txtCostChrome);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(392, 340, 238, 2);
		frame.getContentPane().add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setBounds(392, 341, 232, 177);
		frame.getContentPane().add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setOrientation(SwingConstants.VERTICAL);
		separator_13.setBounds(414, 358, 213, 2);
		frame.getContentPane().add(separator_13);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setBounds(414, 358, 1, 153);
		frame.getContentPane().add(separator_14);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtReceipt.setBounds(954, 125, 375, 463);
		frame.getContentPane().add(txtReceipt);
	}
}
