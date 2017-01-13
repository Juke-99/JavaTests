package test.watashi.hadoop.conf;

import java.io.DataInput;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.hadoop.conf.Configuration;

public class Main extends Configuration{

	public static void main(String[] args) throws IOException {
		
		HadoopConf hc=new HadoopConf();
		Writer out=new PrintWriter(System.out);
		Configuration conf=hc.getConf();
		Configuration test=hc.getConf();
		Set<String> finalParameters=conf.getFinalParameters();
		
		hc.setConf(conf);
		//hc.viewConf(null,null,"DEPRECATE_KEYS");
		
		//conf.getConfResourceAsInputStream("");
		//conf.getConfResourceAsReader("");
		/*********************************************************************
			test.getFile("color","XML");
			configureXMLファイルの中にあるproperty内のnameがあれば、それの値をとって指定したパスにその値のフォルダ名を作成する。
		**********************************************************************/
		
		//System.out.println();
		//System.out.println(conf.onlyKeyExists("color"));
		//conf.reloadConfiguration();
		System.out.println(conf.size());
		
		//System.out.println(test);
		System.out.println(conf.get("tempdir"));
	}

}
