package me.MinerX;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;


public class OtherStuff {
	public static String pFTCPriceinUSD = null;
	public static void getFTCPriceUSD() throws IOException{
		
		
        
        URL url = new URL("http://api.feathercoin.com");
        final URLConnection  connection = url.openConnection();
        connection.connect();
        final StringBuilder content = new StringBuilder();
        Reader reader = null;
		try
		{
			reader = new InputStreamReader(new BufferedInputStream(connection.getInputStream(), 1024));
			IOUtils.copy(reader, content);


			final JSONObject head = new JSONObject(content.toString());
			for (final Iterator<String> i = head.keys(); i.hasNext();)
			{
				final String currencyCode = i.next();
				final JSONObject o = head.getJSONObject(currencyCode);
				final String rate = o.optString("15m", null);
			}
		}
		finally
		{
			if (reader != null)
				reader.close();
		}

		//pFTCPriceinUSD.replace("{", "").replace("}", "").replace("\"", "").replace(":", " ");
		//String[] temp = pFTCPriceinUSD.split(" ");
		//pFTCPriceinUSD = "$"+temp[1] + " " + temp[0].toUpperCase() + "/FTC";
	}

}
