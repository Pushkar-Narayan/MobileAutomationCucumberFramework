package core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;





public class TestDataManager {
	
	public String getData(String data) 
    { 
       
        Object obj =null;
		try {
			obj = new JSONParser().parse(new FileReader("src/test/resources/testData/data.json"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
         
        JSONObject jo = (JSONObject) obj; 
        String Extitle = (String) jo.get(data);  
        System.out.println(Extitle); 
        return Extitle;
          
    } 
}
