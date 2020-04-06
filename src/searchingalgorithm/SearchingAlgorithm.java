
package searchingalgorithm;

public class SearchingAlgorithm {

    public static void main(String[] args) {
        // TODO code application logic here
        int [] sampleArray = {20,9,91,30,29,79};
        
        System.out.println(linearSearch(sampleArray, 91));
                
    }
    
    public static boolean linearSearch (int  []a, int target){
        if(a.length == 0){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == target){
                return true;
            }
        }
        return false;
}
}
