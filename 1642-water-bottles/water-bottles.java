class Solution {
    public int numWaterBottles(int numbottles, int numExchange) {
        int n=numbottles,k=numbottles;
        while(k>=numExchange){
           n+=k/numExchange;
            k=k/numExchange+k%numExchange;
        }
        return n;

    }
}