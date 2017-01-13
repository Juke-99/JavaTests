package com.test.javax.parsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class DocumentBuilderFactoryTest {

	public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
		DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
		documentbuilderfactory.setIgnoringComments(true);  //Supporting Comments
		documentbuilderfactory.setNamespaceAware(true);  //Supporting Namespace
		documentbuilderfactory.setXIncludeAware(true);  //Supporting XInclude
		
		DocumentBuilder documentbuilder = documentbuilderfactory.newDocumentBuilder();
		Document document = documentbuilder.parse(new FileInputStream("./XML/builder.xml"));
		Element element = document.getDocumentElement();
		//String value = null;
		
		if(!"parameter".equals(element.getTagName()))
		{
			System.out.println("<parameter> isn't exist.");
		}
		
		NodeList nodelist = element.getChildNodes();
		System.out.println(element.getChildNodes());
		
		for(int i = 0;i<nodelist.getLength();i++)
		{
			System.out.println(nodelist.item(i));
			Node node = nodelist.item(i);
			
			if(!(node instanceof Element))
			{
				continue;
			}
			
			Element prop = (Element)node;
			//System.out.println("map".equals(prop.getTagName()));
			
			if("map".equals(prop.getTagName()) && prop.hasChildNodes())
			{
				//System.out.println(((Text) prop.getFirstChild()).getData().trim());
				System.out.println("OK");
			}
		}
	}
}
