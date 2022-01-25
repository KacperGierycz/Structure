# Structure
Job Task for Horus 

## Overview

This is my imlpementation of Task from Horus company.

Task is given in form of interfaces of a classes and one implementation(draft) of a class Wall

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
  
  Structure first:
  Block holding values matirial and color
  Composite block wich holds blocks in list
  Strcture with methods drafts 
  Wall concret implementation of Structure
  
  This exercice is a good way to practice object oriented programing, desigh concepts, but the most how important is information flow and communication.
	
  The most exiting part of a project is a behavior of a method according to how distinguish Blocks from Composite Blocks.
  

  
