class ZipChannel extends ChannelDecorator{
	public ZipChannel(Channel channel){
		super(channel);
	}
	
	@Override
	public void send(String s){
		System.out.println("Compactando arquivo");
		super.send(s);
	}
	
	@Override
	public void recv(){
		super.recv();
		System.out.println("Descompactando arquivo");
	}
}