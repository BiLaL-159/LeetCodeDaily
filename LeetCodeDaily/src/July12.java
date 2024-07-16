public class July12 {
    public static void main(String[] args) {
        System.out.println(maximumGain("abababa",4,5));
    }
    public static int maximumGain(String s, int x, int y) {
        if(s.length()==1){
            return 0;
        }
        int sum=0;
        int i=0;
        int j=1;
        String window;
        String prev;

        while(j<s.length()){
            window=s.substring(i,j+1);


            if(window.equals("ab") && i>=1 && s.substring(i-1,j).equals("b")){
                System.out.println(s.substring(i-1,j));
                sum=sum+Math.max(x,y);
            }
            else if(window.equals("ba") && i>=1&& s.substring(i-1,j).equals("a")){
                System.out.println(s.substring(i-1,j));
                sum=sum+Math.max(x,y);
            }

            else if(window.equals("ab")) {
                sum=sum+x;
            }
            else if(window.equals("ba")){
                sum=sum+y;
            }
            j++;
            i++;
        }
        return sum;
    }
}
