public class Singelton {
    // Create an object of SingleObject
    private static Singelton instance = new Singelton();
    // Make the constructor private so that this class cannot be instantiated
    private Singelton(){}
    // Get the only object available
    public static Singelton getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("I am Singleton Pattern!");
    }
}
