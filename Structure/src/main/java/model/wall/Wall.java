package model.wall;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Wall implements Structure {
	
	
	
	private List<Block> blocks;
	

	public Wall() {
		super();
	}

	public Wall(List<Block> blocks) {
		super();
		this.blocks = blocks;
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
