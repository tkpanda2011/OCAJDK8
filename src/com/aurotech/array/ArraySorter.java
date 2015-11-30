package com.aurotech.array;

public class ArraySorter {
	private static int a[][]={
			{72,8,4},
			{36,1,9,3,6},
			{2,5,12},
			{14}
	};
	
	
	public static void main(String args[]){
		ArraySorter arr=new ArraySorter();
		arr.sortThe2DimensionArray(a);
		arr.printArray(a);
		
	}
	public void printArray(int a[][]){
		/**
		 * dis play the sorted array	
		 */
			for(int i=0;i<a.length;i++){
				System.out.print("{");
				for(int j=0;j<a[i].length;j++){
					System.out.print(" "+a[i][j]);
				}
				System.out.print("}\n");
			}
	}
	public void sortThe2DimensionArray(int a[][]){

		
		int col=0;
	for(int i=0;i<a.length;i++){
	for(int j=0; j<a[i].length; j++){
				if(j>0){
					col=j;
				}
				int b=a[i][j];
				int tempa=0;int tempb=0;
				for(int k=i;k<a.length;k++){
				
				for(int l=col;l<a[k].length;l++){
					if(b>a[k][l]){
							tempa=k;tempb=l;
							b=a[k][l];
						}
						}
						col=0;
					
				
				}
				
				if(b!=a[i][j]){
					int temp=a[i][j];
					a[i][j]=a[tempa][tempb];
					a[tempa][tempb]=temp;
				}
			}
		
		}
		
	
	
	}
}
