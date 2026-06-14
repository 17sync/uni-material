
class MobileDataChannel implements DeliveryChannel {
   
	public void send(String encodedMessage) {
        System.out.println("Sending via Mobile Data: " + encodedMessage);
    }
}