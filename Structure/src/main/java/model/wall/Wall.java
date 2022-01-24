package model.wall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Wall implements Structure {
	//is Git on? is it?
	
	
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
	
	public Optional<Block> findIndivisibleBlockByColor(String color){
		Optional<Block> op=Optional.ofNullable(null);
		
		for(Block b :blocks) {
			
			if(b instanceof CompositeBlock) {
				CompositeBlock bcb=(CompositeBlock) b ;
				op=findIndivisibleBlockByColor(bcb,color);
			}
			else {
				if(b.getColor().matches(color)) {
					return Optional.ofNullable(b);
				}
			}
			
			
			
		}
		
		
		return op;
		
		
		
	}
	
	Optional<Block> findIndivisibleBlockByColor(CompositeBlock branch,String color){
		Optional<Block> op=Optional.ofNullable(null);
		
		for(Block b:branch.getBlocks()) {
			
			if(b instanceof CompositeBlock) {
				CompositeBlock bcb=(CompositeBlock) b ;
				op=findIndivisibleBlockByColor(bcb,color);
			}
			else {
				if(b.getColor().matches(color)) {
					return Optional.ofNullable(b);
				}
			}
			
		}
		
		return op;
		
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
				if (b.getMaterial().matches(material)){
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
				if (b.getMaterial().matches(material)){
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
	
	public int countIndIvisibleBlocks() {
		String regexUniversal=".+";
		List<Block> listOfBlocks =findIndivisibleBlocksByMaterial( regexUniversal);
		
	
		
		return listOfBlocks.size();
		
	}
	
	
	

	@Override
	public String toString() {
		return "Wall [blocks=" + blocks + "]";
	}
	
	


}
