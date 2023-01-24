
import java.io.*;
import java.util.*;

public class pc1st {

    public static void main(String[] args)
            throws IOException {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the InputPath");
        String inputPath = s.nextLine();
        System.out.println("Enter the OutputPath");
        String outputPath = s.nextLine();
        System.out.println("Enter File Name:-");
        String fileName = s.nextLine();
        System.out.println("Enter Output File Name:-");
        String OutputFile = s.nextLine();

        FileInputStream FI = null;
        FileOutputStream FO = null;

        try {

            FI = new FileInputStream(inputPath + "\\" + fileName);

            FO = new FileOutputStream(outputPath + "\\" + OutputFile);
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
