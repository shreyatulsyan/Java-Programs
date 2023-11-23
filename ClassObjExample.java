class ClassObjExample {

	static ClassObjExample obj;

	public static void main(String [] args) {

		obj = new ClassObjExample();
		obj.printMessage("Hello Shreya is testing object creation.");
	}

	public void printMessage(String msg) {

		System.out.println(msg);
	}
}