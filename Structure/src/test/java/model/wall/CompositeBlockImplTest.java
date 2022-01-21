package model.wall;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CompositeBlockImplTest {

	CompositeBlock CompositeBlock1;
	CompositeBlock CompositeBlock2;
	Block block1;
	Block block2;

	
	@Before
	public void fieldInitialization() {
		block1=new BlockImpl("green","wool");
		block2=new BlockImpl("black","iron");
		
		List<Block> listOfCompositeBlocks=new ArrayList<>();
		listOfCompositeBlocks.add(block1);
		listOfCompositeBlocks.add(block2);
		listOfCompositeBlocks.add(block1);
		
		
		CompositeBlock1=new CompositeBlockImpl(listOfCompositeBlocks);	
		CompositeBlock2=new CompositeBlockImpl(listOfCompositeBlocks);;

		
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
