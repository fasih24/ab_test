package PropertyFileOp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyFileLoadin {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\uddin\\eclipse-workspace\\Selenium\\ab\\src\\test\\java\\PropertyFileOp\\name.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("Job"));
	}

}
