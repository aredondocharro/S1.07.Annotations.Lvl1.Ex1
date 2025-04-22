# Worker Salary Calculation with Inheritance and @Override annotation

## 📄 Description - Exercise Statement

Create an object hierarchy with three classes: Worker, OnlineWorker and OnSiteWorker.

The Worker class has the attributes name, surname, price/hour, and the method Sou() that receives the number of hours worked as a parameter and multiplies it by the price/hour. Child classes must override it, using @Override.

From the main() of the Main class, make the necessary invocations to demonstrate the operation of the @Override annotation.

For On Site workers, the method to calculate their salary will receive the number of hours worked per month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour, plus the value of a static attribute called fuelcost that we will add to this class.

For online workers, the method to calculate their salary will receive the number of hours worked per month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour and the price of the flat Internet rate will be added, which will be a constant of the OnlineWorker class.

## 💻 Technologies Used

- IntelliJ IDEA Community Edition 2024.3.4.1

## 📋 Requirements

- IntelliJ IDEA

## 🛠️ Installation

**Clone:**
1. File > New > Project from Version Control
2. Paste GitHub URL
3. Select destination folder

**Configure:**
1. Open File > Project Structure
2. Assign correct JDK (Java 8/11/17...)

**Dependencies:**
- For Maven: Click "Load IntelliJ IDEA Project"
- For Maven: Click "Load Maven Project"
- For Gradle: Click "Load Gradle Project"

**Run:**
1. Locate class with `public static void main`
2. Right-click > Run 'Class.main()'  