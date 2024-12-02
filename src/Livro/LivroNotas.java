package Livro;

public class LivroNotas {

    double somarNotas;
    double totalNotas = 0;
        public void adicionarNotas(double nota){
            totalNotas+=nota;
        }
        public void calcularMedia(double qtdNotas, double total){
            double media = total / qtdNotas;
            System.out.printf("A média das %.0f notas é de %.2f.\n", qtdNotas, media);

        }
}
