package programa6;

import javax.swing.JOptionPane;

public class ProductoEnteros {
    public static void main(String[] args) {
        int total = 1;
        for(int i = 0; i < 16; i++){
            if(i % 2 != 0){
                total *= i;
            }
        }

        JOptionPane.showMessageDialog(null, String.format("El producto de los numeros enteros impares del 1 al 15 es: %d", total), "Total", 1);
    }
}
