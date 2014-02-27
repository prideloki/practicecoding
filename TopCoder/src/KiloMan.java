
public class KiloMan {
	public static int hitsTaken(int[] pattern,String jumps){
		int hits=0;
		
		for(int i=0;i<pattern.length;i++){
			int height=pattern[i];
			switch ((jumps.charAt(i))) {
			case 'J':
				if(height>2){
					hits++;
				}
				break;
			case 'S':
				if(height==1||height==2)hits++;
				
				break;
			default:
				break;
			}
		}
		
		return hits;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pattern={{1,3,2,3,3,1,2,2,1},{1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,
			 4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,7},{1,2,2,1},{1}};
		String[] jumps={"JJSSSJSSJ","SSSSSSSSSSSSSSJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ","SJJS","J"};
		for(int i=0;i<pattern.length;i++){
			System.out.println(hitsTaken(pattern[i], jumps[i]));
		}
	}

}
