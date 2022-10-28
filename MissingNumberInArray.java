class Solution {

    int MissingNum(int array[], int n) {


        int actualsum=n*(n+1)/2;

        int arrsum=0;

       

         for(int i =  0; i<n-1 ;i++){

             arrsum +=array[i];

             

         }

         return actualsum - arrsum;

    }

}
