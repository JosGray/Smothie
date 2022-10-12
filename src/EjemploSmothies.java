public class EjemploSmothies {
    public static void main(String[] args) {
        Fruta manzana = new Fruta("Manzana", 12.3);
        Fruta uva = new Fruta("Uva", 20);
        Fruta pera = new Fruta("Pera", 34);
        System.out.println("Nombre fruta " + manzana.getNombreFruta());
        System.out.println("Calorias " + manzana.getCaloriasFruta());
        //para agregar un objeto siempre se debe empezar con el nombre de su clase
        Smothie smothie1 = new Smothie(3);
        smothie1.setCapacidad(100.0);
        smothie1.addFrutas(uva);
        smothie1.addFrutas(uva);
        smothie1.addFrutas(uva);
        System.out.println("Calorías totales: " + smothie1.obtenerCalorias());
        System.out.println("Capacidad: " + smothie1.getCapacidad());//set introducir y get obtener
        for (Fruta fruta : smothie1.getFrutas()) {
            System.out.println("Nombre de fruta: " + fruta.getNombreFruta());
            System.out.println("Calorias de fruta: " + fruta.getCaloriasFruta());
        }

    }
}
