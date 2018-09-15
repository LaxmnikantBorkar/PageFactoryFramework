package Steps;

import java.net.URL;
import java.net.URLConnection;

public class InternetTest {

	public static void main(String[] str) {
		while (true) {
			try {
				URL url = new URL("https://www.facebook.com");
				URLConnection connection = url.openConnection();
				connection.connect();
				System.out.println("Connected to facebook");
			} catch (Exception e) {
				System.out.println("Connection FAILED!");
			}

			try {
				Thread.sleep(30000);
			} catch (Exception e) {
				System.out.println("Error while pausing thread");
			}
		}
	}
}
