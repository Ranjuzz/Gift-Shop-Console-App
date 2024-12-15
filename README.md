# Gift Shop Shopping System

This is a Java-based application that simulates a shopping experience in a gift shop. The shop offers a variety of gifts, categorized into **Premium** and **Standard** types. The system allows users to add gifts to their cart, calculate the total price, apply discounts, and generate a bill including taxes.

## Features

- Add multiple gifts to the shopping cart.
- Display available gifts with prices.
- Input validation and error handling.
- Calculate the total price, including a 5% Goods and Services Tax (GST).
- Apply a 10% discount for orders above Rs. 2500.
- Generate and display the final bill.

## Requirements

- Java 8 or higher.

## Code Overview
### Main.java

The Main.java file is the entry point of the application. It performs the following tasks:
  * Creates an instance of the Shop class.
  * Adds several gifts to the shop, categorized as Premium and Standard.
  * Starts the shopping session by calling the startShopping() method.

### Shop.java
The Shop.java file contains the logic for managing the shop’s inventory, user interaction, and the shopping cart system.

### Key Methods in the Shop Class:
* **addGift(String type, String name, int price):** Adds a gift to the shop’s inventory. Each gift has a name, type (Premium or Standard), and price.

* **displayGifts():** Displays the available gifts in the shop, including their price.

* **getInput():** Prompts the user to enter the number of gifts they want to add to their cart, as well as the names of those gifts.

* **validateGifts():** Validates and formats the user input, ensuring the gift names are in the correct format.

* **calculateTotal():** Calculates the total price of the selected gifts, verifies that the gifts exist in the shop’s inventory, and throws an error if necessary.

* **generateBill():** Calculates the Goods and Services Tax (GST) and applies any applicable discounts to the total price.

* **displayBill():** Displays the final bill, including the total price, GST, and discounts.

### Gifts.java
The Gifts.java file represents an individual gift in the shop. It contains the following attributes and methods:

### Attributes:

* **name:** The name of the gift (e.g., "Ornaments").
* **type:** The type of gift (e.g., "Premium" or "Standard").
* **price:** The price of the gift in Rs.

### Methods:

* **getName():** Returns the name of the gift.
* **getType():** Returns the type of the gift.
* **getPrice():** Returns the price of the gift.

### Example Interaction
```bash
  Gift Shop
  1) Ornaments :- 2000
  2) TeddyBear :- 600
  3) Chocolates :- 1000
  4) Novel :- 800
  5) PhotoFrame :- 1500
  
  Enter the number of gifts you wish to add: 
  3
  Enter the gift name you wish to add: 
  Ornaments, Chocolates, PhotoFrame
  
  Total Bill: Rs. 5400
  GST (5%): Rs. 270
  Discount (10%): Rs. 540
  Final Bill: Rs. 5130
```
### Usage
After running the program, the user is prompted to:

  - View the available gifts in the shop.
  - Input the number of gifts they wish to add to their cart.
  - Enter the names of the selected gifts (comma-separated).
  - The system calculates the total price, applies GST, and any applicable discounts, and then displays the final bill.
### License
This project is licensed under the MIT License – see the LICENSE file for details.
