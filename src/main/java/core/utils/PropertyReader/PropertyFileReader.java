package core.utils.PropertyReader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PropertyFileReader {

    Map<String, String> ReadTxtFile(String Path){
        Map<String, String> map = new HashMap<>();
        String line;

        try{
            BufferedReader buf = new BufferedReader(new FileReader(Path));
            while ((line = buf.readLine()) != null) {
                String parts[] = line.split("\t");
                map.put(parts[0], parts[1]);
            }
            buf.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return map;
    }

    Map<String, String> ReadXMLFile (String Path){
        Map<String, String> map = new HashMap<>();

        try {
            File inputFile = new File(Path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Data");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    map.put(eElement.getElementsByTagName("Key").item(0).getTextContent(),
                            eElement.getElementsByTagName("Value").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    Map<String, String> ReadCSVFile(String Path){
        Map<String, String> map = new HashMap<>();
        String csvFile = Path;
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] country = line.split(cvsSplitBy);

                map.put(country[0], country[1]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static ArrayList<String> ReadCSVFileSingleColumn(String Path){
        ArrayList<String> map = new ArrayList<String>();
        String csvFile = Path;
        String line;
        String cvsSplitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {

                String[] country = line.split(cvsSplitBy);

                map.add(country[0]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }



    public ArrayList<String> listFilesForFolder(String Path) {

        ArrayList<String> TestCases = new ArrayList<>();

        String PathToParent = new File(System.getProperty("user.dir")).getPath();

        String PathToProperties = PathToParent+Path;
        File folder = new File(PathToProperties);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                TestCases.add(listOfFiles[i].toString());
            }
        }

        return TestCases;
    }

    public Map<String, String> ReadProperties(ArrayList<String> Properties){
        Map<String, String> map = new HashMap<>();

        for(int i =0 ;i<Properties.size();i++){
            if (Properties.get(i).contains("txt")){
                return ReadTxtFile(Properties.get(i));
            } else if (Properties.get(i).contains("csv")){
                return ReadCSVFile(Properties.get(i));
            } else if (Properties.get(i).contains("xml")){
                return ReadXMLFile(Properties.get(i));
            }
        }
        return map;
    }
}
