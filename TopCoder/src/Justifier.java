import java.util.Arrays;
//srm 164 div2 250pts

public class Justifier {
	public static String[] justify(String[] textIn){
		int maxLength=0;
		String[] justified=new String[textIn.length];
		for(int i=0;i<textIn.length;i++){
			int length=textIn[i].length();
			if(length>=maxLength)maxLength=length;
			justified[i]="";
		}
		for(int i=0;i<textIn.length;i++){
			while(justified[i].length()+textIn[i].length()!=maxLength){
				justified[i]+=" ";
			}
			justified[i]+=textIn[i];
			
		}
		
		return justified;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] textIn={{"BOB","TOMMY","JIM"},{"JOHN","JAKE","ALAN","BLUE"},{"LONGEST","A","LONGER","SHORT"}};
		for(int i=0;i<textIn.length;i++){
			System.out.println(Arrays.toString(justify(textIn[i])));
			
		}
	}

}
