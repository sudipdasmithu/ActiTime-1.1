package com.Niosfear.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class LipLIB {
	@Test
	public void lib() throws IOException {
		FileInputStream fis= new FileInputStream("./data/handlefile.property");
		Properties p= new Properties();
	    p.load(fis);
	    String url = p.getProperty("url");
	    String un = p.getProperty("un");
	    String pw = p.getProperty("pw");
	    System.out.println(url);
	    System.out.println(un);
	    System.out.println(pw);
	}

}
