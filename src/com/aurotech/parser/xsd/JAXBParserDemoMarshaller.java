package com.aurotech.parser.xsd;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class JAXBParserDemoMarshaller {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContest=JAXBContext.newInstance("com.aurotech.parser.xsd");
			Marshaller marshaller=jaxbContest.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			
			

	}

}
