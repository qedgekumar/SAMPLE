package march27;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		/*ArrayList<String>players =new ArrayList<String>();
		players.add(0, "kumar");
		players.add("pavan");
		System.out.println(players.get(1));
        System.out.println("Before modification:"+players);
		players.set(0, "chiru");
		System.out.println("After modification:"+players);*/
		
	/*	ArrayList<Integer>score=new ArrayList<Integer>();
		score.add(90);
		score.add(44);
		score.add(42);
		System.out.println(score);*/
		
	/*	int num=44;
		Integer numobj=num;//Autoboxing
		System.out.println(numobj);
		
		boolean b=false;
		Boolean bobj=b;
		System.out.println(bobj);
		
		Integer numo=99;
		int num1=numo;
		System.out.println(num1);*/
		
	/*	ArrayList<String>team =new ArrayList<String>();
		team.add("bharat");
		team.add( "pavan");
		team.add(2, "karthick");
		team.add("kalyan");
		team.add("kiran");
		team.add("laxman");
		System.out.println("Before Adding:" +team);
		team.remove(2);
		team.remove(0);
		team.remove("laxman");
		System.out.println("After removeing:" + team);*/
		
		/*ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(99);//autoboxing
		marks.add(78);//autoboxing
		marks.add(9);//autoboxing
		
		marks.add(33);//autoboxing
		marks.add(67);//autoboxing
		System.out.println("Before Removing:" +marks);
		System.out.println("size of arraylist:" +marks.size());
		marks.remove((Integer)9);
		System.out.println("After Removing:"+ marks); */
		
		ArrayList<String>college = new ArrayList<String>();
		college.add("chaitanya");
		college.add("pragati");
		college.add("naryana");
		college.add("vikas");
		college.add("nalndana");
		college.add(5, "gmr");
		//System.out.println("Before clearing:"+ college);
		//college.clear();
		//System.out.println("After clearing:"+college);
		
		for(String each : college)
		{
			System.out.println(each);
		}
		
		
		
		
		
		
		
	}

}
