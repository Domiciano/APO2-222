### Lexicographic Comparison

1. Input two strings string 1 and string 2.

2. for (int i = 0; i < str1.length() && i < str2.length(); i ++) 
  (Loop through each character of both strings comparing them until one of the string terminates):
   a. If unicode value of both the characters is same then continue;
   b. If unicode value of character of string 1 and ASCII value of string 2 is different then return (str1[i]-str2[i])

3. if length of string 1 is less than string2
       return str2[str1.length()]
   else 
       return str1[str2.length()]
