package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.example.demo.model.Lego;

public class LegoStub {
	private static Map<Long, Lego> sets = new HashMap<Long, Lego>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		Lego a = new Lego(1L, 10262L, "James Bond™ Aston Martin DB5", "Get a license to build with the awesome LEGO® Creator Expert 10262 James Bond™ Aston Martin DB5", 1295L, 2018);
		sets.put(1L, a);
		Lego b = new Lego(2L, 41615L, "Harry Potter™ & Hedwig™", "This LEGO® BrickHeadz™ 41615 Harry Potter™ & Hedwig™ play set is fun to build using colorful LEGO bricks that recreate all their iconic details, including the young wizard’s signature round spectacles, lightning scar, Gryffindor™ scarf and black cape with the Gryffindor emblem. ", 180L, 2018);
		sets.put(2L, b);
		Lego c = new Lego(3L, 41622L, "Peter Venkman™ & Slimer™", "These LEGO® BrickHeadz™ 41622 Peter Venkman™ & Slimer™ construction characters are fun to build using colorful LEGO bricks that recreate all of their iconic details, including Venkman’s slime-covered uniform and detachable proton pack, plus Slimer’s big green grin and two hot dogs.", 50L, 2018);
		sets.put(3L, c);
	}

	public static List<Lego> list() {
		return new ArrayList<Lego>(sets.values());
	}

	public static Lego create(Lego set) {
		idIndex += idIndex;
		set.setId(idIndex);
		sets.put(idIndex, set);
		return set;
	}

	public static Lego get(Long id) {
		return sets.get(id);
	}

	public static Lego update(Long id, Lego set) {
		sets.put(id, set);
		return set;
	}

	public static Lego delete(Long id) {
		return sets.remove(id);
	}
}
