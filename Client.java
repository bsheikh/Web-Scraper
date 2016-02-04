import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Client {

	public Client() {}

	public URLConnection connectToWebsite(String websiteURL) {

		URL url;
		URLConnection connection = null;
		
		try {
			url = new URL(websiteURL);
			connection = url.openConnection();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
	
	

}
