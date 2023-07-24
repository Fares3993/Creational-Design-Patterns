package Notification;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser(String name)
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an SMS notification to "+name);
    }
}