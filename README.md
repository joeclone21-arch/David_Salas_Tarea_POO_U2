# David_Salas_Tarea_POO_U2
Proyecto de POO - Unidad 2: Gestión de Contenido Audiovisual con Herencia, Polimorfismo, Asociación, Agregación y composición en Java
Este proyecto es una aplicación desarrollada en Java que utiliza los fundamentos de la Programacion Orientada a objetos (POO) para gestionar diversos tipos de medios audiovisuales.

Características principales:
**Estructura Jerárquica:** Uso de herencia para extender una clase base (`ContenidoAudiovisual`) hacia tipos específicos como Películas, Series, Documentales, Videos de YouTube y Cortometrajes.
**Polimorfismo:** Implementación de métodos que se comportan de forma distinta según el tipo de objeto.
**Relaciones UML:** Aplicación práctica de Agregación (Actor), Composición (Temporada) y Asociación (Investigador).

**Problema que resuelve:** 
Facilita la organización y visualización de metadatos de una biblioteca multimedia diversa, permitiendo una gestión unificada a pesar de las diferencias técnicas entre cada formato.

**Instrucciones de Instalación y Uso**
Requisitos previos
* **Java JDK 26** o superior.
* **Eclipse IDE** (u otro entorno compatible con Java).
* **Git** instalado en el sistema.

### Instalación
*Paso 1 Iniciar el proceso de Importación en Eclipse
	Abrir Eclipse.
	Ir al menú superior: File > Import....
	En la ventana que aparece, se despliega la carpeta Git y selecciona Projects from Git (with smart import). Hacer clic en Next.
*Paso 2 Configurar la conexión con GitHub.
	Selecciona Clone URI y haz clic en Next.
	En el campo URI, pegar el link de GitHub del proyecto(https://github.com/joeclone21-arch/David_Salas_Tarea_POO_U2.git) . Ver que los campos de Host y Repository path se llenan solos.
	Autenticación: Si el repositorio es público, puedes dejar los campos de usuario y contraseña vacíos. Si es privado, deberás ingresar tu usuario de GitHub y un Personal Access Token (GitHub ya no acepta contraseñas normales para esto). Hacer clic en Next.
	Seleccionar la Rama (Branch)
	Eclipse mostrará las ramas disponibles (main o master).
	Confirmar de que esté marcada la rama principal y hacer clic en Next.
	Directorio Local y Finalización
	Local Destination: elegir en qué carpeta de tu computadora quieres que se guarde el proyecto físicamente. Haz clic en Next.
	Eclipse analizará el contenido. Eclipse detectará que es un proyecto de Java. Hacer clic en Finish.

  ## 🌟 Extensiones y Mejoras (Etapa 4 e Iniciativa Propia)

### Nuevas Clases Implementadas
Se añadieron las clases **Actor, Investigador y Temporada.**
Se expandió la jerarquía de clases original para cubrir nuevos dominios de contenido digital, aplicando **Herencia** desde la clase base `ContenidoAudiovisual`:

*   **VideoYouTube**: Clase especializada para contenido de plataformas de streaming. 
    *   *Funcionalidad*: Atributos para `canal` y conteo de `vistas`.
*   **Cortometraje**: Clase para producciones de breve duración.
    *   *Funcionalidad*: Atributo para identificar el `festival` o productora de origen.

### Mejoras de Optimización y Código
Más allá de los requisitos básicos, se implementaron las siguientes mejoras técnicas:

1.  **Optimización del Polimorfismo**: Se actualizó la lógica de ejecución en `PruebaAudioVisual.java` utilizando un arreglo dinámico de la clase padre. Esto permite que el sistema sea **escalable**: se pueden añadir infinitas clases nuevas sin modificar la lógica del bucle de impresión.
2.  **Manejo de Identificadores Únicos**: Se aseguró que cada nueva instancia (YouTube/Cortometraje) herede correctamente la generación automática de IDs, garantizando la integridad de los datos en la simulación.
3.  **Refactorización de Métodos**: Se sobreescribió (`@Override`) el método `mostrarDetalles()` en cada clase nueva para asegurar una salida en consola limpia y formateada, mejorando la legibilidad del sistema.
4.  **Validación de Nulidad**: Se añadió una comprobación preventiva (`if (contenido != null)`) en el ciclo principal para evitar errores de tipo `NullPointerException` durante la ejecución.

