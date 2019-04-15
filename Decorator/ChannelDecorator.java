abstract class ChannelDecorator implements Channel{
	private Channel channel;
	
	public ChannelDecorator(Channel channel){
		this.channel = channel;
	}
	
	@Override
	public void send(String s){
		channel.send(s);
	}
	
	@Override
	public void recv(){
		channel.recv();
	}
}