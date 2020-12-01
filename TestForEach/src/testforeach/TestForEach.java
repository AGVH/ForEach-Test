package testforeach;

public class TestForEach {

    public static void main(String[] args) {
//      int [] numeros = {1, 2, 3, 58};
//        for (int numero : numeros) {
//            System.out.println("numero = " + numero);
//        }
        Persona personas [] = {new Persona("Thor"), new Persona("Terra"), new Persona("Goliath")};
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    
}
