import javax.swing.*;
public class diminuiLetras {
    public static void lowCase() throws NullPointerException {
        String word = null;
        String newWord = null;

        newWord = word.toLowerCase();
        System.out.println("A palavra informada é: " + word);
        System.out.println("A palavra corrigida é: " + newWord);
    }
}

public static void main(String[] args) {
    diminuiLetras ltpqn = new diminuiLetras();
    ltpqn.lowCase();

    try{
        diminuiLetras ltpqn = new diminuiLetras();
    } catch(NullPointerException e){
        System.out.println("Exceção NullPointerException identificada");
        System.out.println("Método diminuirLetras() tratado" + e);
    }
}