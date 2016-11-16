package com.eshopproject.models;


import java.util.ArrayList;
import java.util.List;

public class ItemControl {

  public List<Item> itemList;
  public Item items;

  public ItemControl() {
    itemList = new ArrayList<Item>();
  }

  public List<Item> getAllItems() {
    Item item1 = new Item("1", "name1", "des1", "cat1", 20.00);
    Item item2 = new Item("2", "name2", "des2", "cat2", 10.00);
    Item item3 = new Item("3", "name3", "des3", "cat3", 50.50);
    Item item4 = new Item("4", "name4", "des4", "cat4", 70.30);
    Item item5 = new Item("5", "name5", "des5", "cat5", 20.40);
    Item item6 = new Item("6", "name6", "des6", "cat6", 100.60);
    Item item7 = new Item("7", "name7", "des7", "cat7", 40.30);
    Item item8 = new Item("8", "name8", "des8", "cat8", 70.20);
    Item item9 = new Item("9", "name9", "des9", "cat9", 25.00);
    itemList.add(item1);
    itemList.add(item2);
    itemList.add(item3);
    itemList.add(item4);
    itemList.add(item5);
    itemList.add(item6);
    itemList.add(item7);
    itemList.add(item8);
    itemList.add(item9);
    return itemList;
  }

  public void addItem(Item item) {
    itemList.add(item);
  }

  public Item getItemById(String id) {
    getAllItems();
    Item selectedItem = new Item();
    System.out.println(itemList);
    for (Item item : itemList) {

      if (item.getID().equals(id) || item.getID() == id) {
        selectedItem = item;
        return selectedItem;

      } else
        selectedItem = null;
    }
    return selectedItem;

  }

  public void fillList() {
    getAllItems();
  }
}
