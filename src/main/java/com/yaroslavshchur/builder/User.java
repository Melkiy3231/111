package main.java.com.yaroslavshchur.builder;

public class User {

    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    private User() {
    }

    public static Builder builder() {
        return new User().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setLogin(String login) {
            User.this.login = login;
            return this;
        }

        public Builder setPassword(String password) {
            User.this.password = password;
            return this;
        }

        public Builder setFirstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            User.this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            User.this.city = city;
            return this;
        }

        public User build() {
            return User.this;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
