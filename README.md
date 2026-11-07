
# Game Inventory System - Visitor Design Pattern
### Name: Assylzhan Abishev
### Group: SE-2512

## Project Description

This project was developed for Software Design Patterns (SDP) Assignment 6.

The application demonstrates the Visitor Behavioral Design Pattern using a game inventory system.

The Visitor Pattern allows new operations to be added to existing objects without modifying their classes.


## Project Structure

```text
GameInventory/
└── src/
    ├── Main.java
    ├── Item.java
    ├── ItemVisitor.java
    ├── Weapon.java
    ├── Armor.java
    ├── Potion.java
    ├── PriceVisitor.java
    ├── WeightVisitor.java
    └── DescriptionVisitor.java
```

## Visitor Pattern Components

### 1. Element Interface
- Item.java
- Defines the accept(ItemVisitor visitor) method.

### 2. Concrete Elements
- Weapon.java
- Armor.java
- Potion.java

Each element implements the Item interface and uses double dispatch.

### 3. Visitor Interface
- ItemVisitor.java
- Declares visitWeapon(), visitArmor(), and visitPotion() methods.

### 4. Concrete Visitors
- PriceVisitor - Calculates the total inventory price.
- WeightVisitor - Calculates the total inventory weight.
- DescriptionVisitor - Displays information about inventory items.

### 5. Object Structure
- List<Item> inventory
- Stores all game items and allows visitors to process each item.

## Double Dispatch

Double dispatch allows the correct visitor method to be selected based on the element type and the visitor implementation.

Example from Weapon.java:

```java
@Override
public void accept(ItemVisitor visitor) {
    visitor.visitWeapon(this);
}
```

The Weapon object passes itself to the visitor, which executes the appropriate visitWeapon() implementation.

## Clean Code Principles

### 1. Single Responsibility Principle
Each visitor has one responsibility:
- PriceVisitor calculates prices.
- WeightVisitor calculates weights.
- DescriptionVisitor provides descriptions.

### 2. Meaningful Names
Classes and methods use clear and descriptive names.

### 3. Encapsulation
Item attributes are private and accessed through getter methods.

### 4. No instanceof
The application uses double dispatch instead of instanceof checks or type-checking chains.

### 5. Extensibility
New visitors can be added without modifying the existing element classes.

## Example Output

```text
=== GAME INVENTORY ===
Weapon
Armor
Potion

=== PRICE CALCULATION ===
Weapon: Sword - 500 Gold
Armor: Iron Armor - 800 Gold
Potion: Health Potion - 100 Gold
Total Price: 1400 Gold

=== WEIGHT CALCULATION ===
Weapon: Sword - 5.0 kg
Armor: Iron Armor - 15.0 kg
Potion: Health Potion - 1.0 kg
Total Weight: 21.0 kg

=== ITEM DESCRIPTIONS ===
Weapon: Sword is used for attacking enemies.
Armor: Iron Armor protects the player.
Potion: Health Potion is a consumable item.
```


## Conclusion

This project demonstrates how the Visitor Pattern separates operations from object structures.

It provides a clean and extensible architecture where new operations can be implemented without changing existing element classes.


