
import java.io.IOException;

import org.xml.sax.SAXException;

import xml.reader.XMLReader;

public class MainApp {

	public static void main(String[] args) throws SAXException, IOException {
		
		
		XMLReader reader = new XMLReader();
		reader.cargarArchivoDeDatos("C:\\Users\\vicen\\eclipseJAVA\\java.orientacion.objetos\\Casetas_De_Feria\\Ficheros\\casetasferia.xml");
		System.out.println(reader.cargarArchivoDeDatos("C:\\Users\\vicen\\eclipseJAVA\\java.orientacion.objetos\\Casetas_De_Feria\\Ficheros\\casetasferia.xml"));
		//"./Ficheros/casetasferia.xml//
	}

}

