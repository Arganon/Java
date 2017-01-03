import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class Diamond {
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

class SAXParser02 extends DefaultHandler {
	List<Diamond> diamonds = new ArrayList<>();
	Diamond diamond;
	int current;
	
	public List<Diamond> getList() {
		return diamonds;
	}

	@Override
	public void characters(char[] arg, int start, int length) throws SAXException {
		String body = new String(arg, start, length);
		
		switch(current) {
			case 3:
				diamond.name = body;
				break;
			case 4:
				diamond.type = body;
				break;
			case 5:
				diamond.placeOfMining = body;
				break;
			case 7:
				diamond.properties.colour = String.valueOf(body);
				break;
			case 8:
				diamond.properties.transparency = String.valueOf(body);
				break;
			case 9:
				diamond.properties.karats = Integer.valueOf(body);
				break;
		}
		current = 0;
	}

	@Override
	public void endDocument() throws SAXException {
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch(qName) {
			case "diamond":
				diamonds.add(diamond);
				break;
		}
	}

	@Override
	public void startDocument() throws SAXException {
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes arg3) throws SAXException {
		switch(qName) {
			case "diamonds":
				current = 1;
				break;
			case "diamond":
				diamond = new Diamond();
				diamond.id = arg3.getValue("id");
				current = 2;
				break;
			case "name":
				current = 3;
				break;
			case "type":
				current = 4;
				break;
			case "place":
				current = 5;
				break;
			case "properties":
				diamond.properties = new Diamond.Properties();
				current = 6;
				break;
			case "colour":
				current = 7;
				break;
			case "transparency":
				current = 8;
				break;
			case "karats":
				current = 9;
				break;
		}
	}
}


public class SAXParser01 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		SAXParser02 saxParser02 = new SAXParser02();
		parser.parse("/Users/macbook/Documents/workspaceNeon/Parser/src/Diamond.xml", saxParser02);
		
		List<Diamond> list = saxParser02.getList();
		
		for (Diamond d : list) {
			System.out.println("Name: " + d.getName());
			System.out.println("Type: " + d.getType());
			System.out.println("Place: " + d.getPlaceOfMining());
			System.out.println("Colour: " + d.getProperties().colour);
			System.out.println("Transparency: " + d.getProperties().transparency);
			System.out.println("Karats: " + d.getProperties().karats);
		}
	}
}
