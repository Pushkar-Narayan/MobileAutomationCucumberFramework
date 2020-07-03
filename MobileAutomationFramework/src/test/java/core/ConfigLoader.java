package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	public String getDataFromConfig(String sData,String propFileName)
	{
		Properties prop = new Properties();
		File file = new File(System.getProperty("user.dir")+"/src/test/resources/propertyData/"+propFileName+".properties");
		FileInputStream Is = null;
		try {
			Is = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(Is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(sData);
	}
}
