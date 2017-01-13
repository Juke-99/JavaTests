package com.test.codehaus.jackson;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;

public class JSONFactoryTest {

	public static void main(String[] args) throws IOException {
		Writer out = new PrintWriter("JSON/test.json");
		JsonFactory jsonFactory = new JsonFactory();
		JsonGenerator jsonGenerator = jsonFactory.createJsonGenerator(out);
		
		jsonGenerator.writeStartObject();                       //{
		jsonGenerator.writeStringField("fieldname1","value1");  //{"fieldname1":"value1"
		jsonGenerator.writeBooleanField("isFieldname",true);    //{"fieldname":"value","isFieldname":true,"array"
		jsonGenerator.writeFieldName("array");                  //{"fieldname":"value","isFieldname":true,"array":[
		jsonGenerator.writeStartArray();                        //{"fieldname":"value","isFieldname":true,"array":[
		jsonGenerator.writeStartObject();                       //{"fieldname":"value","isFieldname":true,"array":[{
		jsonGenerator.writeStringField("fieldname2","value2");  //{"fieldname":"value","isFieldname":true,"array":[{"fieldname2":"value2"
		jsonGenerator.writeStringField("fieldname3","value3");  //{"fieldname":"value","isFieldname":true,"array":[{"fieldname2":"value2","fieldname3":"value3"
		jsonGenerator.writeStringField("fieldname4","value4");  //{"fieldname":"value","isFieldname":true,"array":[{"fieldname2":"value2","fieldname3":"value3","fieldname4":"value4"
		jsonGenerator.writeEndObject();                         //{"fieldname":"value","isFieldname":true,"array":[{"fieldname2":"value2","fieldname3":"value3","fieldname4":"value4"}
		jsonGenerator.writeEndArray();                          //{"fieldname":"value","isFieldname":true,"array":[{"fieldname2":"value2","fieldname3":"value3","fieldname4":"value4"}]
		jsonGenerator.writeStringField("fieldname5","value5");  //{"fieldname":"value","isFieldname":true,"array":[{"fieldname2":"value2","fieldname3":"value3","fieldname4":"value4"}],"fieldname5":"value5"
		jsonGenerator.writeEndObject();                         //{"fieldname":"value","isFieldname":true,"array":[{"fieldname2":"value2","fieldname3":"value3","fieldname4":"value4"}],"fieldname5":"value5"}
		jsonGenerator.flush();                                  //Output to specified directory.
	}

}
