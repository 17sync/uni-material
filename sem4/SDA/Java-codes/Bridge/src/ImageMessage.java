
class ImageMessage extends Message {
    
	public ImageMessage(DeliveryChannel channel) {
        super(channel);
    }

    @Override
    public void sendMessage(String content) {
        String encoded = "[IMAGE] " + content;
        channel.send(encoded);
    }
}
