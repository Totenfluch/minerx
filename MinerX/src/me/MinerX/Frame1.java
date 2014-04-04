package me.MinerX;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Frame1
extends JFrame
{
	private static final long serialVersionUID = 5728268678792319157L;
	public JTextField Series;
	public JTextField Walletaddress;
	public JTextField ExactName;
	public JTextField BTCaddress;
	public JTextField FTCaddress;
	public JTextField Region;
	public JButton PoolInfo;
	public JButton CoinCalc;
	public JRadioButton chooserftc, chooserdoge, europe, america;
	private JButton StartMining;
	private boolean ExactNameRight = false;
	private boolean ExactWalletAddress = false;
	private JTextField ExperModeField;
	private JCheckBox ExpertModeCheckBox;
	private JRadioButton expertamd, experenv;
	public Font ftdefault = new Font("Times New Roman", Font.BOLD, 22);
	public Font dogedefault = new Font("Comic Sans MS", Font.BOLD, 18);
	public Font normal = new Font("Times New Roman", Font.BOLD, 20);
	

	public Frame1()
	{
		setLayout(null);
		setSize(807, 530);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("MinerX");

		setContentPane(new DrawPane());
		setLayout(null);

		expertamd = new JRadioButton("AMD");
		expertamd.setBounds(56, 240, 100, 20);
		expertamd.setVisible(false);
		expertamd.setEnabled(false);
		expertamd.setBackground(Color.WHITE);
		expertamd.setSelected(true);
		add(expertamd);

		experenv = new JRadioButton("NVIDIA");
		experenv.setBounds(56, 260, 100, 20);
		experenv.setVisible(false);
		experenv.setEnabled(false);
		experenv.setBackground(Color.WHITE);
		add(experenv);
		
		chooserdoge = new JRadioButton("DOGE");
		chooserdoge.setBounds(650,280,100, 20);
		chooserdoge.setVisible(true);
		chooserdoge.setEnabled(true);
		chooserdoge.setBackground(Color.WHITE);
		add(chooserdoge);
		
		chooserftc = new JRadioButton("FTC");
		chooserftc.setBounds(650,250,100, 20);
		chooserftc.setVisible(true);
		chooserftc.setEnabled(true);
		chooserftc.setBackground(Color.WHITE);
		chooserftc.setSelected(true);
		add(chooserftc);
		
		america = new JRadioButton("USA");
		america.setBounds(56,350,100,20);
		america.setFont(dogedefault);
		america.setVisible(false);
		america.setEnabled(false);
		america.setBackground(Color.WHITE);
		america.setSelected(true);
		add(america);
		
		europe = new JRadioButton("Europe");
		europe.setBounds(56,370,100,20);
		europe.setFont(dogedefault);
		europe.setVisible(false);
		europe.setEnabled(false);
		europe.setBackground(Color.WHITE);
		add(europe);

		ButtonGroup toggle = new ButtonGroup();
		toggle.add(expertamd);
		toggle.add(experenv);
		
		ButtonGroup chose = new ButtonGroup();
		chose.add(chooserdoge);
		chose.add(chooserftc);
		
		ButtonGroup country = new ButtonGroup();
		country.add(europe);
		country.add(america);

		Series = new JTextField("Getting Grafik Card Series ...", 30);
		Series.setEditable(false);
		Series.setBounds(53, 36, 250, 50);
		Series.setFont(new Font("Impact", 0, 20));
		add(this.Series);
		
		Region = new JTextField("Region");
		Region.setVisible(false);
		Region.setBounds(53, 310, 100 ,30);
		Region.setEditable(false);
		Region.setFont(dogedefault);
		Region.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		Region.setBackground(Color.WHITE);
		add(Region);

		ExactName = new JTextField("Waiting for Series", 20);
		ExactName.setEditable(false);
		ExactName.setFont(new Font("Impact", 0, 20));
		ExactName.setBounds(53, 106, 250, 50);
		add(this.ExactName);

		PoolInfo = new JButton("Pool Information");
		PoolInfo.setBounds(503, 36, 250, 50);
		add(this.PoolInfo);

		CoinCalc = new JButton("Feathercoin Calculator");
		CoinCalc.setBounds(503, 106, 250, 50);
		add(this.CoinCalc);

		Walletaddress = new JTextField("@Walletaddress", 30);
		Walletaddress.setBounds(241, 256, 325, 40);
		Walletaddress.setFont(new Font("Impact", 0, 20));
		add(this.Walletaddress);

		StartMining = new JButton("Start Mining");
		StartMining.setEnabled(false);
		StartMining.setBounds(253, 346, 300, 125);
		add(this.StartMining);
		
		/*BTCaddress = new JTextField("BTC: 15JCDD3g47KZEKN4qU3YWj75eRP7ru8JAZ");
		BTCaddress.setBounds(53, 480, 300, 20);
		BTCaddress.setEditable(false);
		BTCaddress.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BTCaddress.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		BTCaddress.setBackground(Color.WHITE);
		add(BTCaddress);
		
		FTCaddress = new JTextField("FTC: 6sxjM96KMZ7t4AmDTUKDZdq82Nj931VQvY");
		FTCaddress.setBounds(454, 480, 300, 20);
		FTCaddress.setEditable(false);
		FTCaddress.setFont(new Font("Times New Roman", Font.BOLD, 12));
		FTCaddress.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		FTCaddress.setBackground(Color.WHITE);
		add(FTCaddress);*/

		setVisible(true);
		thehandler handler = new thehandler();

		ExpertModeCheckBox = new JCheckBox("Expert Mode");
		ExpertModeCheckBox.setBounds(56, 160, 100, 20);
		ExpertModeCheckBox.setBackground(Color.WHITE);
		ExpertModeCheckBox.setText("Expert Mode");
		add(ExpertModeCheckBox);

		ExperModeField = new JTextField("cgminer --scrypt -o http://...", 20);
		ExperModeField.setBounds(56, 200, 695, 30);
		ExperModeField.setFont(new Font("Times New Roman", Font.BOLD, 25));
		ExperModeField.setEnabled(false);
		ExperModeField.setVisible(false);
		add(ExperModeField);

		PoolInfo.addActionListener(handler);
		CoinCalc.addActionListener(handler);
		StartMining.addActionListener(handler);
		ExpertModeCheckBox.addActionListener(handler);
		
		
		
		ExperModeField.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent arg0) {
				if(ExperModeField.getText().equals("cgminer --scrypt -o http://...")){
					ExperModeField.setText("");
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}
		
		});
		
		
		ExperModeField.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				if(ExperModeField.getText().equals("cgminer --scrypt -o http://...")){
					ExperModeField.setText("");
				}
			}

			public void mouseEntered(MouseEvent arg0) {
				if(ExperModeField.getText().equals("cgminer --scrypt -o http://...")){
					ExperModeField.setText("");
				}
			}

			public void mouseExited(MouseEvent arg0) {
				if(ExperModeField.getText().equals("")){
					ExperModeField.setText("cgminer --scrypt -o http://...");
				}
			}
		});
		
		repaint();
	}

	private class thehandler
	implements ActionListener
	{
		PrintWriter writer;
		String folderpath;

		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == StartMining)
			{
				if(Main.ExpertMode == true){
					if((ExperModeField.getText().contains("cgminer") || ExperModeField.getText().contains("cudaminer"))
							&& ExperModeField.getText().contains("-u")){
						
						Main.Batchfile = ExperModeField.getText();
						if(expertamd.isSelected() == true){
							folderpath = "cgminer";
						}else if(experenv.isSelected() == true){
							folderpath = "cudaminer\\x64";
						}
					}else{
						JOptionPane.showMessageDialog(null, "Try Again.");
						return;
					}
				}
				else if (Main.GrakaSeries.contains("AMD"))
					if(chooserdoge.isSelected() == true){
						
						Main.Batchfile = "cgminer.exe --scrypt -o stratum+tcp://ny.proxypool.doge.st:9666 -u " + Walletaddress.getText().toString() + " -p x " + (String)Specs.AMD.get(ExactName.getText().toString());
						folderpath = "cgminer";
						
					}
					else{
						
						Main.Batchfile = "cgminer.exe --scrypt -o http://mine-ftc.co.uk:19327 -u " + Walletaddress.getText().toString() + " -p x " + (String)Specs.AMD.get(ExactName.getText().toString());
						folderpath = "cgminer";
					}
				
					 
				else if (Main.GrakaSeries.contains("NVIDIA"))
					if(chooserdoge.isSelected() == true){
						
						Main.Batchfile = "cudaminer.exe -o http://mine-ftc.co.uk:19327 -u " + Walletaddress.getText().toString() + " -p x " + (String)Specs.NVIDIA.get(ExactName.getText().toString());
						folderpath = "cudaminer\\x64";
						
					}
					else{
						Main.Batchfile = "cudaminer.exe -o http://mine-ftc.co.uk:19327 -u " + Walletaddress.getText().toString() + " -p x " + (String)Specs.NVIDIA.get(ExactName.getText().toString());
						folderpath = "cudaminer\\x64";
					}

				try { 
					writer = new PrintWriter(new FileWriter(System.getProperty("user.dir")+"\\"+folderpath+"\\mine.bat")); 
					writer.println(Main.Batchfile); 
				} catch (IOException ioe) { 
					ioe.printStackTrace(); 
				} finally { 
					if (writer != null) 
						writer.flush();
					writer.close();
				}

				try {

					Process process2=Runtime.getRuntime().exec("cmd /c start "+System.getProperty("user.dir")+"\\"+folderpath + "\\mine.bat",
							null, new File(System.getProperty("user.dir")+"\\"+folderpath));
					process2.waitFor();
				} catch (IOException | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			if(e.getSource() == PoolInfo)
			{
				if(chooserdoge.isSelected() == true){
					try {
						OtherStuff.poolInfoDOGE();
					} catch (IOException | URISyntaxException e1) {

						e1.printStackTrace();
					}
				}
				else{

					try {
						OtherStuff.poolInfoFTC();
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
				}

			}
			if(e.getSource() == CoinCalc)
			{
				if(chooserdoge.isSelected() == true){
					try {
						OtherStuff.CoinCalcDOGE();
					} catch (IOException | URISyntaxException e1) {
						e1.printStackTrace();
					}
				}
				else{
					try {
						OtherStuff.CoinCalcFTC();
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
				}

			}

			if(e.getSource() == ExpertModeCheckBox){
				if(ExpertModeCheckBox.isSelected() == true){
					ExperModeField.setEnabled(true);
					ExperModeField.setVisible(true);
					experenv.setVisible(true);
					experenv.setEnabled(true);
					expertamd.setVisible(true);
					expertamd.setEnabled(true);
					Series.setEnabled(false);
					Walletaddress.setEnabled(false);
					ExactName.setEnabled(false);
					Main.ExpertMode = true;
				}else{
					ExperModeField.setEnabled(false);
					ExperModeField.setVisible(false);
					experenv.setVisible(false);
					experenv.setEnabled(false);
					expertamd.setVisible(false);
					expertamd.setEnabled(false);
					Series.setEnabled(true);
					Walletaddress.setEnabled(true);
					ExactName.setEnabled(true);
					Main.ExpertMode = false;
					ExperModeField.setText("cgminer --scrypt -o http://...");
				}
			}
		}
	}

	class DrawPane extends JPanel{
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g){
			
			if(chooserdoge.isSelected() == true){
				expertamd.setFont(dogedefault);
				experenv.setFont(dogedefault);
				Series.setFont(dogedefault);
				ExactName.setFont(dogedefault);
				PoolInfo.setFont(dogedefault);
				CoinCalc.setFont(dogedefault);
				CoinCalc.setText("Such Profit?");
				Walletaddress.setFont(dogedefault);
				StartMining.setFont(dogedefault);
				ExperModeField.setFont(dogedefault);
				america.setVisible(true);
				america.setEnabled(true);
				europe.setVisible(true);
				europe.setEnabled(true);
				Region.setVisible(true);
			}
			else{
				expertamd.setFont(normal);
				experenv.setFont(normal);
				Series.setFont(normal);
				ExactName.setFont(normal);
				PoolInfo.setFont(normal);
				CoinCalc.setFont(normal);
				CoinCalc.setText("Feathercoin Calculator");
				Walletaddress.setFont(normal);
				StartMining.setFont(normal);
				ExperModeField.setFont(normal);
				america.setVisible(false);
				europe.setVisible(false);
				america.setEnabled(false);
				europe.setEnabled(false);
				Region.setVisible(false);
				
			}
			
			if(chooserdoge.isSelected() == true){
				g.drawImage(ResourceLoader.ImageLoad("/DOGE.png"), 0, 0, null);
				g.setFont(dogedefault);
			}
			else{
				g.drawImage(ResourceLoader.ImageLoad("/Dbb.png"), 0, 0, null);
				g.setFont(ftdefault);
			}
			if(chooserdoge.isSelected() == true){
				
				if(OtherStuff.pDOGEPriceisPulled == true){
					g.drawString(OtherStuff.pDOGEinBTC, 560, 400);
				}
				else{
					g.drawString("Fetching BTC Price...",560,400);
				}
				
				if(OtherStuff.pDOGEDiff != null && OtherStuff.pDOGEDiff != "null"){
					g.drawString(OtherStuff.pDOGEDiff, 560, 430);
				}else{
					g.drawString("Fetching difficulty...", 560, 430);
				}
			}
			else{
				
				if(OtherStuff.pFTCPriceinUSDisPulled == true){
					g.drawString(OtherStuff.pFTCPriceinUSD, 575, 400);
				}else{
					g.drawString("Fetching USD Price...", 570, 400);
				}
				
				if(OtherStuff.pFTCDiff != null && OtherStuff.pFTCDiff != "null"){
					g.drawString(OtherStuff.pFTCDiff, 575, 430);
				}else{
					g.drawString("Fetching difficulty...", 570, 430);
				}
				
			}
						
			if(ExactWalletAddress == true)
			{
				g.drawImage(ResourceLoader.ImageLoad("/greendot.png"), 180, 258, 35, 35, null);
			}
			else if(ExactWalletAddress == false)
			{
				g.drawImage(ResourceLoader.ImageLoad("/reddot.png"), 180, 258, 35, 35, null);
			}
			if(ExactNameRight == true)
			{
				g.drawImage(ResourceLoader.ImageLoad("/greendot.png"), 10, 115, 35, 35, null);
			}
			else if(ExactNameRight == false)
			{
				g.drawImage(ResourceLoader.ImageLoad("/reddot.png"), 10, 115, 35, 35, null);
			}
		}
	}



	public void CheckExactName()
	{
		String p = ExactName.getText().toString();
		String f = (String)Specs.AMD.get(p);
		String g = (String)Specs.NVIDIA.get(p);
		boolean check1 = false;
		boolean check2 = false;
		if ((!Walletaddress.getText().equals("@Walletaddress") && Walletaddress.getText().length() == 34)  || Main.ExpertMode == true)
		{
			check1 = true;
			ExactWalletAddress = true;

		}
		else {
			check1 = false;
			StartMining.setEnabled(false);
			ExactWalletAddress = false;
		}
		if((f != "null") && (f != null) || (g != "null") && (g != null) || Main.ExpertMode == true)
		{

			if ((p.contains("AMD")) || (p.contains("NVIDIA")) || Main.ExpertMode == true) {
				check2 = true;
				ExactNameRight = true;
			}
			else{
				check2 = false;
				StartMining.setEnabled(false);
				ExactNameRight = false;
			}
		}else{
			check2 = false;
			StartMining.setEnabled(false);
			ExactNameRight = false;
		}

		if(check1 == true && check2 == true){
			StartMining.setEnabled(true);
		}

		repaint();
	}



}
