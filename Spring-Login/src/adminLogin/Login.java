package adminLogin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.AdminDao;

  @Controller
     public class Login {
       @RequestMapping("/")
         public ModelAndView ALogin()
         {
          ModelAndView mv=new ModelAndView("ALogin");
          mv.addObject("msg","Admin login page");
          return mv;
         }
          
          @RequestMapping("/loginCheck")
          public ModelAndView loginCheck(HttpServletRequest request,HttpServletResponse response)
          {
        	 String u=request.getParameter("id");
        	 String p= request.getParameter("pass");
        	AdminDao obj=new AdminDao();
        	int x=obj.loginCheck(u,p);
        	 if(x==1)
        	 {
           ModelAndView mv=new ModelAndView("Home");
           mv.addObject("msg","Login success...");
           return mv;
        	 }
        	 else
        	 {
        		 ModelAndView mv=new ModelAndView("ALogin");
                 mv.addObject("m","Login failed...");
                 return mv;    
        	 }
          }
          
          
          @RequestMapping("/empInsert")
          public ModelAndView empInsert()
          {
           ModelAndView mv=new ModelAndView("empInsert");
           mv.addObject("msg","Insert Employe data");
           return mv;
          }
          
          @RequestMapping("/insert")
          public ModelAndView Insert(HttpServletRequest request,HttpServletResponse response)
          {
        	  String name=request.getParameter("name");
              String add= request.getParameter("add");
              String salary= request.getParameter("sal");
           	     	
              AdminDao obj=new AdminDao();
          	int x=obj.inset(name,add,salary);
     	 if(x==1)
     	 {
        ModelAndView mv=new ModelAndView("empInsert");
        mv.addObject("msg","Data insertrd....");
        return mv;
     	 }
     	 else
     	 {
     		 ModelAndView mv=new ModelAndView("empInsert");
              mv.addObject("m","Data insert failed");
              return mv;    
     	 }
          
          }        
}
