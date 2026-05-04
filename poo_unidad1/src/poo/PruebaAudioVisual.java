package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");
        // ejemplo para pelicula
        //se crea actor a pelicula
        Actor actorPrincipal = new Actor("Leonardo DiCaprio", "Cobb");
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        //se agrega un actor
        pelicula.agregarActor(actorPrincipal);
        pelicula.agregarActor(new Actor("Elliot Page", "Ariadne"));
        //ejemplo para documental 
        //se crea investigador y se pasa el constructor de documental
        Investigador investigador = new Investigador("Carl Sagan", "Astrofísica");
        Documental documental = new Documental("Cosmos", 45, "Ciencia", "Astronomía", investigador);
        // ejemplo para serieDeTv
        // las temporadas se crean internamente
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasía", 8);
        
        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = pelicula;
        contenidos[1] = documental;
        contenidos[2] = serie;
        // Instanciar las nuevas clases de etapa 4
        contenidos[3] = new VideoYouTube("Tutorial Java POO", 15, "Educación", "Programación Express", 15000);
        contenidos[4] = new Cortometraje("Piper", 6, "Animación", "Pixar Animation Studios");
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}