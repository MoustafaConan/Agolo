package XMLTask;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintAfter1September {

	public static void main(String[] args) throws Exception {

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
		while (line != null) {
			sb.append(line).append("\n");
			line = bufReader.readLine();
		}
		String xmlString = sb.toString();
		System.out.println("XML to String using BufferedReader : ");
//		System.out.println(xmlString);

		// Convert XML to a Map structure
		XmlMapper xmlMapper = new XmlMapper();
		Websites websites = xmlMapper.readValue(xmlString, Websites.class);

		// Filter websites created after September 1st
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date filterDate = sdf.parse("09/01/2023"); // Adjust year as needed


		// Access website data
		for (Website website : websites.getWebsite()) {

			Date websiteCreatedDate = sdf.parse(website.getCreatedDate());
			if (websiteCreatedDate.after(filterDate)) {
				System.out.println("Website created after September 1st:");
				System.out.println("  URL: " + website.getURL());
				System.out.println("  Title: " + website.getTile());
				System.out.println("----------");
			}
		}
	}
}
