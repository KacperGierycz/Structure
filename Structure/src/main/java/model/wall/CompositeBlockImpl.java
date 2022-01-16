package model.wall;

import java.util.List;

 class CompositeBlockImpl implements CompositeBlock {

	List<Block> blocks;

	public CompositeBlockImpl(List<Block> blocks) {
		this.blocks = blocks;
	}

	public List<Block> getBlocks() {
		
		return this.blocks;
	}

	//returns collor of all blocks
	public String getColor() {
		
		StringBuffer sb=new StringBuffer();
		for(Block b: this.blocks ) {
			sb.append(b.getColor()+", ");			
		}
	
		return sb.toString();
	}

	//returns material of all blocks
	public String getMaterial() {
		StringBuffer sb=new StringBuffer();
		for(Block b: this.blocks ) {
			sb.append(b.getMaterial()+", ");			
		}
	
		return sb.toString();
	}

	@Override
	public String toString() {
		return "CompositeBlockImpl [blocks=" + blocks + ", getColor()=" + getColor() + ", getMaterial()="
				+ getMaterial() + "]";
	}
	
	
	

}
