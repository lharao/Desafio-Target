public class VerificaA {

    public static void main(String[] args) {
        String texto = "Ao conversar com a equipe Target, desde a apresentação comercial, passando pela implantação e durante as questões do dia a dia que precisarão de orientação, você perceberá a diferença em trabalhar com quem conhece seu negócio e a melhor forma de aplicar nossas soluções em cada situação.";

        System.out.println("String a ser verificada: \n" + texto);

        String textoMinusculo = texto.toLowerCase();

        int contador = 0;

        for (int i = 0; i < textoMinusculo.length(); i++) {
            if (textoMinusculo.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("\nA letra 'a' ocorre " + contador + " vezes nessa string.");
    }
}
