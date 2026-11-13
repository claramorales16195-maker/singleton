public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setTheme("Dark"); 

        config1.printConfig();
        config2.printConfig(); 
=======
        // Different parts of the code create their own config...
        AppConfig config1 = new AppConfig();
        AppConfig config2 = new AppConfig();

        config1.setTheme("Dark"); // Change setting in one object...

        config1.printConfig();
        config2.printConfig(); // ...but the other object is unaware! This is bad.
>>>>>>> 3889f9efbc3d81e3d0286e034930c7c9beb8c349

        System.out.println("Are these the same instance? " + (config1 == config2));
    }
}