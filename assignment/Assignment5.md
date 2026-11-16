# Assignment 5: Batch Waitlist

## 1. Problem in My Own Words
Create a batch with 3 seats using a String array.
If seats are available, assign learners directly.
If all seats are full, add learners to a Queue.
When someone drops out, give the free seat to
the first learner in the waitlist.

## 2. Edge Cases
- Someone drops out when the waitlist is empty.
- Dropping a name that is not in the batch.
- All three seats are full.

## 3. Technique and Data Structure Used
- Array: To store 3 learner names.
- Queue: To maintain the waitlist.
- If-Else: To check seat availability and waitlist.
- Loops: To assign seats and find learners.

## 4. Why These Techniques?
Array stores the learners in the available seats.
Queue maintains the order of learners waiting
for admission.

## 5. Think About

**Why is a Queue fair here?**
Queue follows FIFO (First In, First Out).
The learner who joins the waitlist first gets
the next available seat first.

**What would go wrong if we used a Stack?**
Stack follows LIFO (Last In, First Out).
The learner who joins last would get the seat first.
This would be unfair to the earlier learners.