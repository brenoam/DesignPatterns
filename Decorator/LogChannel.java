class LogChannel extends ChannelDecorator{
	public LogChannel(Channel channel){
		super(channel);
	}
	
	@Override
	public void send(String s){
		System.out.println("Inserindo informações de envio no log");
		super.send(s);
	}
	
	@Override
	public void recv(){
		super.recv();
		System.out.println("Inserindo informações de recebimento no log");
	}
}