import java.util.*; 
  
class GFG { 
  
    // function to calculate minimum numbers 
    // of characters to be removed to make 
    // two strings anagram 
    static int remAnagram(String str1, String str2) 
    { 
        // make hash array for both string  
        // and calculate frequency of each 
        // character 
        int count1[] = new int[26];  
        int count2[] = new int[26]; 
  
        // count frequency of each character  
        // in first string 
        for (int i = 0; i < str1.length() ; i++) 
            count1[str1.charAt(i) -'a']++; 
      
        // count frequency of each character  
        // in second string 
        for (int i = 0; i < str2.length() ; i++) 
            count2[str2.charAt(i) -'a']++; 
  
        // traverse count arrays to find  
        // number of characters to be removed 
        int result = 0; 
        for (int i = 0; i < 26; i++) 
            result += Math.abs(count1[i] - 
                               count2[i]); 
        return result; 
    } 
  
    // Driver program to run the case 
    public static void main(String[] args) 
    { 
      //  String str1 = "cde", str2 = "abc";
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      for(int i=0;i<n;i++){
        String s1 = in.next();
      
        String s2 =in.next();
        
        System.out.println(remAnagram(s1, s2)); 
        
    } 
    }
} 