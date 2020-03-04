package com.sinosoft;

import java.io.File;
import java.io.IOException;

public class MyClass {
	/*
	 * 测试程序
	 */
	//dev 分支

	public static void main(String[] args) throws IOException {
		String path = "D:/test";
		File file = new File(path);
//		exists()
		/*if(file.exists()) {
			System.out.println("yes");
		}*/
//		createNewFile
		/*File file1 = new File(path+File.separator+"33.txt");
		File file2 = new File(path+File.separator+"11.txt");
		if(file1.createNewFile()) {
			System.out.println("create success");
		}*/
//		mkdir&mkdirss
		/*File file2 = new File(path+File.separator+"dd"+File.separator+"111");
		if(file2.mkdirs()) {
			System.out.println("aaa");
		}
		*/
//		delete 
		/*File file2 = new File(path+File.separator+"11.txt");
		File file3 = new File(path+File.separator+"dd");
		if(file2.delete()) {
			System.out.println("succ");
		}
		if(file3.delete()) {
			System.out.println("s");
		}*/
		/*File file2 = new File(path+File.separator+"dd"+File.separator+"111.txt");
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getName());
		System.out.println(file2.getPath());
		System.out.println(file2.getParent());
		System.out.println(file2.getParentFile());
	
*/		
		String[] list = file.list();
		for(String l : list) {
			System.out.println(l);
		}
		
		File[] listFiles = file.listFiles();
		for(File f : listFiles) {
			System.out.println(f.getName());
		}
		
		
		
	}
}

