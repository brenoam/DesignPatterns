class Main{
	public static void main(String[] args) {
		Channel tcpChannel = new TCPChannel();
		Channel udpChannel = new UDPChannel();
		Channel zluChannel = new ZipChannel(new LogChannel(udpChannel));
		Channel bluChannel = new BufferChannel(new LogChannel(udpChannel));
		Channel bltChannel = new BufferChannel(new LogChannel(tcpChannel));
		Channel zbluChannel = new ZipChannel(new BufferChannel(new LogChannel(udpChannel)));
		Channel zbltChannel = new ZipChannel(new BufferChannel(new LogChannel(tcpChannel)));

		System.out.println(">> Zip Log UDP Channel");
		zluChannel.send("Test");
		zluChannel.recv();
		System.out.println("\n>> Buffer Log UDP Channel");
		bluChannel.send("Test");
		bluChannel.recv();
		System.out.println("\n>> Buffer Log TCP Channel");
		bltChannel.send("Test");
		bltChannel.recv();
		System.out.println("\n>> Zip Buffer Log UDP Channel");
		zbluChannel.send("Test");
		zbluChannel.recv();
		System.out.println("\n>> Zip Buffer Log TCP Channel");
		zbltChannel.send("Test");
		zbltChannel.recv();
	}
}