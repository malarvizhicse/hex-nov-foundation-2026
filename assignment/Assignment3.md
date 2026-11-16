# Assignment 3: Attendance Report

## 1. Problem in My Own Words
Store attendance for 10 days in an array.
Build a running total array to calculate attendance
from day 3 to day 7 using one subtraction.
Find the day with the highest attendance.

## 2. Edge Cases
- The range starts from day 1.
- Invalid range (start day greater than end day).
- Attendance is stored for 10 days.

## 3. Technique and Data Structure Used
- Array: To store daily attendance.
- DP (Running Total): To build the prefix sum array.
- Brute Force: To find the highest attendance.

## 4. Why These Techniques?
Running total helps calculate range attendance
using one subtraction instead of adding every day.
Brute force checks every day to find the maximum
attendance.

## 5. Think About

**Which part is DP?**
Building the running total array is DP.

**Which part is Brute Force?**
Checking every day to find the highest attendance.

**How many operations does each part take?**
- DP: 10 additions – O(n).
- Range query: 1 subtraction – O(1).
- Brute Force: 9 comparisons – O(n).