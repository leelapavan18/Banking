package Utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class JsonDataProvider {
	Object obj;
		@DataProvider(name = "loginData")
		public Object[][] getJsonData(Method method) throws IOException, org.json.simple.parser.ParseException {
			// Define the file path
			String filePath = System.getProperty("user.dir") 
	                + "/src/main/java/Utils/Details.json";;
			// Use JSONParser to parse the file content
			JSONParser parser = new JSONParser();
			try(FileReader reader = new FileReader(filePath)){;
			obj = parser.parse(reader);
			}

			// Cast the object to a JSONArray
			JSONArray userList = (JSONArray) obj;

			// Create a 2D array to hold the data for the DataProvider
			Object[][] data = new Object[userList.size()][2]; // Two columns: username and password

			for (int i = 0; i < userList.size(); i++) {
				JSONObject user = (JSONObject) userList.get(i);
				data[i][0] = user.get("username").toString();
				data[i][1] = user.get("password").toString();
			}

			return data;
		}
	}


