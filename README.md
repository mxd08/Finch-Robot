# Finch Robot Plus Sign Movement – Java Project

## Project Goal

The goal of this project is to program a Finch robot to move in the shape of a **plus sign ("+")**, with each arm extending a specific distance (e.g., 10 cm) from the center and returning to the origin between movements. The robot should:

- Start facing forward at a central position
- Move forward by a given distance, then return
- Turn and move right by the same distance, then return
- Turn and move backward, then return
- Turn and move left, then return
- Finish facing its original direction at the center

This exercise demonstrates basic robot movement control using time-based motion estimation and turning logic.

---

## Approach and Planning

Since the Finch robot does not have built-in encoders or precise distance measurement tools, we estimate **distance based on time and motor speed**.

### Main Assumptions:

- At motor speed `100`, the Finch moves approximately **1 cm in 70 milliseconds**.
- Turning is done by rotating the wheels in opposite directions for a fixed duration:
  - ~850 ms for a 90° turn
  - ~1700 ms for a 180° turn

We'll use helper functions like:

- `moveForward(Finch f, int cm)`
- `turnRight90(Finch f)`

---

### Motivation
The motivation for this project was to explore how simple movement commands can be combined to form more complex, meaningful patterns. It was a way to challenge ourselves to think spatially and logically, turning basic directional movement into something purposeful.
----
### Puprose
I wanted to gain a better understanding of how motion and control work together in a physical system. Building this project allowed us to see how movement can be broken down, structured, and repeated with consistency, even when relying on estimated inputs or limited feedback.
----
### What I learned
I learned how important it is to think carefully about timing, direction, and repetition when working with physical movement. We also realized how helpful it is to organize code into smaller, reusable parts. The project taught us to be patient and precise, since even small miscalculations can lead to noticeable differences in the outcome.
----

