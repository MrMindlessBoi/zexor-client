package com.jagex.client;

import com.jagex.client.definitions.ItemDefinition;

final class Item extends Renderable {

	@Override
	public final Model getRotatedModel() {
		ItemDefinition itemDef = ItemDefinition.forID(ID);
		return itemDef.method201(anInt1559);
	}

	public Item() {
	}

	public int ID;
	public int x;
	public int y;
	public int anInt1559;
}
