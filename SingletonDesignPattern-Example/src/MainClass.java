public class MainClass {
    public static void main(String[] args) {
//Compile Time Error: The constructor SingleObject() is not visible
//SingleObject object = new SingleObject();
//Get the only object available
        Singelton object = Singelton.getInstance();
//show the message
        object.showMessage();
    }
}
