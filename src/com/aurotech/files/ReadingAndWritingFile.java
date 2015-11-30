package com.aurotech.files;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
/**
 * 
 * @author Tripati
 *
 */
public class ReadingAndWritingFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1="BRAJA";
		String s2=s1;
		String s3="TKP";
		String s4=new String("TKP");
		System.out.println(s1.hashCode()+"===>"+s2.hashCode()+"=====>"+s1.equals(s2));
		System.out.println("test"+s1==s2);
		System.out.println("test"+s3==s4);
		
			try {
				
			
			
			File inputFile=new File("C:\\test2\\test\\test.java");
			FileInputStream fileInput=new FileInputStream(inputFile);
			
			DataInputStream dataStream=new DataInputStream(fileInput);
			StringBuilder br=new StringBuilder("");
			
			byte[] b=new byte[100];
			int numRead=0;
		
			
			/*br=new StringBuilder("");
			System.out.println("Data Stream ReadByte"+(char)dataStream.readByte());
			*dataStream.readByte() reads the first char in the file and returns the integer value 
			*/
			while((numRead=dataStream.read(b)) != -1){//instead if dataStream bfr can be used 
				br.append(String.valueOf(new String(b).toCharArray(), 0, numRead));
				System.out.println("NUMBER OF BYTES READ"+numRead); //numRead counts the actual characters read from the source 
				System.out.println(String.valueOf(new String(b).toCharArray(), 0, numRead));
			}
			
			Scanner sc =new Scanner(inputFile);
			int count=0;
			Map<String,Integer> words=new HashMap<String,Integer>();
			while(sc.hasNext()){
				String line=sc.next();
				if(words.containsKey(line)){
					words.put(line, words.get(line)+1);
				}else{
					words.put(line,1);
				}
			}
			Set<Entry<String,Integer>> wordSet=words.entrySet();
			List<Entry<String,Integer>> wordList=new ArrayList<Map.Entry<String,Integer>>(wordSet);
			ReadingAndWritingFile rd=new ReadingAndWritingFile();
			Collections.sort( wordList,new MapSorter());
			for(Map.Entry<String, Integer> entry: wordList ){
				System.out.println(entry.getKey()+"===>"+entry.getValue());
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}
	
	 public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap){
         
		 
		 	
	        Set<Entry<String, Integer>> set = wordMap.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                return (o2.getValue()).compareTo( o1.getValue() );
	            }
	        } );
	        return list;
	    }
	 /*  
	    public static void main(String a[]){
	        MaxDuplicateWordCount mdc = new MaxDuplicateWordCount();
	        Map<String, Integer> wordMap = mdc.getWordCount("C:/MyTestFile.txt");
	        List<Entry<String, Integer>> list = mdc.sortByValue(wordMap);
	        for(Map.Entry<String, Integer> entry:list){
	            System.out.println(entry.getKey()+" ==== "+entry.getValue());
	        }
	    */

	private static class MapSorter  
	implements Comparator<Map.Entry<String, Integer>>{
		public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
        {
            return (o2.getValue()).compareTo( o1.getValue() );
        }
	}
}
