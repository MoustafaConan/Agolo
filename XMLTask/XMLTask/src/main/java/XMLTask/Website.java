package XMLTask;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "Website")
//@JsonPropertyOrder({ "URL", "Tile", "Description", "CreatedDate" })
public class Website {
    @JacksonXmlProperty(localName = "Website")
    List<Website> websiteUsingJacksons;

    @JacksonXmlProperty(localName = "URL")
    private String URL;
    
    @JacksonXmlProperty(localName = "Tile")
    private String Tile;
    
	@JacksonXmlProperty(localName = "Description")
    private String Description;
        
    @JacksonXmlProperty(localName = "CreatedDate")
    private String CreatedDate;
    
    // Default constructor
    public Website() {
    }
    
    // Constructor with URL parameter
    public Website(String URL) {
        this.URL = URL;
    }

	public String getURL() {
		return URL;
   }


    public void setURL(String URL) {
        this.URL = URL;
    }


	public String getTile() {
		return Tile;
	}


    public void setTile(String Tile) {
        this.Tile = Tile;
    }


	public String getDescription() {
		return Description;
	}

    public List<Website> getWebsiteUsingJacksons() {
        return websiteUsingJacksons;
    }
    public void setWebsiteUsingJacksons(List<Website> websiteUsingJacksons) {
        this.websiteUsingJacksons = websiteUsingJacksons;
    }

void setDescription(String Description) {
		this.Description = Description;
	}


	public String getCreatedDate() {
		return CreatedDate;
	}


	public void setCreatedDate(String CreatedDate) {
		this.CreatedDate = CreatedDate;
	}

}
