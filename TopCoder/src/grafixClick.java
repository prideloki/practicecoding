import java.util.ArrayList;

public class grafixClick {

	public int[] checkSaveButton(int[] mouseRows, int[] mouseCols) {
		ArrayList<Integer> positionHit=new ArrayList<Integer>();
		for(int i=0;i<mouseRows.length;i++){
			if(mouseRows[i]>=20&&mouseRows[i]<40){
				if(mouseCols[i]>=50&&mouseCols[i]<100)positionHit.add(i);
			}
		}
		int[] result=new int[positionHit.size()];
		for(int i=0;i<result.length;i++){
			result[i]=positionHit.get(i);
		}
		return result;
	}

}
