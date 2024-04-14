package programa7;

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        long total = 1;
        long[] factoriales = new long[20];

        for(int i = 1; i < 21; i++){
            total *= i;
            factoriales[i-1] = total;
        }

        JOptionPane.showMessageDialog(null, String.format("1! = %d%n2! = %d%n3! = %d%n4! = %d%n5! = %d%n6! = %d%n7! = %d%n8! = %d%n9! = %d%n10! = %d%n11! = %d%n12! = %d%n13! = %d%n14! = %d%n15! = %d%n16! = %d%n17! = %d%n18! = %d%n19! = %d%n20! = %d%n",
        factoriales[0], factoriales[1], factoriales[2], factoriales[3], factoriales[4], factoriales[5], factoriales[6], factoriales[7], factoriales[8], factoriales[9], factoriales[10], factoriales[11], factoriales[12], factoriales[13], factoriales[14], factoriales[15], factoriales[16], factoriales[17], factoriales[18], factoriales[19]), "Tabla de resultados", 1);
    }
}
