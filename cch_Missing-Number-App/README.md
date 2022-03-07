# Missing Number Problem
This project was created for solving the coding challenge of finding a missing number from a given sequence. The algorithm had to satisfy the following conditions:
  1. Sequences will be taken as an input from a user.
  2. Should take unordered sequences.
  3. Specify a de-limiter for the user to separate numbers.
  4. Only allow the specified de-limiter to be used.
  5. The missing number should be output to the user.
  6. The sequence can have any starting number that is unspecified.
  7. The length of the sequence is unspecified.

The sequence will have the following characteristics:
  1. The difference between terms is always 1.
  2. There will always be a missing number.
  3. Missing number can be in either the beginning or the end of the sequence as well.

## Dealing with Characteristic 3
The third assumption suggests that the missing number from the sequence could be at the beginning or the end of the sequence as well. This makes this problem more complicated since it would be difficult to try to automatically assume where the missing number would be placed.

When dealing with sequences in mathematics, we are given a starting number along with the rest of the information we need for a sequence. This starting number can be used to find the other terms and to calculate the sum of the given terms. However, we have not been given a starting number for the series as it can be random.

To overcome this I made another assumption. This assumption is that the user would provide some help when the program faces this problem by adding an extra de-limeter at either the beginning or the end of the sequence, indicating where the missing number will be placed if we come across this situation.
