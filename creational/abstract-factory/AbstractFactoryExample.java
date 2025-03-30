// Product Interfaces
public interface Button {
    void render();
}

public interface Checkbox {
    void render();
}

// Concrete Products for Windows
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button.");
    }
}

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox.");
    }
}

// Concrete Products for MacOS
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering MacOS Button.");
    }
}

public class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering MacOS Checkbox.");
    }
}

// Abstract Factory Interface
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factories for Windows
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Concrete Factories for MacOS
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

// Client Code
public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String osType = "mac"; // Could be dynamically determined

        if ("windows".equalsIgnoreCase(osType)) {
            factory = new WindowsFactory();
        } else if ("mac".equalsIgnoreCase(osType)) {
            factory = new MacOSFactory();
        } else {
            throw new IllegalArgumentException("Unknown OS type: " + osType);
        }

        Application app = new Application(factory);
        app.render();
    }
}
