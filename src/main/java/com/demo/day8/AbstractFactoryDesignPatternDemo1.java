package com.demo.day8;

public class AbstractFactoryDesignPatternDemo1 {

	public static void main(String[] args) {

		GUIFactory factory = new WindowsFactory();
		GUIFactory factory1 = new MacFactory();
		Application app = new Application(factory);
		app.render();

	}

}

// Abstract Products
interface Button {
	void paint();
}

interface Checkbox {
	void paint();
}

// Concrete Products (Windows)
class WindowsButton implements Button {
	public void paint() {
		System.out.println("Rendering Windows Button");
	}
}

class WindowsCheckbox implements Checkbox {
	public void paint() {
		System.out.println("Rendering Windows Checkbox");
	}
}

//Concrete Products (Mac)
class MacButton implements Button {
	public void paint() {
		System.out.println("Rendering Mac Button");
	}
}

class MacCheckbox implements Checkbox {
	public void paint() {
		System.out.println("Rendering Mac Checkbox");
	}
}

//ABstract Factory

interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}

//concrete Factory
class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}

	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}

class MacFactory implements GUIFactory {
	public Button createButton() {
		return new MacButton();
	}

	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}

class Application {
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void render() {
		button.paint();
		checkbox.paint();
	}
}

// Provide an interface to create families of related objects without specifying their concrete classes.
