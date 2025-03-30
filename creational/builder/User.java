public class User {

    // Required fields
    private final String firstName;
    private final String lastName;

    // Optional fields
    private final int age;
    private final String phone;
    private final String address;

    // Private constructor to enforce object creation through Builder
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters (no setters to make the object immutable)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName +
                ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
    }

    // Static inner Builder class
    public static class UserBuilder {

        // Required fields
        private final String firstName;
        private final String lastName;

        // Optional fields - initialized to default values
        private int age = 0;
        private String phone = "";
        private String address = "";

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        // Builds the final User object
        public User build() {
            return new User(this);
        }
    }
}

// Client code example
public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("John", "Doe")
                .age(30)
                .phone("123-456-7890")
                .address("123 Main St, Springfield")
                .build();

        System.out.println(user);
    }
}
