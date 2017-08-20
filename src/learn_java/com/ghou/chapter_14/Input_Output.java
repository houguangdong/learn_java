package learn_java.com.ghou.chapter_14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) throws IOException {
		Scanner scann = new Scanner(System.in);
		System.out.println("请输入文件路径");
		String filePath = scann.next();
		File file = new File(filePath);
		// 是否为文件
		if(file.isFile()){
			System.out.println(filePath + "文件");
			System.out.println(file.canRead() ? "可读": "不可读");
			System.out.println(file.canWrite() ? "可写": "不可写");
			System.out.println(file.length()+"字节");
		}else{
			//列出所有的文件及目录
			File[] files = file.listFiles();
			ArrayList<File> fileList = new ArrayList<File>();
			for (int i = 0; i < files.length; i++) {
				//先列出目录
				if(files[i].isDirectory()){ //是否为路径
					//取得路径名
					System.out.println("[" + files[i].getPath() + "]");
				}else{
					//文件先存入fileList, 一会在列出
					fileList.add(files[i]);
				}
			}
			//列出文件
			for(File f: fileList){
				System.out.println(f.toString());
			}
			System.out.println();
		}
		File file1 = new File(filePath);
		//建立RandomAccessFile实例并以读写模式开启文件
		RandomAccessFile randomAccessFile = new RandomAccessFile(file1, "rw");
		List<Student> list = new ArrayList<Student>();
		Student student1 = new Student("zhangsan", 30);
		Student student2 = new Student("lisi", 30);
		list.add(student1);
		list.add(student2);
		
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			//使用对应的write方法写入数据
			randomAccessFile.writeChars(student.getName()+"\t");
			randomAccessFile.writeInt(student.getScore());
		}
		//使用seek()方法操作存取位置
		randomAccessFile.seek(40);
        //设定关闭文件
        randomAccessFile.close();
        
        // InputStream OutputStream 
        try{
        	System.out.print("输入字元: ");
            System.out.println("输入字符十进制表示: " + System.in.read());
        }catch(IOException e){
        	e.printStackTrace();
        }
        
        FileInputStream fileInputStream = new FileInputStream(new File(args[0]));
        //如果传入true 文件存在直接写入， 不存在则创建在写入
        FileOutputStream fileOutputStream = new FileOutputStream(new File(args[1]), true);
        while(true){
        	if(fileInputStream.available() < 1024){
        		//剩余的资料比1024字节少
                //一位一位读出再写入目标文件
        		int remain = -1;
        		while((remain = fileInputStream.read()) != -1){
        			fileOutputStream.write(remain);
        		}
        		break;
        	}else{
        		byte[] buffer = new byte[1024];
        		//从来源文件读取数据至缓冲区
                fileInputStream.read(buffer);
                //将数组数据写入目标文件
                fileOutputStream.write(buffer);
        	}
        }
		fileInputStream.close();
		fileOutputStream.close();
		
		String srcFile = null;
		String desFile = null;
		byte[] data = new byte[1024];
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desFile));
		System.out.println("复制文件：" + srcFile.length() + "字节");
		while(bufferedInputStream.read(data) != -1){
			bufferedOutputStream.write(data);
		}
		//将缓冲区中的数据全部写出
		bufferedOutputStream.flush();
		//关闭串流
		bufferedInputStream.close();
		bufferedOutputStream.close();
		
//		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(args[0]));
//		for(Member member: members){
//			//写入UTF字符串
//			dataOutputStream.writeUTF(member.getName());
//			//写入int资料
//			dataOutputStream.writeInt(member.getAge());
//		}
//		//出清所有数据至目的地
//		dataOutputStream.flush();
//		//关闭串流
//		dataOutputStream.close();
		
//		DataInputStream dataInputStream = new DataInputStream(new FileInputStream(args[0]));
//		//读出数据并还原为对象
//		for (int i = 0; i < members.length; i++) {
//			//读出UTF字符串
//			String name = dataInputStream.readUTF();
//			//读出int资料
//			int score = dataInputStream.readInt();
//			members[i] = new Member(name, score);
//		}
//		//关闭串流
//		dataInputStream.close();

	}
	
//	public static void writeObjectsToFile(Object[] objs, String filename){
//		File file = new File(filename);
//		try{
//			ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//			for(Object obj: objs){
//				//将对象写入文件
//				objOutputStream.writeObject(obj);
//			}
//			//关闭串流
//			objOutputStream.close();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//	}
//	String file = null;
//	FileInputStream fileInputStream = new FileInputStream(file);
//	ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
//	while(fileInputStream.available() > 0){
//		list.add((User) objInputStream.readObject());
//	}
//	objInputStream.close();
//	附加模式
//	ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));
//	如果要附加对象至文件后
//	必须重新定义这个方法
//	protected void writeStreamHeader() throws IOException {
//		
//	}
//	for(Object obj: objs){
//		//将对象写入文件
//		objOutputStream.writeObject(obj);
//	}
//	objOutputStream.close();
}


class User implements Serializable{
	private static final long serialVersionUID = 1L;
//	在写入对象时，您要使用writeObject()方法
//	读出对象时则使用readObject()方法，被读出的对象都是以Object的型态传回
}