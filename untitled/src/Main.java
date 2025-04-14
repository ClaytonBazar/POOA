import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Estudante> lista = new ArrayList<>();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Estudante est1 = new Estudante(1, "Clayton Bazar", 15,15);
        Estudante est2 = new Estudante(3, "Liria", 14,12);
        Estudante est3 = new Estudante(2, "Iwanka", 18,14);
        lista.add(est1);
        lista.add(est2);
        lista.add(est3);



        Collections.sort(lista);

        for (Estudante estudante : lista){
            System.out.println(estudante.toString());
            EstudanteController.adicionarEstudante(estudante);
        }
    }
}