class BufferChannel extends ChannelDecorator{
	public BufferChannel(Channel channel){
		super(channel);
	}
	
	@Override
	public void send(String s){
		System.out.println("Inserindo arquivo no buffer para envio posterior");
		super.send(s);
	}
	
	@Override
	public void recv(){
		super.recv();
		System.out.println("Removendo arquivo recebido do buffer");
	}
}