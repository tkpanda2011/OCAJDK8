package com.wellpoint.sales.eox.poc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.xml.sax.SAXException;

public class JAXBParserDemoUnMarshaller {

	/**
	 * @param args
	 * @throws SAXException 
	 * @throws FileNotFoundException 
	 * @throws JAXBException 
	 */
	 private static final String BOOKSTORE_XML = "c:\\bookstore-jaxb.xml";
	public static void main(String[] args) throws SAXException, FileNotFoundException, JAXBException {
		
		ContentsType contents=new ContentsType();
		List<ContentType> content=contents.getContent();
		ContentType c1=new ContentType();
		ContentIDType ct1=new ContentIDType();
		ct1.setState("odisha");
		ct1.setVendor("mithun");
		c1.setContentID(ct1);
		content.add(c1);
		ContentType c2=new ContentType();
		ContentIDType ct2=new ContentIDType();
		ct2.setState("odisha2");
		ct2.setVendor("mithun2");
		c2.setContentID(ct2);
		content.add(c2);
		
		JAXBContext context = JAXBContext.newInstance(ContentsType.class);
	    Marshaller m = context.createMarshaller();
		    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    m.marshal(contents, System.out);
	    m.marshal(contents, new File(BOOKSTORE_XML));
	    
	    System.out.println("Output from our XML File: ");
	    Unmarshaller um = context.createUnmarshaller();
	    ContentsType contents2 = (ContentsType) um.unmarshal(new FileReader(BOOKSTORE_XML));
	    

	}

}
