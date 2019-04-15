class UDPChannel implements Channel{
	@Override
	public void send(String s){
		System.out.println("Enviando " + s + " via UDP");
	}
	
	@Override
	public void recv(){
		System.out.println("Recebendo dados via UDP");
	}
}