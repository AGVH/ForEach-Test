

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vhag9
 */
public class SpecialChars {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) throws InterruptedException {
        /*var a =10;
        System.out.println();
        System.out.print("Time to explode: 10");
        Thread.sleep(1000);
        System.out.print("\b\b0");
        for (int i = 9; i >= 1; i--) {
            System.out.print(i + "\b");
            //Thread.sleep(1000);
        }
        System.out.println("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\bK-BOOOOOOOOM!!!!!!!!");
        Formatter obj = new Formatter();

        String numeroCeros = String.valueOf(obj.format("%0"+a+"d", a));
        System.out.println("numeroCeros = " + numeroCeros);
        String strDatos="6.3 6.2 6.4 6.2";
	StringTokenizer tokens=new StringTokenizer(strDatos, " ");//separa los datos cada que encuentra un espacio
        int nDatos=tokens.countTokens();
        double[] datos=new double[nDatos];
        int i=0;
        while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            datos[i]=Double.valueOf(str).doubleValue();
            System.out.print(datos[i]+" ");
            i++;
        }*/
        
        String myChar[] = {"*", "-", "*", "-", "*", "-", "*", "-"};
        String myChar2[] = {"-", "*", "-", "*", "-", "*", "-", "*"};
        for (int i = 0; i < 10; i++) {
            for (String myChar1 : myChar) {
                System.out.print(myChar1);
            }
            System.out.print("\b\b\b\b\b\b\b\b");
            Thread.sleep(1000);
            for (String myChar21 : myChar2) {
                System.out.print(myChar21);
            }
            System.out.print("\b\b\b\b\b\b\b\b");
            Thread.sleep(1000);
        }
    }
}
