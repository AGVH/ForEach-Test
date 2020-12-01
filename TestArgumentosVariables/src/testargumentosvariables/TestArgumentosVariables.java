package testargumentosvariables;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        Persona persona = new Persona("Victor", 26);
        Persona persona2 = new Persona("Hugo", 36);
        Persona persona3 = new Persona("Thor", 86);
        imprimirVariosArgs("Personal Tienda en linea", persona, persona2, persona3);
    }
    
    public static void imprimirVariosArgs(String nombreLista, Persona... persona){
        System.out.println(nombreLista);
        for (Persona persona1 : persona) {
            System.out.println(persona1);
        }
    }
}
