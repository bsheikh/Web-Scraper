public class WebStats {
	public static void main(String[] args) {

		// get content from user
		// if no content, use default numbers
		// call the Client and get connection
		
		Praser phaser = new Praser();
		Client HTTPClient = new Client();
		phaser.pharseDocument(HTTPClient.connectToWebsite("http://www.ryerson.ca/index.html"));
		phaser.printHtmlTags();
	}
	
	
	
}
