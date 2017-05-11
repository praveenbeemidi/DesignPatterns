package frontcontrollerpackage;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {

		FrontController frontController=new FrontController();
		frontController.dispatchRequest("home");
		frontController.dispatchRequest("student");
		System.out.println("tested successfully");
	}

}
