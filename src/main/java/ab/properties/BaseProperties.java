package ab.properties;

public interface BaseProperties {
	String chromeDriver = "webdriver.chrome.driver";
	String projectDirectory = System.getProperty("user.dir");
	String chromeDriverpath = "/src/main/resources/drivers/chromedriver.exe";
	String chromePath = projectDirectory + chromeDriverpath;
	String google="https://www.google.com";
	String EBFC="http://ebfs.bruteforcesolution.net/ebfs/index.php";
	
}
