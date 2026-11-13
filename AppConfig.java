// ¿Cuál es el resultado de (config1 == config2) después de aplicar Singleton?
// R: El resultado es True
// ¿Por qué el campo instance debe ser static?
// R: ya que el contructor en privado si el campo instance no fuera estatico, no podría ser leído desde un método estático, ya que los métodos estáticos no tienen acceso a variables de instancia.
//¿Qué ventaja tiene garantizar que exista una única instancia de configuración?
// R: Toda la aplicación consulta y modifica exactamente el mismo objeto. Esto evita que diferentes partes del sistema manejen configuraciones desincronizadas.
//¿Cuál es la principal desventaja de la inicialización ansiosa?
// R: la principal desventaja es el uso innecesario de recursos como la memoria.
//¿Qué problema puede aparecer si el Singleton guarda estado global y la aplicación crece mucho?
// R: las clases quedan fuertemente atadas a esa implementación específica.
//  las pruebas unitarias pueden interferir entre sí.
public class AppConfig {

    private static AppConfig instance = new AppConfig();
    private String theme;
    private String language;

    private AppConfig() {
        // Load default settings
        this.theme = "Light";
        this.language = "EN";
        System.out.println("New AppConfig instance created!");
    }

    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public void printConfig() {
        System.out.println("Theme: " + theme + ", Language: " + language);
    }
<<<<<<< HEAD

    public static AppConfig getInstance() {
        return instance;
    }

=======
>>>>>>> 3889f9efbc3d81e3d0286e034930c7c9beb8c349
}