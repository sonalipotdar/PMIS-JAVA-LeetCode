class Solution {
    int sumOfDigit(int i){
        int sum = 0;
        while(i>0){
            sum+=(i%10);
            i=i/10;
        }
        return sum;

    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>(); // creating hashmap 
        for(int i =1;i<=n;i++){   // iterating using for loop
            int sum= sumOfDigit(i);
            if(map.isEmpty() || !map.containsKey(sum)){
                map.put(sum,1);
            }
            else{
                int freq = map.get(sum);
                map.put(sum,freq+1);
            }


        }
        int largest = 0; // count the how many times occur
       for( Map.Entry<Integer,Integer> e : map.entrySet()){
        largest = Math.max(largest,e.getValue());
        
       }

       int count =0; // count the frequncy 
       for (Map.Entry<Integer,Integer> e : map.entrySet()){
        if(e.getValue()==largest){
            count++;
        }
        

       }
       return count;




        
    }
}