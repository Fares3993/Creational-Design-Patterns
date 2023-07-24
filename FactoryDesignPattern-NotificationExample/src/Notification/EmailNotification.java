package Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser(String name)
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification to "+name);
    }
}