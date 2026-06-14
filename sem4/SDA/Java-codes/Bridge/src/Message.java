abstract class Message {
    
	protected DeliveryChannel channel;

    public Message(DeliveryChannel channel) 
    {
        this.channel = channel;
    }

    public abstract void sendMessage(String content);
}
