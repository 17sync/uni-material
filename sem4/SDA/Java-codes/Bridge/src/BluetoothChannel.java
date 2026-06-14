
class BluetoothChannel implements DeliveryChannel {
   
	public void send(String encodedMessage) {
        System.out.println("Sending via Bluetooth: " + encodedMessage);
    }
}