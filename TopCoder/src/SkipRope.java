import java.util.Arrays;

public class SkipRope {
	public static int[] partners(int[] candidates, int height) {
		int[] partners = new int[2];
		int minIndex=0;
		mergeSort(candidates);
		
		for(int i=0;i<candidates.length;i++){
			if(height<=candidates[i]){
				minIndex=i;
				break;
			}
		}
		partners[0]=(height-candidates[minIndex-1]<candidates[minIndex+1]-height)?candidates[minIndex-1]:candidates[minIndex+1];
		partners[1]=candidates[minIndex];
		if(partners[1]<partners[0]){
			int temp=partners[0];
			partners[0]=partners[1];
			partners[1]=temp;
		}
		return partners;
	}
	private static void mergeSort(int[] arr){
		if(arr.length<2){
			return;
			
		}
		int step=1;
		int startL,startR;
		while(step<arr.length){
			startL=0;
			startR=step;
			while(startR+step<=arr.length){
				mergeArray(arr,startL,startL+step,startR,startR+step);
				startL=startR+step;
				startR=startL+step;
				
			}
			if(startR<arr.length){
				mergeArray(arr, startL, startL+step, startR, arr.length);
			}
			step*=2;
		}
	}
	private static void mergeArray(int[] arr, int startL, int stopL, int startR,
			int stopR) {
		int[] right=new int[stopR-startR+1];
		int[] left=new int[stopL-startL+1];
		
		for(int i=0,k=startR;i<(right.length-1);++i,++k){
			right[i]=arr[k];
		}
		for(int i=0,k=startL;i<(left.length-1);++i,++k){
			left[i]=arr[k];
		}
		right[right.length-1] = Integer.MAX_VALUE;
		left[left.length-1] = Integer.MAX_VALUE;
		for(int k=startL,m=0,n=0;k<stopR;++k){
			if(left[m]<=right[n]){
				arr[k]=left[m];
				m++;
			}else{
				arr[k]=right[n];
				n++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] candidates = {
				{ 102, 99, 104 },
				{ 102, 97, 104 },
				{ 101, 100, 99 },
				{ 75, 117, 170, 175, 168, 167, 167, 142, 170, 85, 89, 170 },
				{ 134, 79, 164, 86, 131, 78, 99, 150, 105, 163, 150, 110, 90,
						137, 127, 130, 121, 93, 97, 131, 170, 137, 171, 153,
						137, 138, 92, 103, 149, 110, 156 } };
		int[] height = { 100, 100, 100, 169, 82 };
		for (int i = 0; i < candidates.length; i++) {
			System.out.println(height[i]);
			System.out.println(Arrays.toString(partners(candidates[i],
					height[i])));
		}
	}

}
