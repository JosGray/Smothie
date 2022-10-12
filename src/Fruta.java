public class Fruta {
    private String nombreFruta; //char 'a' varchar solo en base de datos
    private double caloriasFruta;
    //alt + ins

    public Fruta(String nombreFruta, double caloriasFrutas) {
        this.nombreFruta = nombreFruta;
        this.caloriasFruta = caloriasFrutas;
    }

    public String getNombreFruta() {
        return nombreFruta;
    }

    public void setNombreFruta(String nombreFruta) {
        this.nombreFruta = nombreFruta;
    }

    public double getCaloriasFruta() {
        return caloriasFruta;
    }

    public void setCaloriasFruta(double caloriasFruta) {
        this.caloriasFruta = caloriasFruta;
    }
}
