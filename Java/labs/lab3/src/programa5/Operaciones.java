package programa5;

import javax.print.attribute.standard.JobPriority;
import javax.swing.JOptionPane;

public class Operaciones {
    public static void main(String[] args) {
        int[][] arreglo;
        String[] texto = {"Mostrar valores", "Mostrar pares", "Mostrar impares", "Mostrar mayor", "Mostrar menor", "Buscar numero", "Ordenar arreglo", "Salir del programa"};
        int filas = 0, columnas = 0;
        String printer = "";
        String matriz = "", pares = "", impares = "";
        int mayor = 0, menor = 0; 
        int opcion = 0;

        filas = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de filas que deseas que tenga el arreglo"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de columnas que deseas que tenga el arreglo"));

        arreglo = new int[filas][columnas];

        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo[0].length; j++){
                arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog(String.format("Escribe el numero %d de la fila %d",j, i)));
                if (i == 0 && j == 0) {
                    menor = arreglo[i][j];
                    mayor = arreglo[i][j];
                }
                matriz += String.format("%d ",arreglo[i][j]);

                if (arreglo[i][j] % 2 == 0) {
                    pares += String.format("%d ", arreglo[i][j]);
                }
                else{
                    impares += String.format("%d ", arreglo[i][j]);
                }

                if (arreglo[i][j] > mayor) {
                    mayor = arreglo[i][j];
                }
                else if(arreglo[i][j] < menor){
                    menor = arreglo[i][j];
                }

                if (j == (arreglo[0].length)-1) {
                    matriz += String.format("%n");
                }
            }
        }

        
        while (opcion != 7) {
            opcion = JOptionPane.showOptionDialog(null, "Que deseas hacer", "Opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, texto, texto[0]);
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, String.format("Arreglo%n%s", matriz), "Matriz", 1);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, String.format("Pares%n%s%n", pares), "Numeros pares en la matriz", 1);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, String.format("impares%n%s%n", impares), "Numeros impares en la matriz", 1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, String.format("Mayor%n%d%n", mayor), "Numero mayor de toda la matriz", 1);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, String.format("Menor%n%d%n", menor), "Numero menor de toda la matriz", 1);
                    break;
                case 5:
                    int NumeroABuscar = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero que deseas buscar"));
                    boolean validador = false;
                    
                    for( int i = 0; i < arreglo.length; i++){
                        for(int j = 0; j < arreglo[0].length; j++){
                            if(arreglo[i][j] == NumeroABuscar){
                                JOptionPane.showMessageDialog(null, String.format("El numero %d fue encontrado en la columna %d de la fila %d del arreglo", NumeroABuscar, j, i), "Encontrado", 1);
                                validador = true;
                            }
                        }
                    }
                    if(!validador){
                        JOptionPane.showMessageDialog(null, String.format("El numero %d no fue encontrado", NumeroABuscar), "Error: no encontrado", 1);
                    }
                case 6:
                    int contador = 0;
                    String resultado = "";
                    int[] temp = new int[columnas*filas];
                    for(int i = 0; i < arreglo.length; i++){
                        for(int j = 0; j < arreglo[0].length; j++){
                            temp[contador] = arreglo[i][j];
                            contador++;
                        }
                    }

                    contador = 0;

                    Sort(temp, 0, temp.length-1);
                    for(int i = 0;  i < arreglo.length; i++){
                        for(int j = 0; j < arreglo[0].length; j++){
                            resultado += String.format("%d ", temp[contador]);
                            if(j == arreglo[0].length-1){
                                resultado += String.format("%n");
                            }
                            contador++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, resultado , "Arreglo ordenado", 1);
            
                default:
                    break;
            }
        }
    }

    public static void Sort(int arreglo[], int izquierda, int derecha){
        int pivote = arreglo[izquierda];

        int i = izquierda;
        int j = derecha;
        int auxiliar;

        while(i<j)
        {
            while (arreglo[i] <= pivote && i < j) 
                i++;

            while (arreglo[j] > pivote) 
                j--;   

            if (i<j) 
            {                                     
                auxiliar = arreglo[i];                  
                arreglo[i]= arreglo[j];
                arreglo[j]=auxiliar;
            }
        }

        arreglo[izquierda] = arreglo[j]; 
        arreglo[j] = pivote;

        if (izquierda < j-1)
            Sort(arreglo,izquierda,j-1);

        if (j+1 < derecha)
            Sort(arreglo,j+1,derecha);
    }
}
