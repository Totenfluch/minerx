package me.MinerX;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
  private JLabel background;
  
  public Frame1()
  {
    setLayout(null);
    setSize(807, 530);
    setUndecorated(false);
    setResizable(false);
    
    //Test
    
    setLayout(new BorderLayout());
    this.background = new JLabel(ResourceLoader.Iconload("/Dbb.png"));
    this.background.setBounds(0, 0, 800, 600);
    add(this.background);
    
    this.background.setLayout(null);
    

    this.Series = new JTextField("Getting Grafik Card Series ...", 30);
    this.Series.setEditable(false);
    this.Series.setBounds(53, 36, 250, 50);
    this.Series.setFont(new Font("Impact", 0, 20));
    this.background.add(this.Series);
    
    this.ExactName = new JTextField("Waiting for Series", 20);
    this.ExactName.setEditable(false);
    this.ExactName.setFont(new Font("Impact", 0, 20));
    this.ExactName.setBounds(53, 106, 250, 50);
    this.background.add(this.ExactName);
    
    this.PoolInfo = new JButton("Pool Information");
    this.PoolInfo.setBounds(503, 36, 250, 50);
    this.background.add(this.PoolInfo);
    
    this.MiningInfo = new JButton("Mining Information");
    this.MiningInfo.setBounds(503, 106, 250, 50);
    this.background.add(this.MiningInfo);
    
    this.Walletaddress = new JTextField("@Walletaddress", 30);
    this.Walletaddress.setBounds(241, 256, 325, 40);
    this.Walletaddress.setFont(new Font("Impact", 0, 20));
    this.background.add(this.Walletaddress);
    
    this.StartMining = new JButton("Start Mining");
    this.StartMining.setEnabled(false);
    this.StartMining.setBounds(253, 346, 300, 125);
    this.background.add(this.StartMining);
    
    setVisible(true);
    thehandler handler = new thehandler();
    
    this.PoolInfo.addActionListener(handler);
    this.MiningInfo.addActionListener(handler);
    this.StartMining.addActionListener(handler);
  }
  
  private class thehandler
    implements ActionListener
  {
    private thehandler() {}
    
    public void actionPerformed(ActionEvent e)
    {
      if (e.getSource() == Frame1.this.StartMining)
      {
        System.out.println(Frame1.this.Walletaddress.getText().toString() + " " + Frame1.this.ExactName.getText().toString());
        if (Main.GrakaSeries.contains("AMD")) {
          Main.Batchfile = "cgminer --scrypt -o http://p2p.com:8080 -u " + Frame1.this.Walletaddress.getText().toString() + " -px tflags " + (String)Specs.AMD.get(Frame1.this.ExactName.getText().toString());
        } else if (Main.GrakaSeries.contains("GeForce")) {
          Main.Batchfile = "cudaminer --scrypt -o http://p2p.com:8080 -u " + Frame1.this.Walletaddress.getText().toString() + " -px tflags " + (String)Specs.AMD.get(Frame1.this.ExactName.getText().toString());
        }
        JOptionPane.showMessageDialog(null, Main.Batchfile);
      }
    }
  }
  
  public void CheckExactName()
  {
    String p = this.ExactName.getText().toString();
    String f = (String)Specs.AMD.get(p);
    if ((f != "null") && (f != null) && (!this.Walletaddress.getText().equals("@Walletaddress")))
    {
      if ((p.contains("AMD")) || (p.contains("GeForce"))) {
        this.StartMining.setEnabled(true);
      }
    }
    else {
      this.StartMining.setEnabled(false);
    }
  }
}
