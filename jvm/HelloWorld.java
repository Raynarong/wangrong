public class HelloWorld {
	public native void displayHelloWorld();// java native方法申明

	static {
		System.loadLibrary("HelloWorldImpl");// 装入动态链接库，"HelloWorldImpl"是要装入的动态链接库名称。
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.displayHelloWorld();
	}
}