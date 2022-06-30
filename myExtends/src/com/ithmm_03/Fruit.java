package com.ithmm_03;

public class Fruit {
   private int weight;
   private String color;
   private int price;




   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }
   public void show(){
      System.out.println("颜色："+color + "zhongliang :"+weight+"jiage :"+price);
   }
}
