class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) !=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         // Convert to lowercase and remove all non-alphanumeric characters
//         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
//         int i = 0;
//         int j = s.length() - 1;
        
//         while (i <= j) {
//             if (s.charAt(i) != s.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }
