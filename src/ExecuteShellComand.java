import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Component;


/**
 * 
 * @author mz
 *
 */
 
public class ExecuteShellComand {
	
	static String TerminalCommand;
	static String [] TerminalCommandArray ;
	
	public void setTerminalCommand(String TermCom){this.TerminalCommand = TermCom;}
	public void setTerminalCommandArray(String [] TermCom){this.TerminalCommandArray = TermCom;}
 
	public ExecuteShellComand() {}
	
	public void runExeShellComan()
	{
		ExecuteShellComand obj = new ExecuteShellComand();
		 
		String output = obj.exeShellComand();
 
		System.out.println(output);
	}
	
	public void runExeShellComanProcBuild()
	{
		ExecuteShellComand obj = new ExecuteShellComand();
		 
		String output = obj.exeShellComandProcBuild();
 
		System.out.println(output);
	}
	
	private String exeShellComand()
	{
	
		System.out.println(TerminalCommand);
		
		StringBuffer output = new StringBuffer();
		 
		Process p;
		try {
			p = Runtime.getRuntime().exec(TerminalCommand);
			//p = new ProcessBuilder(TerminalCommand).start();
			p.waitFor();
			BufferedReader reader = 
                            new BufferedReader(new InputStreamReader(p.getInputStream()));
 
                        String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}
			
			p.destroy();
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return output.toString();
		
	}
  
	private String exeShellComandProcBuild()
	{
	
		System.out.println(TerminalCommandArray);
		
		StringBuffer output = new StringBuffer();
		 
		Process p;
		try {
			
			p = new ProcessBuilder(TerminalCommandArray).start();
			p.waitFor();
			BufferedReader reader = 
                            new BufferedReader(new InputStreamReader(p.getInputStream()));
 
                        String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}
			
			p.destroy();
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
 
		return output.toString();
	}

}
