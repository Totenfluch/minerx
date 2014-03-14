package me.MinerX;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Main
{
	public static Frame1 frame1;
	public static String GrakaSeries = "";
	public static String Batchfile;
	private static Timer timer;
	private static ImageIcon img;
	public static boolean ExpertMode = false;

	public static void main(String[] args) throws IOException
	{
		frame1 = new Frame1();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(3);
		URL imageURL2 = Main.class.getResource("/feathercoinIcon.png");
		img = null;
		if (imageURL2 != null) {
			img = new ImageIcon(imageURL2);
		}
		frame1.setIconImage(img.getImage());

		Specs.initSpecs();
		try {
			OtherStuff.getFTCPriceUSD();
			OtherStuff.getFTCDiff();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		timer = new Timer(10, new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Main.frame1.CheckExactName();
			}
		});
		timer.start();
		try
		{
			String filePath = "./foo.txt";
			//File file = new File(filePath);
			//file.createNewFile();
			ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","dxdiag","/t",filePath);
			System.out.println("-- Executing dxdiag command --");
			Process p = pb.start();
			p.waitFor();

			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = br.readLine()) != null)
			{
				if (((line.trim().startsWith("Card name:")) || (line.trim().startsWith("Current Mode:"))) && 
						(line.trim().startsWith("Card name:")))
				{
					GrakaSeries = line.trim().replace("Card name: ", "");
					frame1.Series.setText(GrakaSeries);
					frame1.ExactName.setText(GrakaSeries.replace(" Series", ""));
					frame1.ExactName.setEditable(true);
				}
			}
			br.close();
		}
		catch (IOException|InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

}
