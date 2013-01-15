import java.io.*;
public class io {
    public static int countLines(String filename){
  	
		try{
			BufferedReader in = null;
		
			try{
				in = new BufferedReader(new FileReader(filename));
				
				String zeile = "";
				int i=0;
				while(zeile!=null){
					zeile=in.readLine();
					i++;
				}
				return i-1;
				
			}
			finally{
				if (in!=null) in.close();
			}
		}	
		
		catch(IOException ex){
			System.err.println("I/O Error: " + ex.getMessage());
			return -1;
		}
		
	}
	
	public static boolean reverseFile(String inFilename, String outFilename){
		try{
			BufferedReader in = null;
			BufferedWriter out = null;
			
			try{
				in = new BufferedReader(new FileReader (inFilename));
				out= new BufferedWriter(new FileWriter (outFilename));
			
				int lineNumber = countLines(inFilename);
				
				if (lineNumber>1){
					String[] fileContent = new String[lineNumber];
					for(int i=lineNumber-1;i>=0;i--){              //Array mit Zeilen der Eingabedatei in umgekehrter Reihenfolge
						fileContent[i]=in.readLine();
					}
					for(int i=0; i<fileContent.length; i++){
						out.write(fileContent[i]+"\r\n");
					}
				}	
					
				return true;
			}
			finally{
				if(in!=null)  in.close();
				if(out!=null) out.close();
			}
		}
		catch (IOException ex){
			System.err.println("I/O Error: " + ex.getMessage());
			return false;
		}
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseFile("C:/Users/Fabian/Desktop/Informatik/PK/Test.txt", "C:/Users/Fabian/Desktop/Informatik/PK/TestOutput.txt"));
	}

}
