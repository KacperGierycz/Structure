package model.impl.wall;

import model.api.structure.Block;

public class BlockImpl implements Block {
	
	
	private String color;
	private String material;


	public BlockImpl(String color, String material) {
		this.color = color;
		this.material = material;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		
		return this.color;
	}

	public String getMaterial() {
		
		return this.material;
	}
	
	@Override
	public String toString() {
		return "BlockImpl [color=" + color + ", material=" + material + "]";
	}

}
