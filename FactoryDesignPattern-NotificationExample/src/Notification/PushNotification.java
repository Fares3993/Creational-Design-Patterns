package Notification;

public class PushNotification implements Notification {

    protected PushNotification(){

    }
    @Override
    public void notifyUser(String name)
    {
        // TODO Auto-generated method stub
        System.out.println("Sending a push notification to "+name);
    }
}