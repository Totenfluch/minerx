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
	public static String pDOGEinBTC = null;
	public static String pDOGEDiff = null;
	public static boolean pFTCPriceinUSDisPulled = false;
	public static boolean pDOGEPriceisPulled = false;
	
	
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
	
	public static void poolInfoFTC() throws IOException, URISyntaxException {
		  if(java.awt.Desktop.isDesktopSupported() ) {
		        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

		        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE) ) {
		          java.net.URI uri = new java.net.URI("http://mine-ftc.co.uk:19327/static/index.html");
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
	
	public static void poolInfoDOGE() throws IOException, URISyntaxException {
		  if(java.awt.Desktop.isDesktopSupported() ) {
		        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

		        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE) ) {
		          java.net.URI uri = new java.net.URI("http://doge.st/");
		              desktop.browse(uri);
		        }
		  } 
	}
	
	public static void CoinCalcDOGE() throws IOException, URISyntaxException {
		  if(java.awt.Desktop.isDesktopSupported() ) {
		        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

		        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE) ) {
		          java.net.URI uri = new java.net.URI("http://www.minedogecoin.com/dogecoin-mining-profitability-calculator/");
		              desktop.browse(uri);
		        }
		  } 
	}
	
	public static void getDOGEinBTC(){
		
		String placeholder = null;
		String placeholder1 = null;


		final String userAgent = "Mozilla/5.0 (Windows; U; Windows NT 5.1; de; rv:1.8.1.12) Gecko/20080201 Firefox/2.0.0.12";
		try {
			URL url = new URL("https://www.dogeapi.com//wow/v2/?a=get_current_price&convert_to=USD&amount_doge=1000");
			URLConnection conn = url.openConnection();
			conn.addRequestProperty("User-Agent", userAgent);

			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String str, str1; 
			str = new String();
			while ((str1 = in.readLine()) != null) {
				str = str + str1;
			} 
			in.close(); 
			placeholder = str.substring(18,25);
			placeholder1 = placeholder.replaceAll("}", " ");
			pDOGEinBTC ="1000 DOGE = "+ placeholder1 +"$";
		} catch (MalformedURLException e) 
		{
		} 
		catch (IOException e) 
		{
		}		
		pDOGEPriceisPulled = true;
	}
	
	public static void getDOGEDiff(){
		
		String placeholder = null;
		String placeholder1 = null;

		final String userAgent = "Mozilla/5.0 (Windows; U; Windows NT 5.1; de; rv:1.8.1.12) Gecko/20080201 Firefox/2.0.0.12";
		try {
			URL url = new URL("https://www.dogeapi.com/wow/v2/?a=get_difficulty");
			URLConnection conn = url.openConnection();
			conn.addRequestProperty("User-Agent", userAgent);

			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String str, str1; 
			str = new String();
			while ((str1 = in.readLine()) != null) {
				str = str + str1;
			} 
			in.close(); 
			placeholder = str.substring(22,29);
			placeholder1 = placeholder.replaceAll("}", " ");
			pDOGEDiff ="Difficulty = "+ placeholder1;
		} catch (MalformedURLException e) 
		{
		} 
		catch (IOException e) 
		{
		} 
	}
	
	
}



