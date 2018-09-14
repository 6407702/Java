
/* 
День недели
*/

import java.io.*;

public class Test {
	public static void main(String[] args) throws Exception {
		// напишите тут ваш код

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(bufferedReader.readLine());
		
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear)
        {
            System.out.println("количество дней в году: 366");
        } else
           System.out.println("количество дней в году: 365");
    }
        
        

		
	}
