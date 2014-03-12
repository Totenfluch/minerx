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
	public JButton PoolInfo;
	public JButton MiningInfo;
	private JButton StartMining;
	private boolean ExactNameRight = false;
	private boolean ExactWalletAddress = false;
	private JTextField ExperModeField;
	private JCheckBox ExpertModeCheckBox;
	private JRadioButton expertamd, experenv;

	public Frame1()
	{
		setLayout(null);
		setSize(807, 530);
		setUndecorated(false);
		setResizable(false);


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

		ButtonGroup toggle = new ButtonGroup();
		toggle.add(expertamd);
		toggle.add(experenv);

		Series = new JTextField("Getting Grafik Card Series ...", 30);
		Series.setEditable(false);
		Series.setBounds(53, 36, 250, 50);
		Series.setFont(new Font("Impact", 0, 20));
		add(this.Series);

		ExactName = new JTextField("Waiting for Series", 20);
		ExactName.setEditable(false);
		ExactName.setFont(new Font("Impact", 0, 20));
		ExactName.setBounds(53, 106, 250, 50);
		add(this.ExactName);

		PoolInfo = new JButton("Pool Information");
		PoolInfo.setBounds(503, 36, 250, 50);
		add(this.PoolInfo);

		MiningInfo = new JButton("Mining Information");
		MiningInfo.setBounds(503, 106, 250, 50);
		add(this.MiningInfo);

		Walletaddress = new JTextField("@Walletaddress", 30);
		Walletaddress.setBounds(241, 256, 325, 40);
		Walletaddress.setFont(new Font("Impact", 0, 20));
		add(this.Walletaddress);

		StartMining = new JButton("Start Mining");
		StartMining.setEnabled(false);
		StartMining.setBounds(253, 346, 300, 125);
		add(this.StartMining);

		setVisible(true);
		thehandler handler = new thehandler();

		ExpertModeCheckBox = new JCheckBox("Expert Mode");
		ExpertModeCheckBox.setBounds(56, 160, 100, 20);
		ExpertModeCheckBox.setBackground(Color.WHITE);
		ExpertModeCheckBox.setText("Expert Mode");
		add(ExpertModeCheckBox);

		ExperModeField = new JTextField("cgminer --script -o http://...", 20);
		ExperModeField.setBounds(56, 200, 695, 30);
		ExperModeField.setFont(new Font("Times New Roman", Font.BOLD, 25));
		ExperModeField.setEnabled(false);
		ExperModeField.setVisible(false);
		add(ExperModeField);

		PoolInfo.addActionListener(handler);
		MiningInfo.addActionListener(handler);
		StartMining.addActionListener(handler);
		ExpertModeCheckBox.addActionListener(handler);
		
		ExperModeField.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent arg0) {
				if(ExperModeField.getText().equals("cgminer --script -o http://...")){
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
				if(ExperModeField.getText().equals("cgminer --script -o http://...")){
					ExperModeField.setText("");
				}
			}

			public void mouseEntered(MouseEvent arg0) {
				if(ExperModeField.getText().equals("cgminer --script -o http://...")){
					ExperModeField.setText("");
				}
			}

			public void mouseExited(MouseEvent arg0) {
				if(ExperModeField.getText().equals("")){
					ExperModeField.setText("cgminer --script -o http://...");
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
							&& ExperModeField.getText().contains("-u") 
							&& (ExperModeField.getText().contains("http://") || ExperModeField.getText().contains("https://"))){
						
						Main.Batchfile = ExperModeField.getText();
						if(expertamd.isSelected() == true){
							folderpath = "cgminer";
						}else if(experenv.isSelected() == true){
							folderpath = "cudaminer\\x64";
						}
					}else{
						JOptionPane.showMessageDialog(null, "I thought you were so pro lol");
						return;
					}
				}
				else if (Main.GrakaSeries.contains("AMD"))
				{
					Main.Batchfile = "cgminer.exe --scrypt -o http://p2p.com:8080 -u " + Walletaddress.getText().toString() + " -p x " + (String)Specs.AMD.get(ExactName.getText().toString());
					folderpath = "cgminer";
				} 
				else if (Main.GrakaSeries.contains("NVIDIA")) 
				{
					Main.Batchfile = "cudaminer.exe -o http://p2p.com:8080 -u " + Walletaddress.getText().toString() + " -p x " + (String)Specs.NVIDIA.get(ExactName.getText().toString());
					folderpath = "cudaminer\\x64";
				}

				//JOptionPane.showMessageDialog(null, Main.Batchfile);
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

					//Runtime.getRuntime().exec("cmd /c start "+System.getProperty("user.dir")+"\\mine.bat");
					Process process2=Runtime.getRuntime().exec("cmd /c start "+System.getProperty("user.dir")+"\\"+folderpath + "\\mine.bat",
							null, new File(System.getProperty("user.dir")+"\\"+folderpath));
					process2.waitFor();
				} catch (IOException | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			if(e.getSource() == PoolInfo)
			{		

				JOptionPane.showMessageDialog(null, "http://");

			}
			if(e.getSource() == MiningInfo)
			{

				JOptionPane.showMessageDialog(null, "InArbeit");

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
					ExperModeField.setText("cgminer --script -o http://...");
				}
			}
		}
	}

	class DrawPane extends JPanel{
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g){
			g.drawImage(ResourceLoader.ImageLoad("/Dbb.png"), 0, 0, null);
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
