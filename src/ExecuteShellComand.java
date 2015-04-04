import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Component;


/**
 * 
 * @author mkyoung
 *
 */
 
public class ExecuteShellComand {
	
	static String TerminalCommand;
	
	public void setTerminalCommand(String TermCom){this.TerminalCommand = TermCom;}
 
	public ExecuteShellComand() {
		
	}
	
	public void exeShellComand()
	{
	
		StringBuffer output = new StringBuffer();
		String line = "";

		Process p;
		
		try {
			p = Runtime.getRuntime().exec(TerminalCommand);
			p.waitFor();
			
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(p.getInputStream()));

			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		WarningsIntex warIntex = new WarningsIntex();
		warIntex.start();
		warIntex.setInputToConsole(output.toString());
	
		
	}
  
}
