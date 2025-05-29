# Finch Robot "+" Shape Movement in Java

This project contains a Java program that controls a Finch robot to move in a **plus sign ("+") shape**. The robot:

- Starts at the center
- Moves forward by a user-defined distance (in cm), then returns
- Turns right, moves, returns
- Turns around (to go backward), moves, returns
- Turns left, moves, returns
- Finishes at the original position facing the original direction

## 🧠 How It Works

The Finch robot does **not have built-in distance measurement**, so the program approximates movement using **wheel velocity and duration**. For example:

- Velocity: `100`
- Estimated time to move 1 cm: `70 ms`

So, to move 10 cm:
```java
finch.setWheelVelocities(100, 100, 700);
