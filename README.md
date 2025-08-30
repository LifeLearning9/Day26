# Day26: Check whether one string is both: An Anagram of another (contains exactly the same characters with the same frequency). A Rotation of another (second string can be obtained by rotating first string).

**TestCases**
Input: s1 = "abcde", s2 = "cdeab"
Output: true

**Intuition**
**1.Anagram check:**
  Since built-in sorting or collections are not allowed, use frequency counting (ASCII array of size 256).
  
  Count occurrences of each character in both strings.
  
  If all frequencies match, they are anagrams.

**2. Rotation check:**
  Instead of using built-in functions like contains, check manually:
  
  Concatenate the first string with itself (s1+s1).
  
  If the second string appears as a substring in it → it’s a rotation.
  
  Substring check is done manually using nested loops.

**Algorithm Flow**

1. Read input strings s1, s2.

2. If lengths differ → immediately return false.

3. Check Anagram:
    
    Initialize two arrays of size 256.
    
    Count character frequencies for both strings.
    
    Compare the arrays → if mismatch → return false.

4. Check Rotation:

    Concatenate s1 with itself.
    
    For every index in concatenated string, compare substring with s2.

5. If match found → return true.

6. Final answer = isAnagram && isRotation.

**Complexity Analysis**
Time Complexity: O(n²)
Space Complexity: O(1)
