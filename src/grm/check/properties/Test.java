package grm.check.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = null;
		props = System.getProperties();
		try {
			props.load(new FileInputStream(new File("D:\\java\\webui_fr.properties")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Set keys = props.keySet();
	    for (Iterator it = keys.iterator(); it.hasNext();){
	        String k = (String) it.next();
	        String propsValue = props.getProperty(k);
	        System.out.println(k);
	        System.out.println(propsValue);
	    }
	}
}
