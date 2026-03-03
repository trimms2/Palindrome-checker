import java.util.*;

public class practise{
    public static void main(String[] args) {
    int arr[]={2,7,11,15};
    int target=9;
        HashMap<Integer,Integer> mpa=new HashMap<>();
    for(int i =0;i<arr.length;i++) {
    int compliment=target-arr[i];
    if(mpa.containsKey(compliment)) {
        System.out.println("Indices: [");
    }
    }
    }
}