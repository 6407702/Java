package javacore.File;

import java.io.File;
import java.io.IOException;



public class FileOper {
	
	
	
public static void main(String... aArgs) throws IOException {
		
		
	ExistFile("C:\\Users\\SBT-Dubov-DYu\\Downloads\\In.txt");	
	
	isFile("C:\\Users\\SBT-Dubov-DYu\\Downloads");
	isDirectory("C:\\Users\\SBT-Dubov-DYu\\Downloads");
			
	}


public static   void ExistFile(String FILE) throws IOException {

	File File = new File (FILE);
	
	if (File.exists()) 
		System.out.println("���� ����");
	
	else 
		System.out.println("��� �����");
	
	
}

public static   void isFile(String FILE) throws IOException {

	File File = new File (FILE);
	
	if (File.isFile()) 
		System.out.println("����");
	
	else 
		System.out.println("�� ����");
	
	
}

public static   void isDirectory(String FILE) throws IOException {

	File File = new File (FILE);
	
	if (File.isDirectory()) 
		System.out.println("����������");
	
	else 
		System.out.println("�� ����������");
	
	
}

}
