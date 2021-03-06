package com.te.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.dto.DtoClass;


public class Test {
	public static void main(String[] args) {
		DtoClass dtoClass = new DtoClass();
		dtoClass.setId(1);
		dtoClass.setName("Ajay");
		dtoClass.setPassword("Password");

		try {
			JAXBContext context = JAXBContext.newInstance(DtoClass.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(dtoClass, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
