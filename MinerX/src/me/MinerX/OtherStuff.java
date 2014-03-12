package me.MinerX;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class OtherStuff {
	public static String pFTCPriceinUSD = null;
	public static void getFTCPriceUSD() throws MalformedURLException{
		URL oracle;
		try {
			oracle = new URL("http://api.feathercoin.com/?output=usd&amount=1&json=1 ");
		HttpURLConnection httpcon = (HttpURLConnection )oracle.openConnection();
		pFTCPriceinUSD = String.valueOf(httpcon.getContent());
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*BufferedReader in = new BufferedReader(
					new InputStreamReader(oracle.openStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null){
				FTCPriceinUSD = inputLine;
			}               
		}catch(Exception e){
			e.printStackTrace();
		}*/

		pFTCPriceinUSD.replace("{", "").replace("}", "").replace("\"", "").replace(":", " ");
		String[] temp = pFTCPriceinUSD.split(" ");
		pFTCPriceinUSD = "$"+temp[1] + " " + temp[0].toUpperCase() + "/FTC";
	}

}
