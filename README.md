# InventoryApp

This App sets up and uses the database schema for an Book Store App.
This project focuses on what happens behind the scenes,
practicing how to design and implement a simple database. It includes a subclass of SQLiteOpenHelper and a Contract.

The App defines and sets up the database schema (i.e. table and columns) that are used to keep track of product inventory.
The App stores information about the product name, price, quantity, supplier name, and supplier phone number.
The App has 2 different datatypes - INTEGER, STRING.
There are 2 methods that insert and read data to/from the database.

The read method uses a Cursor from the database to perform a query on the table to retrieve data.

The App's insert/read methods were tested with displaying the data in a TextView.

The intent of this project was to practice writing raw Java code using the necessary classes provided 
by the Android framework; therefore, there was no use of external libraries for completing this project.

![inventoryapp1gif](https://user-images.githubusercontent.com/29640816/43234283-6f2ab04e-9038-11e8-9f22-5eaf2f9f508f.gif)
![inventoryappgif2](https://user-images.githubusercontent.com/29640816/43234291-7846c852-9038-11e8-944b-dc314247b1a0.gif)
