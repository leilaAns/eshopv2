package com.eshopproject.models;

public class Item {

  private String ID;
  private String name;
  private String des;
  private String category;
  private double price;


  public Item(String iD, String name, String des, String category, double price) {
    ID = iD;
    this.name = name;
    this.des = des;
    this.category = category;
    this.price = price;
  }



  public Item() {

  }



  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  @Override
  public String toString() {
    return "Item [ID=" + ID + ", name=" + name + ", des=" + des + ", category=" + category
        + ", price=" + price + "]";
  }



}
