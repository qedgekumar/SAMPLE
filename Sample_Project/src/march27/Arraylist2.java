package march27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args) {
		/*ArrayList<Integer>points = new ArrayList<Integer>();
		points.add(88);
		points.add(66);
		points.add(33);
		points.add(44);
		
		System.out.println(points);
		
		ArrayList<Integer>marks =new ArrayList<Integer>();
		marks.add(99);
		marks.add(55);
		marks.add(22);
		marks.add(11);
		
		System.out.println(marks);
		points.addAll(marks);
		System.out.println("points after concatenation of marks:"+ points);*/
		
	/*	ArrayList<Integer>score =new ArrayList<Integer>();
		score.add(66);
		score.add(1, 99);
		score.add(88);
		score.add(22);
		score.add(33);
		score.add(77);
		System.out.println("Before slicing:"+score);
		
		List<Integer>subscore=score.subList(2, 4);
		System.out.println("after slicing:"+subscore);*/
		
		/*String[] strarr= {"pavan","kumar","chinnam","krishna","kanth"};
		System.out.println(strarr);
		
		ArrayList<String>names=new ArrayList<String>(Arrays.asList(strarr));
		System.out.println(names);*/
		
		ArrayList<String>arraylist=new ArrayList<String>();
		arraylist.add("mango");
		arraylist.add("apple");
		arraylist.add("guava");
		arraylist.add("kismiss");
		arraylist.add("banana");
		System.out.println(arraylist);
		String[] array =new String[arraylist.size()];
		arraylist.toArray(array);
		System.out.println(Arrays.toString(array));
		
		
		
		

	}

}
