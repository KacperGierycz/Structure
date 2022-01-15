package model.api.structure;

import java.util.List;
import java.util.Optional;



public interface Structure {
	// zwraca dowolny element o podanym kolorze
	Optional<Block> findBlockByColor(String color);

	// zwraca wszystkie elementy z danego materia³u
	List<Block> findBlocksByMaterial(String material);

	//zwraca liczbê wszystkich elementów tworz¹cych strukturê
	int count();
	}
