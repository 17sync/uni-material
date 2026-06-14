
class WiFiChannel implements DeliveryChannel {
    
	public void send(String encodedMessage) {
        System.out.println("Sending via WiFi: " + encodedMessage);
    }
}