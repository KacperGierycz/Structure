package model.wall;

import java.util.ArrayList;
import java.util.List;

public class AppRunnerDefault {

	public static void main(String[] args) {
		
		Block b= new BlockImpl("red", "steel");
		System.out.println("runner test getcolor: "+b.getColor());
		System.out.println("runner test getMaterial: "+b.getMaterial());
		
		Block b2= new BlockImpl("blue", "wood");
		List<Block>lb=new ArrayList<Block>();
		lb.add(b);
		lb.add(b2); 
		System.out.println("runner test print list of Blocks: "+lb);
		
		System.out.println();
		System.out.println();
		CompositeBlock cb2 = new CompositeBlockImpl(lb);
		
		//to string of composite block has some duplications
		System.out.println("runner test CompositeBlock constructor: "+cb2);
		System.out.println();
		
		//Lists are printing , at end
		List<Block>ListOfBlockFromCompositBlock=cb2.getBlocks();
		System.out.println("runner test of compositeBlock.getBlocks: "+ListOfBlockFromCompositBlock);
		System.out.println("runner test of cocompositeBlock.getMaterial: "+cb2.getMaterial());
		System.out.println("runner test of cocompositeBlock.getColor: "+cb2.getColor());
		
		

	}
}
