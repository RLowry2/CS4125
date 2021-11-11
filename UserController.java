package com.springbootattempt.springbootattempt1;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class UserController {
   
    @Autowired
    UserRepository userRepository;
 
    @Autowired
    BookRepository bookRepository;
 
    @RequestMapping("/user/{id}")
    public String user(@PathVariable Long id, Model model) {
        model.addAttribute("user", userRepository.findOne(id));
        model.addAttribute("books", bookRepository.findAll());
        return "user";
    }
 
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public String usersList(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }
 
    @RequestMapping(value="/users", method=RequestMethod.POST)
    public String usersAdd(@RequestParam String email, @RequestParam String firstName, @RequestParam String lastName, Model model) {
        User newUser = new User();
        newUser.setEmail(email);
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        repository.save(newUser);
 
        model.addAttribute("user", newUser);
        model.addAttribute("books", bookRepository.findAll());
        return "redirect:/user/" + newUser.getId();
    }
 
    @RequestMapping(value="/user/{id}/books", method=RequestMethod.POST)
    public String usersAddBook(@PathVariable Long id, @RequestParam Long bookId, Model model) {
        Book book = bookRepository.findOne(bookId);
        User user = (User) userRepository.findOne(id);
 
        if (user != null) {
            if (!user.hasBook(book)) {
                user.getBooks().add(book);
            }
            userRepository.save(user);
            model.addAttribute("user", userRepository.findOne(id));
            model.addAttribute("books", bookRepository.findAll());
            return "redirect:/user/" + user.getId();
        }
 
        model.addAttribute("users", userRepository.findAll());
        return "redirect:/users";
    }
}
