package extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// step 1 create a java representation object of the physical file 
        // CRM_Vtiger/src/test/resources/commondata.properties modified to
		//.src/test/resources/commondata.properties 
		
		FileInputStream fis = new FileInputStream("C:\\Users\\AKSHAY ANAND\\git\\mavenGitPush\\CRM_Vtiger\\src\\test\\resources\\commondata.properties");
		 
		// properties class
		//step 2:- by using load(), load all the keys
		Properties pobj = new Properties();
		pobj.load(fis);
		
		// by using getProperty(key) get the value 
		 String URL = pobj.getProperty("url");
		 String BROWSER = pobj.getProperty("browser");
		 String PASSWORD = pobj.getProperty("password");
		 String USERNAME = pobj.getProperty("username");		
	
		 System.out.println(BROWSER);
			System.out.println(URL);
			System.out.println(USERNAME);
			System.out.println(PASSWORD);

//			ResourceBundle resource = ResourceBundle.getBundle("commondata");
//			String URL = resource.getString("url");
//			System.out.println(URL);
	
	}

}
