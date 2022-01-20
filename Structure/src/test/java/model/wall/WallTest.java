package model.wall;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class WallTest {
	
	Block block1=new BlockImpl("green","wool");
	Block block2=new BlockImpl("black","iron");
	List<Block> listOfBlocks= new ArrayList<Block>();
	
	@Before
	public void fieldInitialization() {
		listOfBlocks.add(block1);
		listOfBlocks.add(block2);
		Wall wall=new Wall(listOfBlocks);
		
		
	}
	
//	Wall wall=new Wall(block1);

	@Test
	public void wallConstructorTest() {

		
		
	}

}
