public class Array6 {
    static void array(int... a)
    {
        for(int i:a)
            System.out.println(i);
    }

    public static void main(String[] args) {
       int[] a={11,22,33,44,5,66,77,88,9,99,99,56,43,87};
       array(a);
    }
}
