# Structure
 

## Overview

This is my imlpementation of Task from Horus company.

Task is given in form of interfaces one implementation(draft) of a class Wall

This exercice is a good way to practice object oriented programing, desigh concepts, but the most how important is information flow and communication.

The most exiting part of a project is a behavior of a method according to how distinguish Blocks from Composite Blocks.

### Description (Polish)

	Poniżej przekazujemy zadanie z prośbą o analizę poniższego kodu i
	zaimplementowanie metod findBlockByColor, findBlocksByMaterial,
	count w klasie Wall - najchętniej unikając powielania kodu i
	umieszczając całą logikę w klasie Wall. Z uwzględnieniem w analizie i
	implementacji interfejsu CompositeBlock!

	interface Structure {
	zwraca dowolny element o podanym kolorze
	Optional<Block> findBlockByColor(String color);

	zwraca wszystkie elementy z danego materiału
	List<Block> findBlocksByMaterial(String material);

	zwraca liczbę wszystkich elementów tworzących strukturę
	int count();
	}

	public class Wall implements Structure {
	private List<Block> blocks;

	public Wall(CompositeBlock cb) {
	this.blocks=cb.getBlocks();
	}

	interface Block {
	String getColor();
	String getMaterial();
	}

	interface CompositeBlock extends Block {
	List<Block> getBlocks();
	}
  
  # Implementation
  
  I decided to use a Strategy Patern with dependency injection as a way to distinguish bechavior.
  
## Structure first:

* Block interface draft for BlockImpl
* BlockImpl holding values material and color quite straight forward
* Composite interface draft for CompositeBlockImpl
* CompositeBlockImpl to holds blocks in list has to implemets Block methods: getColor() return String of color of all blocks, getMaterial() return String of materials of all blocks; all above even if they are inside another CompositeBlock
* Strcture interface with methods drafts 
* Wall concret implementation of Structure with various method will discuss them later in detail


  
	
  The most exiting part of a project is a behavior of a method according to how distinguish Blocks from Composite Blocks.
  
  

  
