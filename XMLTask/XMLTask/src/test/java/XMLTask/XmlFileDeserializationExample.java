package XMLTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlFileDeserializationExample {

	public static void main(String[] args) throws Exception{



		// our XML file for this example
		File xmlFile = new File("websites.xml");

		// Let's get XML file as String using BufferedReader
		// FileReader uses platform's default character encoding
		// if you need to specify a different encoding,
		// use InputStreamReader
		Reader fileReader = new FileReader(xmlFile);
		BufferedReader bufReader = new BufferedReader(fileReader);

		StringBuilder sb = new StringBuilder();
		String line = bufReader.readLine();
		while( line != null){
			sb.append(line).append("\n");
			line = bufReader.readLine();
		}
		String xmlString = sb.toString();
		System.out.println("XML to String using BufferedReader : ");
//		System.out.println(xmlString);

		// Convert XML to a Map structure
		XmlMapper xmlMapper = new XmlMapper();
		Websites websites = xmlMapper.readValue(xmlString, Websites.class);
	    // Access website data
	    for (Website websiteUsingJackson : websites.getWebsite()) {
	      System.out.println("URL: " + websiteUsingJackson.getURL());
	      System.out.println("Title: " + websiteUsingJackson.getTile());
	      System.out.println("Description: " + websiteUsingJackson.getDescription());
	      System.out.println("Created Date: " + websiteUsingJackson.getCreatedDate());
	      System.out.println("----------");
	    }
	  }
} 
