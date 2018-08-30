import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class loadprop {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		File f = new File("test.txt");
		try {
			InputStream in = new FileInputStream(f);
			prop.load(in);
			float interest_rate=4;
			System.out.println(interest_rate);
			if(prop.getProperty("Interest")!=null){
				interest_rate=Float.parseFloat(prop.getProperty("Interest"));
			}
			//System.out.println(prop.getProperty("ThreadCount"));
			System.out.println(interest_rate);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
