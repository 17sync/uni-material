
class TextMessage extends Message {
    
	public TextMessage(DeliveryChannel channel) {
        super(channel);
    }

    @Override
    public void sendMessage(String content) {
        String encoded = "[TEXT] " + content;
        channel.send(encoded);
    }
}
