class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int maxCandy = candies[0];
     for(int i = 0 ; i < candies.length ; i++){
        maxCandy = Math.max(maxCandy,candies[i]);
     }
     List<Boolean> result = new ArrayList<>();
     for(int j = 0 ; j < candies.length ; j++){
        if(candies[j] + extraCandies >= maxCandy){
            result.add(true);
        }
        else{
            result.add(false);
        }
     }
     return result;   
    }
}