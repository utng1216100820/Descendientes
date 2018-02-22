package mx.edu.utng.dloza.descendientes;

/**
 * Created by Carolina Moctezuma on 21/02/2018.
 */

public class Image {
    private String nombre;
    private int idDrawable;

    public Image(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static Image[] ITEMS = {
            new Image("Jaguar F-Type 2015", R.drawable.image10),
            new Image("Mercedes AMG-GT", R.drawable.image11),
            new Image("Mazda MX-5", R.drawable.image12),
            new Image("Porsche 911 GTS", R.drawable.image13),
            new Image("BMW Serie 6", R.drawable.image14),
            new Image("Ford Mondeo", R.drawable.image15),
            new Image("Volvo V60 Cross Country", R.drawable.image17),
            new Image("Jaguar XE", R.drawable.image18),
            new Image("VW Golf R Variant", R.drawable.image19),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Image
     */
    public static Image getItem(int id) {
        for (Image item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}

