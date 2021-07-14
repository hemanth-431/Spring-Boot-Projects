package com.user.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.user.VO.ResponseTemplateVO;
import com.user.user.entity.User;
import com.user.user.service.UserService;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {

	 @Autowired
	    private UserService userService;

	    @PostMapping("/")
	    public User saveUser(@RequestBody User user) {
	      
	        return userService.saveUser(user);
	    }

	    @GetMapping("/all")
	    public ResponseEntity<List<User>> getAllDepartments(){
			List<User> user=userService.findAllUsers();
			return new ResponseEntity<>(user,HttpStatus.OK);
		}
	    
	    @GetMapping("/{id}")
	    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
	     //   log.info("Inside getUserWithDepartment of UserController");
	        return userService.getUserWithDepartment(userId);
	    }
	    
	    @PutMapping("/update")
	    public ResponseEntity<User> updateUser(@RequestBody User user){
	    	User u=userService.updateUser(user);
	    	return new ResponseEntity<>(u,HttpStatus.OK);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<?> delete(@PathVariable("id") Long id){
	        userService.deleteUser(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	    
	    
	
}
