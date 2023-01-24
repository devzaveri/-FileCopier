import java.util.*;
import java.io.*;
public class jav2{
    public static void main(String[] args) 
        throws IOException {
        String fName = "C:\\Users\\promact\\Desktop\\java PC";
        File FI = new File(fName);
        String oName = "C:\\Users\\promact\\Desktop\\java PC";
        File FO = new File(oName);

        String FileName = "t.txt";
        
        File temp = null;

        FileReader readfile = null;
        FileWriter writefile = null;

        readfile = new FileReader(FI+"\\"+ FileName);


        // FileInputStream inputS = null;
        // FileOutputStream outputS = null;
        try {
           
            // inputS = new FileInputStream(FI + "//" + FileName);
            if(FO.exists()){
                temp = new File(FO + "//" + FileName.substring(0 , FileName.indexOf(".")) + "-copy" + FileName.substring(FileName.indexOf("."), FileName.length()));
                if(temp.exists()){
                    int i = 2;
                    int c;
                    while(true){
                        temp = new File(FO + "//" + FileName.substring(0, FileName.indexOf(".")) + "- copy("+i+")" + FileName.substring(FileName.indexOf(".") , FileName.length()));
                        if(!temp.exists()){
                            break;
                        }
                        i++;
                    }
                    writefile = new FileWriter(FO+"\\"+FileName.substring(0,FileName.indexOf("."))+" - Copy ("+i+")"+FileName.substring(FileName.indexOf("."),FileName.length()));

                    while((c = readfile.read() )!= -1){
                        writefile.write(c);
                    }
                    System.out.println("Successfully.");
                }else {
                    int a;
						writefile = new FileWriter(FO+"\\"+FileName.substring(0,FileName.indexOf("."))+" - Copy"+FileName.substring(FileName.indexOf("."),FileName.length()));
						while((a=readfile.read())!=-1){
							writefile.write(a);
						}
						System.out.println("Successfully.");
                        
                }
        }else{
            int a;
            writefile = new FileWriter(FO+"\\"+FileName);
            while((a=readfile.read())!=-1){
                writefile.write(a);
            }
            System.out.println("Successfully.");
    } 
  
        } finally {
            if(readfile != null){
                readfile.close();
            }
            if(writefile != null){
                writefile.close();
            }
        }
       

        }
}