package EPAM_ASSIGNMENT.mavenepamassignment;
import java.util.*;
public class newyeargift {
	
	public static void main(String[] args) {
		Chocolates c1=new Chocolates(23,50,"perk");
		Chocolates c2=new Chocolates(24,60,"kitkat");
		Chocolates c3=new Chocolates(30,20,"munch");
		Chocolates c4=new Chocolates(15,10,"barone");
		Chocolates c=new Chocolates();
		c.totalweight();
		c.sort();
		c.range(20,60);
	}

}
