//package ch.bfh.jarchitects.filmbiblio.repository;
//
//import ch.bfh.jarchitects.filmbiblio.model.Userr;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserRepositoryTest
//{
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public static Userr user1;
//    public static Userr user2;
//    public static Userr user3;
//    public static Userr user4;
//
//    @BeforeClass
//    public static void createUser()
//    {
//        user1 = new Userr("John", "john@mail.com", "jjjjj");
//        user2 = new Userr("David", "david@mail.com", "ddddd");
//        user3 = new Userr("Peter", "peter@mail.com", "ppppp");
//        user4 = new Userr("KK", "john@mail.com", "jjjjj");
//    }
//
//    @Test
//    public void saveUser()
//    {
//        userRepository.save(user1);
//        userRepository.save(user2);
//        userRepository.save(user3);
//        userRepository.save(user4);
//
//    }
//
//    @Test
//    public void deleteUser()
//    {
//        userRepository.delete(user1);
//        userRepository.delete(user2);
//        userRepository.delete(user3);
//    }
//
//}
