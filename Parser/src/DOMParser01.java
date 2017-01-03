import java.util.ArrayList;
import java.util.List;

import org.jdom2.input.SAXBuilder;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import Diamond1.Properties;

class Diamond1 {
	String id;
	String name;
	String type;
	String placeOfMining;
	Properties properties;
	
	static class Properties {
		String colour;
		String transparency;
		int karats;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlaceOfMining() {
		return placeOfMining;
	}

	public void setPlaceOfMining(String placeOfMining) {
		this.placeOfMining = placeOfMining;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}

public class DOMParser01 {
	public static List<Diamond1> diamondsParser(String fileName) {
		List<Diamond1> diamonds = new ArrayList<>();
		SAXBuilder builder = new SAXBuilder();
		
		return diamonds;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
