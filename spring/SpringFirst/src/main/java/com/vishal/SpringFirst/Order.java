package com.vishal.SpringFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {
private String name;

@Autowired
//@Qualifier("item1")
private Item item;


public Order() {
	// TODO Auto-generated constructor stub
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Item getItem() {
	return item;
}


public void setItem(Item item) {
	this.item = item;
}


@Override
public String toString() {
	return "Order [name=" + name + ", item=" + item + "]";
}

}
