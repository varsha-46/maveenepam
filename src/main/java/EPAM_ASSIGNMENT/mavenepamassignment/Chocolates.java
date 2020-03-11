package EPAM_ASSIGNMENT.mavenepamassignment;

import java.util.*;

public class Chocolates extends newyeargift {
	static ArrayList<Integer>wt=new ArrayList<Integer>();
	static Map<Integer,String>ct=new HashMap<Integer,String>();
	//ArrayList<Integer>c=new ArrayList<Integer>();
	Chocolates(){
		
	}
	Chocolates(int weight,int cost,String s){
		wt.add(weight);
		ct.put(cost,s);
	}
	public static void totalweight() {
		int s=0;
		for(int i=0;i<wt.size();i++) {
			s+=wt.get(i);
		}
		System.out.println(s);
	}
	static TreeMap<Integer,String> t = new TreeMap<Integer, String>();
	public static void sort() {
        t.putAll(ct);
        for(Map.Entry<Integer, String> entry :  t.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}
	public static void range(int low,int high) {
		for(Map.Entry<Integer,String> entry : t.entrySet()) {
			  int key = entry.getKey();
			  String value = entry.getValue();
			  if(key>=low&&key<=high)
				  System.out.println(value);
			}
	}
}
