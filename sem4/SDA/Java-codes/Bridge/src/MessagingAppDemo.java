
public class MessagingAppDemo {
    
	public static void main(String[] args) {
      
		Message msg1 = new TextMessage(new WiFiChannel());
        msg1.sendMessage("Hello from Usama!");

        Message msg2 = new ImageMessage(new MobileDataChannel());
        msg2.sendMessage("image123.png");

        Message msg3 = new TextMessage(new BluetoothChannel());
        msg3.sendMessage("Offline message");
    }
}
