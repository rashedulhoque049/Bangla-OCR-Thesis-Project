/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd_prompt;

/**
 *
 * @author WorkSpace
 */


import java.io.PrintWriter;

public class Cmd_prompt {
	public static void main(String[] args) {
		String[] command =
	    {
	        "cmd",
	    };
	    Process p;
		try {
			p = Runtime.getRuntime().exec(command);
		
	    new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
	    new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
	    PrintWriter stdin = new PrintWriter(p.getOutputStream());
	    stdin.println("cd C:\\Program Files (x86)\\Tesseract-OCR");
                      stdin.println("\"tesseract.exe\" \"F:\\Result\\test1.jpg\" - > \"F:\\Result\\output.txt\" -l ben -psm 1");
	    
	       
	    stdin.close();
	     p.waitFor();
	     
		} catch (Exception e) {
	 		e.printStackTrace();
		}
	}
	
	 
	
}	
