import java.util.ArrayList;
import java.util.List;

public class Smothie {
    private double capacidad;
    private int cantidadIngredientes;
    private List<Fruta> frutas = new ArrayList<>();// contiene solo frutas
    public void addFrutas(Fruta fruta) {
        frutas.add(fruta);
    }//void significa función no retorna ningún calor

    public double obtenerCalorias(){
        double totalCalorias = 0;
        //manzana uva moraAzul -> lista de frutas
        //    0    1      2
        //vuelta 0 fruta = manzana
        //vuelta 1 fruta = uva
        //vuelta 2 fruta = moraAzul
        for (Fruta fruta : frutas){ //
            totalCalorias += fruta.getCaloriasFruta(); //get obtener y set introducir
            //totalCalorias = totalCalorias + fruta.getCaloriasFruta();
        }
        return totalCalorias;
    }

    public Smothie(int cantidadIngredientes) {
        this.cantidadIngredientes = cantidadIngredientes;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public int getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public List<Fruta> getFrutas() {
        return frutas;
    }
}
