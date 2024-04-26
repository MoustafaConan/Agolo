package XMLTask;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Websites")
public class Websites {
	@JacksonXmlProperty(localName = "Website")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Website> website;

	  // Getter and setter for website list
	  public List<Website> getWebsite() {
	    return website;
	  }

	  public void setWebsite(List<Website> website) {
	    this.website = website;
	  }
	
	
//    @JacksonXmlProperty(localName = "Website")
//    private Website[] websites;
//
//    public Website[] getWebsites() {
//        return websites;
//    }
//
//    public void setWebsites(Website[] websites) {
//        this.websites = websites;
//    }
//    
//    // Default constructor
//    public Websites() {
//    }
    
}
