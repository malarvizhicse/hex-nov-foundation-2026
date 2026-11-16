# Assignment 4: Enrollment Undo

## 1. Problem in My Own Words
Create a menu-driven program to enroll learners
using a Stack. Allow users to undo the last
enrollment, show the last enrollment, or exit.

## 2. Edge Cases
- Undo when nothing has been enrolled.
- Show when the stack is empty.
- Invalid menu choice.

## 3. Technique and Data Structure Used
- Stack: To store learner names.
- Switch: To handle menu choices.
- If-Else: To check whether the stack is empty.
- Loop: To display the menu repeatedly.

## 4. Why These Techniques?
Stack follows LIFO (Last In, First Out).
It helps undo the most recently enrolled learner.

## 5. Think About

**Why is Stack the right choice for undo?**
Stack removes the last enrolled learner first.
This follows LIFO, which is suitable for undo operations.

**Why not a Queue?**
Queue follows FIFO (First In, First Out).
It removes the first enrolled learner instead
of the last one, so it is not suitable for undo.