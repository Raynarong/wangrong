public class HelloWorld {
	public native void displayHelloWorld();// java native��������

	static {
		System.loadLibrary("HelloWorldImpl");// װ�붯̬���ӿ⣬"HelloWorldImpl"��Ҫװ��Ķ�̬���ӿ����ơ�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.displayHelloWorld();
	}
}