package learn_java.com.ghou.chapter_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetName {

	public static String getName() throws IOException{ // ArrayIndexOutOfBoundsException
		String name=null;
		System.out.println("请输入你的名字");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		name=reader.readLine();
		return name;
	}

}
