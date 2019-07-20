package com.example.food;

import java.io.Serializable;

public class Contacts  implements Serializable {
 String name , cost;
 int img;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getCost() {
  return cost;
 }

 public void setCost(String cost) {
  this.cost = cost;
 }

 public int getImg() {
  return img;
 }

 public void setImg(int img) {
  this.img = img;
 }

 public Contacts(String name, String cost, int img) {
  this.name = name;
  this.cost = cost;
  this.img = img;
 }
}
