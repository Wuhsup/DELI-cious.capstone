# **KrustySubz - Sandwich Operation System**

Welcome to the **KrustySubz** project! This is a sandwich ordering system where customers can customize their sandwiches, choose their bread, toppings, and sauces, and view the final price. The program also generates a receipt after the order is placed and writes it to a text file.

## **Table of Contents**

- Introduction
- Features
- How to Run
- Classes Overview
- Key Concepts
- Receipt Generation
- Project Structure 

## **Introduction**

KrustySubz is a program designed to allow users to customize their sandwiches. Users can select the bread type, size, toppings, sauces, and whether they want extra meat or toasted bread. Based on their choices, the program calculates the total price and generates a receipt.

This project is designed for beginners (newbies to java) to understand object-oriented programming (OOP) concepts like inheritance, polymorphism, and encapsulation in Java.

### Features

- Select bread type and size (small, medium, large).

- Choose from a variety of meats, cheeses, and veggie toppings.
- Add sauces and extra meat.
- Automatically calculate the price based on selections.
- Option to toast the sandwich.
- Receipt generation with the order details and final price.
- Receipt saved to a text file.

### How to Run

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Open a terminal and compile the project using the following command:
ENTER SCREENSHOT
4. Run the program:
ENTER SCREENSHOT
5. Follow the prompts to build your sandwich and place an order.

### Classes Overview

I. Item (Abstract Class)
This is the base class for all products (sandwiches, chips, drinks, etc.) in the system. It holds common attributes like the name and price for all items.

II. Sandwich (Subclass of Item)
The main class that handles all sandwich-related logic. It includes:
-  Bread size and type
- Toppings (meats, cheeses, and veggies)
- Sauce types
- Extra meat and toasted bread options
- Price calculations based on choices

III. Chips Class
Represents chips, which can be added to the order. Each type of chip has a fixed price.

IV. Drink Class
Represents drinks, where the user can choose between different sizes. Each size has a fixed price.

V. Topping Class
An enum that represents different types of sandwich toppings (e.g., meats, cheeses, veggies).

VI. SauceType Class
An enum that represents the different sauces that can be added to the sandwich.

VII. BreadSize and BreadType Classes
Enums that represent the different sizes and types of bread available for the sandwich.

VIII. Receipt (Future Class)
This will be the class responsible for printing out the receipt after the order is complete and writing it to a file.

### Key Concepts

I. Inheritance: The Sandwich class inherits from the Item class, making use of polymorphism to define common attributes like name and price for different items.

II. Encapsulation: Methods like getters and setters ensure that data is properly accessed and modified in a controlled way.

III. Polymorphism: Overriding methods like getExtraPrice() in the Sandwich class allows for specific pricing logic based on user selections.

### Receipt 

After placing an order, the user can view a receipt containing the following:

- Date and time of the order
- The items ordered (bread, size, toppings, sauces)
- The total price
- The receipt is generated using a BufferedWriter and saved to a file at a specified path. The file will be created if it doesn't exist, or updated if it does.

Example receipt:
------------------------------
ENTER RECEIPT SCREENSHOT HERE
----------------------------