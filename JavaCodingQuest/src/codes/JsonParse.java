package codes;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParse {

      public static void main(String[] args) throws IOException, ParseException {
            // TODO Auto-generated method stub
            getArticle(2);

      }

      public static List<String> getArticle(int max) throws IOException, ParseException {

            List<String> list = new ArrayList<>();
            JSONParser jp = new JSONParser();
            FileReader reader = new FileReader("test.json");
            Object obj = jp.parse(reader);
            JSONObject articleJO = (JSONObject) obj;

            String title = (String) articleJO.get("title");
            System.out.println("Title: " + title);

            return list;
      }

}
