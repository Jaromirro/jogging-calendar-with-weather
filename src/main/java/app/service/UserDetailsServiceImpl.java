//package app.service;
//
//import app.dao.UserDao;
//import app.dto.LoginDto;
//import app.entity.User;
//import app.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByName(username);
//
//        Set< GrantedAuthority > grantedAuthorities = new HashSet< >();
//
//        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), grantedAuthorities);
//    }
//
//
//    }
