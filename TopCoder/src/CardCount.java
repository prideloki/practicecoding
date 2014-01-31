
public class CardCount {
	public static String[] dealHands(int numPlayers,String deck){
		String[]deal=new String[numPlayers];
		int round=deck.length()/numPlayers;
		for(int i=0;i<numPlayers;i++)deal[i]="";
		for(int i=0;i<round*numPlayers;i++){
			int pos=i%numPlayers;
			deal[pos]+=deck.substring(i,i+1);
			
		}
		
		return deal;
	}
	
	public static void main(String[] args) {
		int[] numPlayers={6,4,1,6,2};
		String[]deck={"012345012345012345","111122223333","012345012345012345","01234",""};
		for(int i=0;i<deck.length;i++){
			String[]test=dealHands(numPlayers[i], deck[i]);
			for(int j=0;j<test.length;j++){
				System.out.print(test[j].toString()+" ");
			}
			System.out.println();
		}
	}

}
