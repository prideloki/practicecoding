public class BoxLoader {

	public int mostItems(int boxX, int boxY, int boxZ, int itemX, int itemY, int itemZ) {
		int[] item={itemX,itemY,itemZ};
		int[] oriented=new int[6];
		if(itemZ>boxZ||itemY>boxY||itemZ>boxZ)return 0;
		oriented[0]=(boxX/item[0])*(boxY/item[1])*(boxZ/item[2]);
		oriented[1]=(boxX/item[0])*(boxY/item[2])*(boxZ/item[1]);
		oriented[2]=(boxX/item[1])*(boxY/item[0])*(boxZ/item[2]);
		oriented[3]=(boxX/item[1])*(boxY/item[2])*(boxZ/item[0]);
		oriented[4]=(boxX/item[2])*(boxY/item[1])*(boxZ/item[0]);
		oriented[5]=(boxX/item[2])*(boxY/item[0])*(boxZ/item[1]);
		int numOfItem=0;
		for(int i=0;i<oriented.length;i++){
			if(numOfItem<oriented[i])numOfItem=oriented[i];
		}
		return numOfItem;
	}

}
