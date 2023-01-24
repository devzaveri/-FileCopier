
import java.io.*;


public class pc1st {

	
	public static void main(String[] args)
		throws IOException
	{

		
		FileInputStream FI = null;
		FileOutputStream FO = null;

		
		try {

			
			FI = new FileInputStream(
				"C:\\Users\\promact\\Desktop\\java PC\\t.txt");

			
			FO = new FileOutputStream(
				"C:\\Users\\promact\\Desktop\\java PC\\tx.txt");

			int c;

			
			while ((c = FI.read()) != -1) {

				
				FO.write(c);
			}

			System.out.println(
				"File Copied");
		}

		
		finally {

			

			if (FI != null) {

				
				FI.close();
			}
			if (FO != null) {

				
				FO.close();
			}
		}
	}
}
