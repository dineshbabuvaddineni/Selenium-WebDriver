package selenium_day20_DataDrivenTesting_Excel_Part2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Test Data\\config.properties");
		
		//Loading properties file
		Properties propObj=new Properties();
		propObj.load(file);
		
		//Reading data from properties file
		
		String url=propObj.getProperty("appurl");
		String email=propObj.getProperty("email");
		String pwd=propObj.getProperty("password");
		String orid=propObj.getProperty("orderid");
		String custid=propObj.getProperty("customerid");
		
		System.out.println(url +" "+email+" "+pwd+" "+orid+" "+custid);
		
		
		//Reading all the keys from properties
		//Set<String> keys=propObj.stringPropertyNames();
		//System.out.println(keys);
		
		Set<Object> keys=propObj.keySet();
		System.out.println(keys);
		
		//Reading all the values from properties file
		Collection<Object> values=propObj.values();
		System.out.println(values);
		
		file.close();
		
	}

}
