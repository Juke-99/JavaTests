package test.watashi.hadoop.conf;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;

import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configuration;

public class HadoopConf implements Configurable{
	
	Configuration conf=new Configuration();
	
	@Override
	public Configuration getConf() {
		return conf;
	}

	@Override
	public void setConf(Configuration conf){
		
		try {
			conf.addResource(new File("XML/conf.xml").getAbsoluteFile().toURI().toURL());
			conf.reloadConfiguration();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void setDefaultConf(Configuration conf,String xmlConfFile){
		Configuration.addDefaultResource(xmlConfFile);
		System.out.println(conf);
	}
	
	public void setDeprecation(Configuration conf,String key,String newKey){
		Configuration.addDeprecation(key,newKey);
		System.out.println(conf);
	}
	
	public void viewConf(Configuration conf,Writer out,String viewName) throws IOException{
		
		switch(viewName)
		{
		case "CONFIGURATION":
			System.out.println("------------------------------configration-------------------------------");
			System.out.print("\n");
			
			if(conf!=null&&out!=null)
			{
				Configuration.dumpConfiguration(conf,out);
			}
			else
			{
				System.out.println("引数が'null'です。");
			}
			
			System.out.print("\n");
			System.out.println("-------------------------------------------------------------------------");
			
			break;
		
		case "DEPRECATE_KEYS":
			System.out.println("------------------------------deprecate-keys-------------------------------");
			System.out.print("\n");
			Configuration.dumpDeprecatedKeys();
			System.out.print("\n");
			System.out.println("-------------------------------------------------------------------------");
			
			break;
			
		default:
			System.out.println("入力が正しくありません。\n");
			System.out.println("----------------------options---------------------");
			System.out.println("     CONFIGURATION: 現在のconfigを確認します。");
			System.out.println("     DEPREACTE_KEYS: Deprecateされたkeyを確認します。");
			System.out.println("\n");
		}
	}
	
	//System.out.println(conf.getPassword("password"));
	//conf.getSocketAddr("test.port","hdfs://localhost",9999);
	//System.out.println(conf.getStringCollection("color"));
	//System.out.println(conf.getStrings("color"));
	//conf.getTimeDuration("number",3,TimeUnit.HOURS);
	//System.out.println(conf.getTrimmed("color"));
	//System.out.println(conf.getTrimmedStringCollection("fs.defaultFS"));
	//System.out.println(conf.getTrimmedStrings("color"));
	//System.out.println(conf.getValByRegex("c"));
	//System.out.println(Configuration.hasWarnedDeprecation("net.topology.script.file.name"));
	//System.out.println(Configuration.isDeprecated("key"));
	//System.out.println(conf.iterator());
}
