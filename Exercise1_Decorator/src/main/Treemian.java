package main;

import Tree.*;
import decorations.*;

public class Treemian {

	public static void main(String[] args) {
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		
		printtree(mytree);
	}
	
	public static void printtree(Tree mytree) {
		System.out.printf("%s costs $%.2f",mytree.getDescription(), mytree.cost());
	}

}
