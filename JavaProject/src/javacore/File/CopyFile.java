package javacore.File;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



public class CopyFile {

	//Path FROM = Paths.get("C:\\Users\\SBT-Dubov-DYu\\Downloads\\In.txt");

	//Path TO = Paths.get("C:\\Users\\SBT-Dubov-DYu\\Downloads\\Out.txt");
	
	

	public static   void CopyFile2(String FROM, String TO) throws IOException {

		Path FROM1 = Paths.get(FROM);
		Path TO1 = Paths.get(TO);

		CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING,
				StandardCopyOption.COPY_ATTRIBUTES };
		Files.copy(FROM1, TO1, options);
		
		
		
	}

	
	
	
}

