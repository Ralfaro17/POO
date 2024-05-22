package prueba;

public class Cuadrilatero {
    private Punto[] puntos = new Punto[4];

    // Los puntos se ingresan en el sentido de las manecillas del reloj, comenzando por la esquina superior izquierda
    public Cuadrilatero(Punto[] puntos){
        this.puntos = puntos;
    }

    public Punto[] getPuntos() {
        return puntos;
    }

    public void setPuntos(Punto[] puntos){
        this.puntos = puntos;
    }

    public Punto getPuntoUnico(int indice) throws Exception{
        if(indice > -1 && indice < 4){
            return puntos[indice];
        }
        else{
            throw new Exception("El indice o punto no existe");
        }
    }

    public void setPuntoUnico(Punto punto, int indice){
        if(indice > -1 && indice < 4){
            this.puntos[indice] = punto;
        }
    }
}
