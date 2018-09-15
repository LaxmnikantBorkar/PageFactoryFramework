package Steps;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class GetProperties {
	String envFileName;

	@BeforeTest
	@Parameters(value = "envName")
	public void beforeTest(String envName) {
		envFileName = envName;
		String url = getProperties("url");
		System.out.println(url);

	}

	public String getProperties(String key) {
		Properties prop = new Properties();
		String value = null;
		try {

			String path = System.getProperty("user.div") + "\\src\\env\\"
					+ envFileName + ".properties";
			System.out.println(path);
			File f = new File(path);
			FileReader reader = new FileReader(f);
			prop.load(reader);
			System.out.println(prop.getProperty(key));
			value = prop.getProperty(key);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return value;

	}

}
