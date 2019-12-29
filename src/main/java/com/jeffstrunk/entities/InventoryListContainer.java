package com.jeffstrunk.entities;

import java.util.ArrayList;
import java.util.List;


public class InventoryListContainer {
	
	public static class InventoryList {
		
		private static ArrayList<InventoryItem> inventoryList = new ArrayList<InventoryItem>();
		
		private InventoryList() {
		}

		public static ArrayList<InventoryItem> getInventoryList() {
			return inventoryList;
		}
		
		public static void addToInventoryList(InventoryItem item) {
			inventoryList.add(item);
		}
		
		public static void removeFromInventoryList(int key) {
			inventoryList.remove(key);
		}
	}
}