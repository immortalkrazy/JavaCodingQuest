package codes;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParse {

      public static void main(String[] args) throws IOException, ParseException {
            // TODO Auto-generated method stub
            getArticle(2);

      }

      public static List<String> getArticle(int max) throws IOException, ParseException {

            String fileName = "sample.json";
            String directory = System.getProperty("user.dir");
            String path = "";
            path = directory + File.separator + fileName;
            System.out.println(path);

            File file = new File(path);
            try {
                  if (file.createNewFile()) {
                        System.out.println("New File Created");
                  } else {
                        System.out.println("File Already Exists");
                  }
            } catch (Exception e) {
                  e.printStackTrace();
            }

            List<String> list = new ArrayList<>();
            JSONParser jp = new JSONParser();
            FileReader reader = new FileReader(path);
            JSONObject jo = (JSONObject) jp.parse(reader);

            JSONArray ja = (JSONArray) jo.get("data");

            List<Object> jList = new ArrayList<>(ja);
            for (Object obj : jList) {
                  System.out.println(obj);
            }

//            Object obj = jp.parse(reader);
//            JSONObject articleJO = (JSONObject) obj;
//
//            String title = (String) articleJO.get("data[1]");
//            System.out.println("Title: " + title);

            return list;
      }

}
