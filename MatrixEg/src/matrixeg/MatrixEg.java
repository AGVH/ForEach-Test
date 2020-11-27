package matrixeg;

public class MatrixEg {

    public static void main(String[] args) {
//        String str[][] = new String[2][2]; 
//        str[0][0]="|0, 0| ";
//        str[0][1]="|0, 1|";
//        str[1][0]="|1, 0|";
//        str[1][1]="|1, 1|";
//        
//        for (String[] str1 : str) {
//            for (String str11 : str1) {
//                System.out.println(str11);
//            }
//        }
//        
        Fruits fruits1 = new Fruits();
        Fruits fruits [] = {new Fruits("banana", "yellow", "sweet"), new Fruits("grape", "purple", "sour")};
        fruits1.printFruits(fruits);
    }
}
