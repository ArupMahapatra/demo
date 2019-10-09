package com.example.demo.controller;

import com.example.demo.pojo.*;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Repository.EmpRepositary;
import com.example.demo.Repository.RegisRepositary;

@Controller
public class regiscontroller {
	Employe a;
	@Autowired
	RegisRepositary regisRepository;
	
	@Autowired
	EmpRepositary empp;
	
	@RequestMapping("/")
	public String abc()
	{
		return "Register";
	}
 @RequestMapping(value="/register",method= RequestMethod.POST)
 public  String store(@ModelAttribute User u)
 {
	 regisRepository.save(u);
	 return "Login";
 }
 @RequestMapping("/login")
 public  String login()
 {
	 return  "Login";
 }
 @PostMapping("/xyz")
 public String logins(@ModelAttribute User u,Model m)
 {
	User uu=regisRepository.findByNameAndPassword(u.getName(),u.getPassword());
			if(uu==null)
			{
				m.addAttribute("msg","login failed");
				return "Register";
				}
			else
			{
				m.addAttribute("msg", "login successful");
				return "Home";
			}
				
 }
 @PostMapping("/hom")
 public String bb()
 {
	 return "Home";
 }
 @RequestMapping("/addd")
 public String abcd()
 {
	 return "Add";
 }
 @PostMapping(value="/add")
 public  String dd(@ModelAttribute Employe e)
 {
	 empp.save(e);
	 return "views";
 }
 @RequestMapping(value="/view")
 public String vie(@ModelAttribute Employe e,Model m)
 {
	 List<Employe> l=empp.findAll();
	 m.addAttribute("obj",l);

	 return "views";
 }
 @RequestMapping(value="/edit/{id}")
 public String edi(@PathVariable int id,Model m) 
 {
	 a=null;
	 Optional<Employe> e=empp.findById(id);
	 e.ifPresent(aa->{
		  System.out.println(aa.getName());
		  a=aa;
		  m.addAttribute("obj", aa);
	  });
	 return "Edit";
 }
	
 
	
	  @RequestMapping(value="/edit/edit/{id}") 
	  public String edit(@ModelAttribute
	  Employe em,@PathVariable int id,Model m) 
	  {
	a=null; 
	Optional<Employe> mm=empp.findById(id); 
	mm.ifPresent(aa->{ System.out.println(aa.getName());
	  a=aa; });
	  
	  a.setEmail(em.getEmail()); 
	  a.setGen(em.getGen()); 
	  a.setName(em.getName());
	  a.setPh(em.getPh()); 
	  empp.save(a); 
	  return "redirect:/view"; 
	  }
	  @RequestMapping(value="/delete/{id}")
	  public String delete(@PathVariable int id,Model m)
	  {
		  empp.deleteById(id);
		  m.addAttribute("msg1","delete successfully");
		  return "redirect:/view";
	  }
	  
	  @RequestMapping("logout")
      public String logou(@ModelAttribute User u,HttpSession s)
	  {
		  return "Login";
	  }
	  
}
