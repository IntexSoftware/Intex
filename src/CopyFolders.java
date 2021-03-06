
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
/**
 * 
 * @author http://www.mkyong.com/java/how-to-copy-directory-in-java/
 *
 */

public class CopyFolders
{
	
	String source = "/opt/ddtfoam/case";
	//String source = "C:\\Users\\Dell\\Desktop\\Projects\\INTEX\\temp1";
	//String dest = "C:\\Users\\Dell\\Desktop\\Projects\\INTEX\\temp2";
	
	public CopyFolders(String dest) //String source, String dest
    {
		
    	File srcFolder = new File(source);
    	File destFolder = new File(dest);
 
    	//make sure source exists
    	if(!srcFolder.exists()){
 
    		WarningsIntex warIntex = new WarningsIntex();
			warIntex.start();
			warIntex.setInputToConsole("Brak folderu /opt/ddtfoam/initCase");
    		
			//System.out.println("Directory does not exist.");
 
        }else{
 
           try{
        	copyFolder(srcFolder,destFolder);
           }catch(IOException e){
        	e.printStackTrace();
        	//error, just exit
                System.exit(0);
           }
        }
 
    	System.out.println("Done");
    }
 
    public static void copyFolder(File src, File dest)
    	throws IOException{
 
    	if(src.isDirectory()){
 
    		//if directory not exists, create it
    		if(!dest.exists()){
    		   dest.mkdir();
    		   System.out.println("Directory copied from " 
                              + src + "  to " + dest);
    		}
 
    		//list all the directory contents
    		String files[] = src.list();
 
    		for (String file : files) {
    		   //construct the src and dest file structure
    		   File srcFile = new File(src, file);
    		   File destFile = new File(dest, file);
    		   //recursive copy
    		   copyFolder(srcFile,destFile);
    		}
 
    	}else{
    		//if file, then copy it
    		//Use bytes stream to support all file types
    		InputStream in = new FileInputStream(src);
    	        OutputStream out = new FileOutputStream(dest); 
 
    	        byte[] buffer = new byte[1024];
 
    	        int length;
    	        //copy the file content in bytes 
    	        while ((length = in.read(buffer)) > 0){
    	    	   out.write(buffer, 0, length);
    	        }
 
    	        in.close();
    	        out.close();
    	        System.out.println("File copied from " + src + " to " + dest);
    	}
    }
}