import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebStats {
	public static void main(String[] args) {
		
		URL url;
		Phaser phaser = new Phaser();
		

      try {
      	
      	String a="http://www.ryerson.ca/index.html";
      	url = new URL(a);
      	URLConnection connection = url.openConnection();
      	phaser.pharseDocument(connection);

      	
      	} catch (MalformedURLException e) {
      		e.printStackTrace();
      	} catch (IOException e) {
      		e.printStackTrace();
      	}
	}
}
