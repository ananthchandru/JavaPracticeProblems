package com.ananth.arrays.easy;

/*
A professor went to a party. Being an erudite person, he classified the party into two categories.
He proposed that if all the persons in the party are wearing different colored robes,
then that is a girl’s only party. If we even get one duplicate color, it must be a boy’s party.
The colors of the robes are represented by positive integers.
 */

public class ProfessorAndParties {

    public static void main(String[] args) {
        ProfessorAndParties obj = new ProfessorAndParties();
        int arr[] = new int[] {7,1,2,4,5,7};
        System.out.println(obj.getPartyType(arr, arr.length));
    }

    public static String getPartyType(int a[], int n) {
        // Your code goes here
        int count[]= new int[100000];
        long max= Long.MIN_VALUE;
        for(int i=0;i<n;++i) {
            ++count[(int)a[i]];
            if(a[i]>max)
                max=a[i];
        }

        for(int i=0;i<=max;++i) {
            if(count[i]>1)
                return "BOYS";
        }
        return "GIRLS";
    }


/*    Another approach

       Arrays.sort(a);
       for (int i=0 ; i<n-1 ; i++){
           if(a[i]==a[i+1]){
               ans="BOYS";
            }
       }
*/

/* Another approach

    HashMap<long,integer> map = new HashMap<>();
    for(int i =0 ; i < n; i++){
        if(map.containsKey(a[i])){
            return "BOYS";
        }
        else{
            map.put(a[i],1);
        }
    }
    return "GIRLS";
*/
}
