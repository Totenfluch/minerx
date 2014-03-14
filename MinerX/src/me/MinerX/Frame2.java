package me.MinerX;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame2 extends JFrame {
	
	private JTextField bAddress;
	private JTextField fAddress;
	
	public Frame2(){
	
	setLayout(null);
	setSize(400, 300);
	setUndecorated(false);
	setLocationRelativeTo(null);
	setResizable(false);
	setTitle("Information");
	setLayout(null);
	
	bAddress = new JTextField("BTC: 15JCDD3g47KZEKN4qU3YWj75eRP7ru8JAZ", 30);
	bAddress.setEditable(false);
	bAddress.setBounds(10, 180, 380, 20);
	bAddress.setBackground(Color.WHITE);
	bAddress.setFont(new Font("TimesNewRoman", 0, 15));
	add(this.bAddress);
	
	fAddress = new JTextField("FTC: 6sxjM96KMZ7t4AmDTUKDZdq82Nj931VQvY", 30);
	fAddress.setEditable(false);
	fAddress.setBounds(10, 200, 380, 20);
	fAddress.setBackground(Color.WHITE);
	fAddress.setFont(new Font("TimesNewRoman", 0, 15));
	add(this.fAddress);
	
	
	}
	public void paintImage(Graphics g){
		
		g.drawImage(ResourceLoader.ImageLoad("/FA_Heart.png"), 200, 150, 50, 50, null);
		
	}
	
		
		
		

}
