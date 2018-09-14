package javacore.File;

import java.io.*;
public class FileCopy {

   public static void main(String args[]) throws IOException {  
      FileInputStream fileIn = null;
      FileOutputStream fileOut = null;

      try {
         fileIn = new FileInputStream("file.txt");
         fileOut = new FileOutputStream("copied_file.txt");
         
         int a;
	// ����������� ����������� ����� file.txt
         while ((a = fileIn.read()) != -1) {
            fileOut.write(a); // ������ ����������� ����� file.txt � ������ � ���� copied_file.txt
         }
      }finally {
         if (fileIn != null) {
            fileIn.close();
         }
         if (fileOut != null) {
            fileOut.close();
         }
      }
   }
}