package test.watashi.hadoop.conf;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import org.apache.hadoop.conf.Configuration;

public class DumpConfigurationTest {

	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration();
		Writer out = new PrintWriter("JSON/Configuration1.json");
		
		Configuration.dumpConfiguration(config, out);
	}

}
