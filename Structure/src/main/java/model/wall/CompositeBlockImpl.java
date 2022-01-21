package model.wall;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

 class CompositeBlockImpl implements CompositeBlock {

	 
	private List<Block> blocks;
	

	public CompositeBlockImpl() {
		super();
		this.blocks=Collections.emptyList();
	}

	public CompositeBlockImpl(List<Block> blocks) {
		
		if(blocks==null) {
			this.blocks=Collections.emptyList();
		}
		else {
		this.blocks = blocks;
		}
	}

	
	public List<Block> getBlocks() {
		
		return this.blocks;
	}

	//returns color of all blocks
	public String getColor() {
		
		String colors=blocks.stream()
				.map(Block::getColor)
				.reduce((color1, color2)->color1+", "+color2).get();
		
		return colors;
		
//		StringBuffer sb=new StringBuffer();
//		for(Block b: this.blocks ) {
//			sb.append(b.getColor()+", ");			
//		}
//	
//		return sb.toString();
	}

	//returns material of all blocks
	public String getMaterial() {
		
		String materials=blocks.stream()
		.map(Block::getMaterial)
		.reduce((material1, material2)->material1+", "+material2).get();
		
		return materials;
		
//		StringBuffer sb=new StringBuffer();
//		for(Block b: this.blocks ) {
//			sb.append(b.getMaterial()+", ");			
//		}
//	
//		return sb.toString();
	}

	@Override
	public String toString() {
		return "CompositeBlockImpl [blocks=" + blocks + ", getColor()=" + getColor() + ", getMaterial()="
				+ getMaterial() + "]";
	}
	
	
	

}
