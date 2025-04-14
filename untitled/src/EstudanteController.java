import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EstudanteController {
    public static void adicionarEstudante(Estudante estudante) throws IOException{
        FileWriter f1 = new FileWriter("Estudante.txt", true);
        BufferedWriter buffer = new BufferedWriter(f1);

        String line = "\nEstudante" +
                "\nCodigo = " + estudante.getCodigo() +
                "\nNome = " + estudante.getNome() +
                "\nTeste 1= " + estudante.getTeste1() +
                "\nTeste 2 = " + estudante.getTeste2() +
                "\nMedia = " + estudante.calcularMedia();

        buffer.write(line);
        buffer.newLine();
        buffer.close();
        f1.close();

    }
}
