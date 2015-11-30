package com.aurotech.array;

public class FindArrayElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[][]={
				{10,2,19,14},
				{12,7,1,15},
				{18,2},
				{24,2,1}
		};
		int b[][]={
				{2,19,53,21,2},
				{11,98,1,24},
				{15},
				{21,19,29,31}
		};
		ArraySorter arr=new ArraySorter();
		arr.sortThe2DimensionArray(a);
		arr.printArray(a);
		arr.sortThe2DimensionArray(b);
		arr.printArray(b);
		
		for(int i=0;i<a.length;i++){
				for(int j=0;i<a[i].length;j++){
					for(int k=0;k<b.length;k++){
						for(int l=0;l<b[k].length;l++){
							if(a[i][j]==b[k][l]){
								System.out.println("Element"+a[i][j]+"Found at"+k+" row and "+l+"Column");
							}
						}
					}
				}
		}
	}

}
