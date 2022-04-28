package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexNewController {

	@RequestMapping("/index-new")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("index-new");
        mav.addObject("message", "Spring MVC New");
        return mav;
    }
	
	/* 客户端跳转 */
	@RequestMapping("/jump")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView("redirect:/index-new");
        return mav;
    } 
	
	@RequestMapping("/indexInterceptor")
    public ModelAndView indexInterceptorOfSpringMVC(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("indexInterceptor");
        mav.addObject("message", "indexInterceptor");
        return mav;
    }
}
