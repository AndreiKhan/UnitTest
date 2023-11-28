package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class UserTest {
    UserRepository userRepository;
    User user1;
    User user2;
    User user3;
    User user4;
    User user5;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        user1 = new User();
        user2 = new User();
        user3 = new User("admin1", "admin1");   // admin
        user4 = new User();
        user5 = new User("admin2", "admin2");   // admin
    }

    @Test
    void userAutTrue() {
        user1.authenticate("login", "password");
        assertThat(user1.aut).isTrue();
    }

    @Test
    void userAutFalse() {
        user1.authenticate("123", "123");
        assertThat(user1.aut).isFalse();
    }

    @Test
    void userIsOnline() {
        user1.authenticate("login", "password");
        userRepository.addUser(user1);
        assertThat(userRepository.data.contains(user1)).isTrue();
    }

    @Test
    void userIsOffline() {
        user1.authenticate("123", "123");
        userRepository.addUser(user1);
        assertThat(userRepository.data.contains(user1)).isFalse();
    }

    @Test
    void logOutUsers() {
        user1.authenticate("login", "password");
        user2.authenticate("login", "password");
        user3.authenticate("admin1", "admin1");
        user4.authenticate("login", "password");
        user5.authenticate("admin2", "admin2");

        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.addUser(user4);
        userRepository.addUser(user5);

        userRepository.logOutUsers();

        assertThat(user1.aut).isFalse();
        assertThat(user2.aut).isFalse();
        assertThat(user3.aut).isTrue(); // admin
        assertThat(user4.aut).isFalse();
        assertThat(user5.aut).isTrue(); // admin
    }
}