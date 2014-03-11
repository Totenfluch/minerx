package me.MinerX;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

	public Frame1()
	{
		setLayout(null);
		setSize(807, 530);
		setUndecorated(false);
		setResizable(false);
		

		setContentPane(new DrawPane());
		setLayout(null);

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

		PoolInfo.addActionListener(handler);
		MiningInfo.addActionListener(handler);
		StartMining.addActionListener(handler);
		
		repaint();
	}

	private class thehandler
	implements ActionListener
	{
		PrintWriter writer;

		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == StartMining)
			{
				System.out.println(Walletaddress.getText().toString() + " " + ExactName.getText().toString());

				if (Main.GrakaSeries.contains("AMD"))
				{
					Main.Batchfile = "cgminer --scrypt -o http://p2p.com:8080 -u " + Walletaddress.getText().toString() + " -px tflags " + (String)Specs.AMD.get(ExactName.getText().toString());

				} 
				else if (Main.GrakaSeries.contains("NVIDEA")) 
				{
					Main.Batchfile = "cudaminer --scrypt -o http://p2p.com:8080 -u " + Walletaddress.getText().toString() + " -px tflags " + (String)Specs.NVIDEA.get(ExactName.getText().toString());
				}

				JOptionPane.showMessageDialog(null, Main.Batchfile);
				try { 
					writer = new PrintWriter(new FileWriter("test.bat")); 
					writer.println(Main.Batchfile); 
				} catch (IOException ioe) { 
					ioe.printStackTrace(); 
				} finally { 
					if (writer != null) 
						writer.flush(); 
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
		}
	}

	class DrawPane extends JPanel{
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g){
			g.drawImage(ResourceLoader.ImageLoad("/Dbb.png"), 0, 0, null);
			if(ExactNameRight == true){
				g.drawImage(ResourceLoader.ImageLoad("/greendot.png"), 600, 256, 40, 40, null);
			}else if(ExactNameRight == false){
				g.drawImage(ResourceLoader.ImageLoad("/reddot.png"), 600, 256, 40, 40, null);
			}
		}
	}



	public void CheckExactName()
	{
		String p = ExactName.getText().toString();
		String f = (String)Specs.AMD.get(p);
		String g = (String)Specs.NVIDEA.get(p);
		if ((((f != "null") && (f != null)) || (g != "null") && (g != null)) && (!Walletaddress.getText().equals("@Walletaddress") && Walletaddress.getText().length() == 34))
		{
			if ((p.contains("AMD")) || (p.contains("GeForce"))) {
				StartMining.setEnabled(true);
				ExactNameRight = true;
			}
		}
		else {
			StartMining.setEnabled(false);
			ExactNameRight = false;
		}
		
		repaint();
	}



}
