import java.util.Arrays;
import java.util.HashMap;

public class July22 {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i< heights.length; i++){
            map.put(heights[i],i);
        }

        Arrays.sort(heights);
        String[] ans= new String[names.length];
        for(int j=heights.length-1; j>=0; j--){
            ans[j]=names[map.get(heights[j])];
        }
        return ans;
    }
}
