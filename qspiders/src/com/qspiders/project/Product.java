package com.qspiders.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 class Product {
    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for the attributes
    // ...

    public double getTotalPrice() {
        return this.price * this.quantity;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

 class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<Product>();
    }

    public void addItem(Product item) {
        this.items.add(item);
    }

    public void removeItem(Product item) {
        this.items.remove(item);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product item : this.items) {
            total += item.getTotalPrice();
        }
        return total;
    }

	public List<Product> getItems() {
		// TODO Auto-generated method stub
		return items;
	}
}

 class User {
    private String username;
    private String password;
    private String email;
    private String address;

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(String username, String password, String email, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    // Getters and setters for the attributes
    // ...
}

 class Order {
    private Date orderDate;
    private String orderStatus;
    private List<Product> items;

    public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
		this.items = items;
	}

	public Order(Date orderDate, String orderStatus, List<Product> items) {
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.items = items;
    }

    // Getters and setters for the attributes
    // ...

    public double getTotalPrice() {
        double total = 0.0;
        for (Product item : this.items) {
            total += item.getTotalPrice();
        }
        return total;
    }
}

 class Payment {
    private Date paymentDate;
    private String paymentMethod;
    private double amountPaid;
	public Payment(Date paymentDate, String paymentMethod, double amountPaid) {
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }

    // Getters and setters for the attributes
    // ...

    public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}


}

