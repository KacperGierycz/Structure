package model.wall;

import java.util.ArrayList;
import java.util.List;

public class AppRunnerDefault {

	public static void main(String[] args) {
		
		Block redSteel= new BlockImpl("red", "steel");
		
		System.out.println("runner test getcolor: "+redSteel.getColor());
		System.out.println("runner test getMaterial: "+redSteel.getMaterial());
		
		
		Block blueWood= new BlockImpl("blue", "wood");
		List<Block>listBlocks=new ArrayList<Block>();
		listBlocks.add(redSteel);
		listBlocks.add(blueWood); 
		System.out.println("runner test print list of Blocks: "+listBlocks);
		
		System.out.println();
		System.out.println();
		CompositeBlock compositeBlock = new CompositeBlockImpl(listBlocks);
		
		System.out.println(redSteel instanceof Block);
		System.out.println(compositeBlock instanceof Block);
		
		
		//to string of composite block has some duplications nope but text is long
		System.out.println("runner test CompositeBlock constructor: "+compositeBlock);
		System.out.println();
		
		//Lists are printing , at end
		List<Block>ListOfBlockFromCompositBlock=compositeBlock.getBlocks();
		System.out.println("runner test of compositeBlock.getBlocks: "+ListOfBlockFromCompositBlock);
		System.out.println("runner test of cocompositeBlock.getMaterial: "+compositeBlock.getMaterial());
		System.out.println("runner test of cocompositeBlock.getColor: "+compositeBlock.getColor());
		
		List<Block>listCompositeBlock=new ArrayList<Block>();
		listCompositeBlock.add(compositeBlock);
		listCompositeBlock.add(blueWood);
		listCompositeBlock.add(compositeBlock);
	//	lcb.add(b);
		
		Wall wall=new Wall(listBlocks);
		Wall wallOfCompositeBlocks=new Wall(listCompositeBlock);
		
		System.out.println(wall);
		System.out.println(wallOfCompositeBlocks);
		System.out.println();
		System.out.println("runner test of wall of block find color blue : " + wall.findBlockByColor("blue"));
		System.out.println("runner test of wall of block find color black : " + wall.findBlockByColor("black"));
		System.out.println("runner test of Composite wall of block find color blue : " + wallOfCompositeBlocks.findBlockByColor("blue"));
		System.out.println("runner test of Coposite wall of block find color black : " + wallOfCompositeBlocks.findBlockByColor("black"));
		System.out.println();
		
		System.out.println("runner test of wall of block find material steel: " + wall.findBlocksByMaterial("steel"));
		System.out.println("runner test of wall of CompositeBlock find material clay: " + wallOfCompositeBlocks.findBlocksByMaterial("clay"));
		System.out.println("runner test of wall of CompositeBlock find material wood: "+ wallOfCompositeBlocks.findBlocksByMaterial("wood"));
		
		System.out.println();
		
		System.out.println("runner test of wall count: " + wall.count() );
		System.out.println("runner test of Compositewall count: " + wallOfCompositeBlocks.count() );
		
		System.out.println();
		Wall wallEmpty=new Wall(null);
		
		System.out.println("runner test empty wall : "+wallEmpty);
		System.out.println("runner test count on empty wall : "+wallEmpty.count());
		System.out.println("runner test find color on wall : "+wallEmpty.findBlockByColor("blue"));
		System.out.println("runner test find color empty wall : "+wallEmpty.findBlocksByMaterial("steel"));

	}
}
































