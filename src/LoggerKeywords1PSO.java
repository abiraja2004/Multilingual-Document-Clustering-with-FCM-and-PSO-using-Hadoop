import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerKeywords1PSO {
	
	
	public LoggerKeywords1PSO(){
	
    try{
        BufferedReader  bf  = new BufferedReader(new FileReader("/home/deepa/workspace/NewsCluster/clusteredValuesPSO"));
   	 
   	 if(bf.readLine() != null){
   		 PrintWriter writer1 = new PrintWriter("/home/deepa/workspace/NewsCluster/clusteredValuesPSO");
   		 writer1.print("");
   		 writer1.close();
   	 }else{
   		 bf = null;
   	 } ;
        }catch(Exception e){
      	  e.printStackTrace();
        }
	
	
	
	}
	
	
    public static void log(String message) { 
      PrintWriter out = null;
      
 
      
      
      
      try {
    	  
    	
    	 
		out = new PrintWriter(new FileWriter("/home/deepa/workspace/NewsCluster/clusteredValuesPSO", true), true);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      out.write(message);
      out.close();
    }
}