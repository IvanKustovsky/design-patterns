// Component Interface
interface Notifier {
    void send(String message);
}

// Concrete Component
class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// Decorator Base Class
abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}

// Concrete Decorator 1: SMS Notifier
class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}

// Concrete Decorator 2: Slack Notifier
class SlackNotifier extends NotifierDecorator {
    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack Message: " + message);
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();

        // Wrapping with multiple decorators
        Notifier smsNotifier = new SMSNotifier(notifier);
        Notifier slackAndSmsNotifier = new SlackNotifier(smsNotifier);

        slackAndSmsNotifier.send("Hello World!");
    }
}