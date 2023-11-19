# MakeChangeProject 

## How to Run
Opening via terminal: 

Clone the Repository:

git clone https://github.com/walkerjohnelle/MakeChangeProject.git
Navigate to the Project Directory:


cd MakeChangeProject
Compile the Java Code:


 
javac CashRegister.java
Run the Program:

java CashRegister


Follow On-Screen Instructions:

Enter the price of the item.
Enter the amount tendered by the customer.


## Project Description
This Java program simulates a cash register, calculating the amount of change to be returned to a customer based on the purchase price and the amount tendered. It also provides a breakdown of the number of bills and coins to be given as change.

The program includes the following features:

Prompting the user for the price of the item and the amount tendered.
Checking for errors, such as insufficient payment or exact amount provided.
Displaying the change due and the specific denominations of bills and coins to be returned.

## Technologies Used
Java
Scanner class for user input

## Lessons Learned

This project was made a lot easier by our previous labwork creating the HiLo game. For some reason I struggled on that on despite understanding all of the indivdual concepts used to create the application. I understood the syntax decently well, however, I had a hard time determining which one to use and how. Working on that really helped me sort my thoughts, in addition to all of course material on Thursday and Friday. 

So when i finally got to this one I understood the need the main light and having separate methods to handle the major functions: calculating change and providing the correct bills. Additionally, I really understood the utility in running tests to unearth any potential precision issues presented by switching between ints and doubles, in providing correct change, and subsequent rounding up. 

- Keep main clean 
- Use separate methods
- Run tests
- Account for precision issues