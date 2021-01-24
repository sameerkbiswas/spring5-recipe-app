/**
 * 
 */
package spring5.recipe.app.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sameer
 * Created on Jan 24, 2021 11:20:29 PM
 */
@Controller
public class HomeController {
	
	@RequestMapping({"", "/", "/index"})
	public String getIndexPage(Model model) {
		// TODO 
		return "index";
	}
}
