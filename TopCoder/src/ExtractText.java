import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExtractText {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(
				new FileReader(
						"C:\\Users\\Administrator.KKDV2-20110813F\\Desktop\\testtt.txt"));
		String line=null;
		boolean mark=false;
		while((line=reader.readLine())!=null){
			if(line.contains("Week 8"))mark=true;
			if(mark&&line.contains("class=\"lecture-link\">")){
				line=reader.readLine();
				System.out.println("Watch "+line.substring(0,line.indexOf("<")));
			}
			
			
		}
		reader.close();
	}

}
