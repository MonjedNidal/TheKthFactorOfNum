import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(kthFactor(7, 2));
    }

    public static int kthFactor(int n, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                list.add(i);
                System.out.println(i);
            }
        }
        try {
//            if(k == list.size()){
//                return list.get(k);
//            }
            return list.get(k-1);
        }catch (Exception e){
            return -1;
        }
    }
}
