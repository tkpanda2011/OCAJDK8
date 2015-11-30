package com.aurotech.parser.xsd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;

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
		
		EmployeeType emp=new EmployeeType();
		emp.setEmpName("Tripati");
		List<AddressType> addr=emp.getAddress();
		AddressType addr1=new AddressType();
		addr1.setName("Kazhkuttom");
		addr1.setStreet("chatacarrry");
		AddressType addr2=new AddressType();
		addr2.setName("Kazhkuttom2");
		addr2.setStreet("chatacarrry2");
		addr.add(addr1);
		addr.add(addr2);
		JAXBContext context = JAXBContext.newInstance(EmployeeType.class);
	    Marshaller m = context.createMarshaller();
	  

	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 //   m.marshal(emp, System.out);
	    m.marshal(emp, new File(BOOKSTORE_XML));
	    
	    System.out.println("Output from our XML File: ");
	    Unmarshaller um = context.createUnmarshaller();
	    EmployeeType empt = (EmployeeType) um.unmarshal(new FileReader(BOOKSTORE_XML));
	    System.out.println("EmpName"+empt.getEmpName());

	}

}
