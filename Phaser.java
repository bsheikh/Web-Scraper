import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phaser {
	
	Map<String, Integer> htmlTags;
	
	public Phaser() {
		htmlTags = new HashMap<String, Integer>();
	}
	
	public void pharseDocument(URLConnection connection) {
		
   	BufferedReader br;
   	
		try {
			br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	   	String inputLine;
	   	while ((inputLine = br.readLine()) != null) {
	   		//System.out.println(inputLine);
	   		String pattern = "< ?([A-Za-z]+)";
	         Pattern r = Pattern.compile(pattern);
	         Matcher m = r.matcher(inputLine);
	         
	         if (m.find()) {
	            //System.out.println("Found value: " + m.group(1));
	            
	            if(htmlTags.containsKey(m.group(1))) {
	            	int currentCount = htmlTags.get(m.group(1));
	            	htmlTags.put(m.group(1), currentCount + 1);
	            	
	            } else {
	            	htmlTags.put(m.group(1), 1);
	            }
	         }
	         
	   	}
	   	br.close();		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(String key: htmlTags.keySet()) {
			System.out.println(key + " - " + htmlTags.get(key));
		}
      	
	}
}
