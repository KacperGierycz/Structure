package model.wall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Wall implements Structure {
	
	
	
	private List<Block> blocks;
	

	public Wall() {
		super();
		this.blocks=Collections.emptyList();
	}

	public Wall(List<Block> blocks) {
		super();
		if(blocks==null) {
			this.blocks=Collections.emptyList();
		}
		else {
		this.blocks = blocks;
		}
	}
	

	// orElse orElseGet orElseThrow message to implement 
	public Optional<Block> findBlockByColor(String color) {
		Optional<Block>blockByColorOptionalONullableFindAny=Optional.ofNullable(blocks.stream()
				.filter(block->block.getColor().contains(color))
				.findAny()).get()
		;
		
		return blockByColorOptionalONullableFindAny;
	}

	
	public List<Block> findBlocksByMaterial(String material) {
		List<Block>listOfBlockFilterByMaterial=blocks.stream()
				.filter(block -> block.getMaterial().contains(material))
				.collect(Collectors.toList());
		return listOfBlockFilterByMaterial;
	}
	
	public List<Block> findIndivisibleBlocksByMaterial(String material){
		
		List<Block> ans=new ArrayList<>();
		
		for(Block b : blocks) {
			if(b instanceof CompositeBlock) {
				CompositeBlock bcb=(CompositeBlock) b ;
				findIndivisibleBlocksByMaterial( material, bcb, ans);
			}
			else {
				if (b.getMaterial().equals(material)){
					ans.add(b);
				}
			}
		}
		
		
		return ans;
		
	}
	
	public List<Block> findIndivisibleBlocksByMaterial(String material, CompositeBlock branch,List<Block> ans){
		
		List<Block> blocksFromBranch = branch.getBlocks();
		
		for(Block b : branch.getBlocks()) {
			if(b instanceof CompositeBlock) {
			
			CompositeBlock bcb=(CompositeBlock) b ;
				findIndivisibleBlocksByMaterial( material, bcb, ans);
				
			}
			else {
				if (b.getMaterial().equals(material)){
					ans.add(b);
				}
			
				
			}
		}
		
		
		return ans;
	}

	public int count() {
		long countBlocks=blocks.stream()
				.count();
		return (int) countBlocks;
	}

	@Override
	public String toString() {
		return "Wall [blocks=" + blocks + "]";
	}
	
	


}
