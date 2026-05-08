package com.demo.day8;

public class AdapterDemo {

	public static void main(String[] args) {

		// 1. We have a legacy service
		LegacyXmlService legacyService = new LegacyXmlService();

		// 2. We wrap it in an adapter so it looks like a JsonParser
		JsonParser adapter = new XmlToJsonAdapter(legacyService);

		// 3. The client uses the modern interface it knows
		adapter.parseJson("{ 'user': 'John' }");
	}
}

interface JsonParser {
	void parseJson(String jsonMarkup);
}

//The legacy class that we can't change
class LegacyXmlService {
	public void readXml(String xmlData) {
		System.out.println("Reading Legacy XML: " + xmlData);
	}
}

class XmlToJsonAdapter implements JsonParser {
	private LegacyXmlService xmlService;

	public XmlToJsonAdapter(LegacyXmlService xmlService) {
		this.xmlService = xmlService;
	}

	@Override
	public void parseJson(String jsonMarkup) {
		// Translation logic: converting JSON input to XML format for the legacy service
		System.out.println("Adapter converting JSON to XML...");
		String convertedXml = "<data>" + jsonMarkup + "</data>";

		// Delegate the work to the legacy service
		xmlService.readXml(convertedXml);
	}
}
