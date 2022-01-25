package model.wall;

import java.util.ArrayList;
import java.util.List;

public class GraphTester {

	public static void main(String[] args) {
//
		Block redSteel= new BlockImpl("red", "steel");		
		Block blueWood= new BlockImpl("blue", "wood");
		Block whiteCloud= new BlockImpl("white", "cloud");
//		Block graphBlock= new CompositeBlockImpl();

		// List for Graph Craeation
		List<Block>listForGraph=new ArrayList<Block>();
		listForGraph.add(redSteel);

		
//		listBlocks.add(redSteel);
//		listBlocks.add(blueWood); 
		//first branch
		List<Block>listBlocks2=new ArrayList<Block>();
		listBlocks2.add(redSteel);
		listBlocks2.add(blueWood);
		
	
		Block firstBranch=new CompositeBlockImpl(listBlocks2);
		//add first branc to the listForGraph
		listForGraph.add(firstBranch);
		//add block rs to listforGraph
		listForGraph.add(redSteel);
		//create composite block with whitecloud
		List<Block>listBlocks3=new ArrayList<Block>();
		listBlocks3.add(whiteCloud);
		//add whitecloud to listForGraph
		Block whiteCloudComposite =new CompositeBlockImpl(listBlocks3);
		listForGraph.add(whiteCloudComposite);
		//final graph creatino from listForGraph
		Block graph=new CompositeBlockImpl(listForGraph);
		
		Wall graphWall=new Wall(listForGraph);
		//type "" if looking for nothing
		//type wood one in graph
		//type steel 3 in graph
		//type cloud one in graph
	List<Block>blocksWithMaterial=	graphWall.findIndivisibleBlocksByMaterial("wood");
		System.out.println(blocksWithMaterial);
		
		System.out.println(graphWall.countIndIvisibleBlocks());
		//type "" if looking for nothing
		//white one
		// red 3
		// blue 1
		// white 1
		//returns only one:))
		System.out.println(graphWall.findIndivisibleBlockByColor("red"));

	}

}
