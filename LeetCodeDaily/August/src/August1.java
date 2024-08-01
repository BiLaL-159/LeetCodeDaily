public class August1 {
    public static void main(String[] args) {

    }
    public int countSeniors(String[] details) {
        int sum=0;
        for(String element: details){
            int age= Integer.parseInt(element.substring(11,13));
            if(age>60){
                sum++;
            }
        }


        return sum;
    }
}
