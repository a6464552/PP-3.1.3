//package ru.kata.spring.boot_security.demo.configs;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import ru.kata.spring.boot_security.demo.model.Role;
//import ru.kata.spring.boot_security.demo.model.User;
//import ru.kata.spring.boot_security.demo.repository.UserRepository;
//
//import javax.annotation.PostConstruct;
//import java.util.HashSet;
//
//@Component
//public class Init {
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public Init(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//
//    @PostConstruct
//    public void setInitData() {
//        Role userRole = new Role();
//        userRole.setName("ROLE_USER");
//        Role adminRole = new Role();
//        adminRole.setName("ROLE_ADMIN");
//        userRepository.saveRole(userRole);
//        userRepository.saveRole(adminRole);
//
//        User user = new User();
//        user.setUsername("user");
//        user.setLastName("Aev");
//        user.setAge(30);
//        user.setPassword("user");
//        user.setRoles(new HashSet<Role>() {{
//            add(userRole);
//        }});
//        userRepository.save(user);
//
//        User admin = new User();
//        admin.setUsername("admin");
//        admin.setLastName("Bev");
//        admin.setAge(35);
//        admin.setPassword("admin");
//        admin.setRoles(new HashSet<Role>() {{
//            add(userRole);
//            add(adminRole);
//        }});
//        userRepository.save(admin);
//    }
//}
