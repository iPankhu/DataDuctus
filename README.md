# DataDuctus

The given problem for assignment was: 

PROMPT:
  Given a string as input, your task is to write a program which parses the string and prints it out as a horizontal tree. If the string input is invalid, your program should print, "Invalid!" and exit.
  - Individual elements are delimited with a comma followed by space (e.g., ", ")
  - Individual groupings are designated with an open bracket [ and a close bracket ]
  - Your program should accomplish this task in the most efficient way possible.
  - Empty elements are valid.

  EXAMPLE 1 (Input):
  [1, 2, [A, B, C, [5^&, )()6, , 7], D, E], 3, 4]

  EXAMPLE 1 (Output):
  1
  2
    A
    B
    
      5^&
      )()6

      7
    D
    E
  3
  4

  EXAMPLE 2 (Input):
  [1, 2, [A, B, C, [5, 6]]

  EXAMPLE 2 (Output):
  Invalid!
  
  ASSUMPTIONS MADE WERE:
  
  1. Without the expression starting from the given opening bracket, it is always an 'INVALID' expression.
  2. When a closing bracket is found, that is when the horizontally printed tree starts decrementing space. When an opening 
     bracket is found, that is when we increment the space.
  3. There should always be equal number of opening and closing brackets for the string to be valid to be converted into a
     horizontal tree.
  4. Whenever a new opening bracket is found, multiple of two spaces are appended in next line.
  5. All other spaces are treated as they are leaving the ones which are used with the ',' as a delimiter.
  
  COMPLEXITY:
  
  Time Complexity : O(n) where n is the length of the given string
  Space Complexity : O(s) where s is the length of the given string.
