/**
 * 
 */
package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SessionController {

	/* 使用SESSION */
	@RequestMapping("/check-session")
    public ModelAndView checkSession(HttpSession session) {
		Integer i = (Integer) session.getAttribute("count");
        if (i == null)
            i = 0;
        i++;
        session.setAttribute("count", i);
        ModelAndView mav = new ModelAndView("checkSession");
        return mav;
    } 
	
	/* 清空SESSION, 并跳转到check-session */
	@RequestMapping("/clear-session")
    public ModelAndView clearSession(HttpSession session) {
        session.setAttribute("count", 0);
        ModelAndView mav = new ModelAndView("redirect:check-session");
        return mav;
    } 
}
