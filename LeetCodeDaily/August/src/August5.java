import java.util.HashMap;

public class August5 {
    public static void main(String[] args) {
            String[] arr={"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr,2));
    }
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map= new HashMap<>();

        for(String element: arr){
            map.put(element, map.getOrDefault(element,0)+1);
            System.out.println(map);
        }

        for(String element: arr){
            if(map.get(element)==1){
                k--;
                if(k==0){
                    return element;
                }
            }
        }
        return "";
    }
}
