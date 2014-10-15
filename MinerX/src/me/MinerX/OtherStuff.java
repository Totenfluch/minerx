package me.MinerX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JOptionPane;



public class OtherStuff {
	public static String pFTCPriceinUSD = null;
	public static String pFTCDiff = null;
	public static boolean pFTCPriceinUSDisPulled = false;
	
	
	public static void getFTCPriceUSD() throws IOException{

		final String userAgent = "Mozilla/5.0 (Windows; U; Windows NT 5.1; de; rv:1.8.1.12) Gecko/20080201 Firefox/2.0.0.12";
		try {
			URL url = new URL("http://api.feathercoin.com/?output=usd&amount=1&json=0");
			URLConnection conn = url.openConnection();
			conn.addRequestProperty("User-Agent", userAgent);

			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String str, str1; 
			str = new String();
			while ((str1 = in.readLine()) != null) {
				str = str + str1;
			} 
			in.close(); 
			pFTCPriceinUSD ="1 FTC = "+ str + "$";
			
		} catch (MalformedURLException e) 
		{
		} 
		catch (IOException e) 
		{
			JOptionPane.showMessageDialog(null, "You need to be connected to the Internet to be able to mine");
			System.exit(0);
		} 

		pFTCPriceinUSDisPulled = true;
	}

	public static void getFTCDiff(){

		final String userAgent = "Mozilla/5.0 (Windows; U; Windows NT 5.1; de; rv:1.8.1.12) Gecko/20080201 Firefox/2.0.0.12";
		try {
			URL url = new URL("http://api.feathercoin.com/?output=difficulty&json=0");
			URLConnection conn = url.openConnection();
			conn.addRequestProperty("User-Agent", userAgent);

			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String str, str1; 
			str = new String();
			while ((str1 = in.readLine()) != null) {
				str = str + str1;
			} 
			in.close(); 
			pFTCDiff ="Difficulty = "+ str;
		} catch (MalformedURLException e) 
		{
		} 
		catch (IOException e) 
		{
		} 
	}
	
	public static void poolInfoFTCMuddy() throws IOException, URISyntaxException {
		  if(java.awt.Desktop.isDesktopSupported() ) {
		        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

		        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE) ) {
		          java.net.URI uri = new java.net.URI("http://neoscryptmuddy/");
		              desktop.browse(uri);
		        }
		  } 
	}
	
	public static void poolInfoFTCWellen() throws IOException, URISyntaxException {
		  if(java.awt.Desktop.isDesktopSupported() ) {
		        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

		        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE) ) {
		          java.net.URI uri = new java.net.URI("http://p2pool.neoscrypt.de:10554");
		              desktop.browse(uri);
		        }
		  } 
	}
	
	public static void poolInfoFTCLizhi() throws IOException, URISyntaxException {
		  if(java.awt.Desktop.isDesktopSupported() ) {
		        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

		        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE) ) {
		          java.net.URI uri = new java.net.URI("http://ftc-c.com//Lizhi");
		              desktop.browse(uri);
		        }
		  } 
	}
	
	public static void CoinCalcFTC() throws IOException, URISyntaxException {
		  if(java.awt.Desktop.isDesktopSupported() ) {
		        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

		        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE) ) {
		          java.net.URI uri = new java.net.URI("http://Feathercoin.com/calc/");
		              desktop.browse(uri);
		        }
		  } 
	}
	
}



