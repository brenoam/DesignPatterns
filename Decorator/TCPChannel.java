class TCPChannel implements Channel{
	@Override
	public void send(String s){
		System.out.println("Enviando " + s + " via TCP");
	}
	
	@Override
	public void recv(){
		System.out.println("Recebendo dados via TCP");
	}
}