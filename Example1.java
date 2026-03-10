package example1.example1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Example1 {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader filereader = new FileReader("jsonfile/emp.json");
		Object obj = jsonparser.parse(filereader);
		JSONObject empobj = (JSONObject) obj;
		String fname = (String) empobj.get("firstname");
		String lname = (String) empobj.get("lastname");
		System.out.println("firstname:"+fname);
		System.out.println("lastname:"+lname);
		
		
		
	}

}
