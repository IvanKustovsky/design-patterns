// Subsystem 1: Projector
class Projector {
    public void on() {
        System.out.println("Projector is now ON.");
    }

    public void off() {
        System.out.println("Projector is now OFF.");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to " + input + ".");
    }
}

// Subsystem 2: Sound System
class SoundSystem {
    public void on() {
        System.out.println("Sound System is now ON.");
    }

    public void off() {
        System.out.println("Sound System is now OFF.");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level + ".");
    }
}

// Subsystem 3: Streaming Service
class StreamingService {
    public void connect() {
        System.out.println("Connecting to the streaming service...");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void disconnect() {
        System.out.println("Disconnected from the streaming service.");
    }
}

// Facade Class
class HomeTheaterFacade {
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final StreamingService streamingService;

    public HomeTheaterFacade(Projector projector, SoundSystem soundSystem, StreamingService streamingService) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.streamingService = streamingService;
    }

    public void watchMovie(String movie) {
        System.out.println("Starting movie setup...\n");

        projector.on();
        projector.setInput("Streaming Service");

        soundSystem.on();
        soundSystem.setVolume(20);

        streamingService.connect();
        streamingService.playMovie(movie);

        System.out.println("\nMovie setup complete. Enjoy your movie!");
    }

    public void endMovie() {
        System.out.println("\nShutting down the home theater system...\n");

        streamingService.disconnect();
        projector.off();
        soundSystem.off();

        System.out.println("Home theater system shut down successfully.");
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        StreamingService streamingService = new StreamingService();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, soundSystem, streamingService);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}