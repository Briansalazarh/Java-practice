import java.util.HashMap;

public class MapaHashmatique {
    public static void main(String[] args) {
        // Crear el HashMap trackList
        HashMap<String, String> trackList = new HashMap<>();

        // Agregar canciones y letras al trackList
        trackList.put("Si No Te Hubieras Ido", "Si no te hubieras ido, seria tan feliz");
        trackList.put("Mas Que Tu Amigo", "Mas que tu amigo, yo quiero ser el dueno de tu amor");
        trackList.put("Tu Carcel", "Voy a pasarme la vida en tu carcel");
        trackList.put("A donde vamos a parar", "A donde vamos a parar tanta soledadd....");

// Aqui se va a imprimir la lista con las 4 canciones que le puse
        for (String cancion : trackList.keySet()) {
            String letra = trackList.get(cancion);
            System.out.println(cancion + " : " + letra);
        }
    }
}