package demo;

public class Rania {
	
	public static void main(String[] args) {
        // Charger le document XML
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = factory.newDocumentBuilder().parse("path/to/your/xml/file.xml");

        // Créer un objet XPath
        XPath xpath = XPathFactory.newInstance().newXPath();

        // Exemple : Extraire tous les éléments "book" du document
        String expression = "//book";
        NodeList bookNodes = (NodeList) xpath.compile(expression).evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < bookNodes.getLength(); i++) {
            // Traiter chaque élément "book" ici
            System.out.println(bookNodes.item(i).getTextContent());
        }
	}

}
