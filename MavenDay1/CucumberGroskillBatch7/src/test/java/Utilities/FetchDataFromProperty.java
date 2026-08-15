package Utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import ConstantData.ConstantsData;

public class FetchDataFromProperty {
	
	public static Properties getDataFromProperty() throws IOException
	{
		FileReader f=new FileReader(ConstantsData.PROP_FILE_PATH);
		Properties prop=new Properties();
		prop.load(f);
		return prop;
		
	}
	
	

}
