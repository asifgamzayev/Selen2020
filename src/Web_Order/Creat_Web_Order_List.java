package Web_Order;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Creat_Web_Order_List {

    public static List<String[]> read (String fileName) throws IOException{

        List<String[]> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA.csv"));

        String line;

        while ((line = br.readLine()) != null){
            String[] eachLine = line.split(",");
            list.add(eachLine);
        }

        return list;


    }
}
