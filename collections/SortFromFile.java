package collections;


import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.google.gson.Gson;

public class SortFromFile {

    public static void main(String[] args){

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("/home/sb-c2-02/ArunS/java-samples/src/collections/students.json"));

            // convert the file content to JSONArray
            JSONArray jsonArray = (JSONArray) obj;

            // To convert JSONArray to a Java array
            Gson gson = new Gson();

            // Each json String is converted to student and converted to array list
            ArrayList<Student> studentsList = gson.fromJson(String.valueOf(jsonArray), new TypeToken<ArrayList<Student>>(){}.getType());

            // age comparator and marks comparator
            Collections.sort(studentsList, new StudentComparator(
                    new AgeComparator(), new MarksComparator()
            ));

            for(Student student: studentsList) {
                System.out.println(student.name+" "+student.age+" "+student.marks);
            }


        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
