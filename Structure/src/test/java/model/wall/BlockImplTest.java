package model.wall;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BlockImplTest {

	Block block1=new BlockImpl("green","wool");
	Block block2=new BlockImpl("black","iron");

	
	@Before
	public void fieldInitialization() {
		block1=new BlockImpl("green","wool");
		block2=new BlockImpl("black","iron");

		
		
	}
	
	@Test
	public void Block1GetColorTest() {
		assertEquals("green",block1.getColor());
		
	}
	
	@Test
	public void Block2GetColorTest() {
		assertEquals("black",block2.getColor());
	}
	
	
	@Test
	public void Block1GetMaterialTesy() {
		assertEquals("wool", block1.getMaterial());
	}
	
	@Test
	public void Block2GetMaterialTesy() {
		assertEquals("iron", block2.getMaterial());
	}
	
	
	

}
