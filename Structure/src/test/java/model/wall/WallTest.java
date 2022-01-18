package model.wall;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WallTest {
	
	Block block1=new BlockImpl("green","wool");
	Block block2=new BlockImpl("black","iron");
	List<Block> listOfBlocks= new ArrayList<Block>();
	
//	Wall wall=new Wall(block1);

	@Test
	public void wallConstructorTest() {
		listOfBlocks.add(block1);
		listOfBlocks.add(block2);
		Wall wall=new Wall(listOfBlocks);
		
		
	}

}
