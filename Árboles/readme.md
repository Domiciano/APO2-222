### Lexicographic Comparison

1. Input two strings string 1 and string 2.<br><br>

2. for (int i = 0; i < str1.length() && i < str2.length(); i ++) <br>
  (Loop through each character of both strings comparing them until one of the string terminates): <br>
   a. If unicode value of both the characters is same then continue; <br>
   b. If unicode value of character of string 1 and ASCII value of string 2 is different then return (str1[i]-str2[i]) <br><br>

3. if length of string 1 is less than string2 <br>
       return str2[str1.length()] <br>
   else  <br>
       return str1[str2.length()] <br>
