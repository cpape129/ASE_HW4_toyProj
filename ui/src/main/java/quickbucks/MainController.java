package quickbucks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import quickbucks.User;
import quickbucks.UserRepository;
import java.lang.Long;

@Controller    // This means that this class is a Controller
//@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired
	private JobRepository jobRepository;
	
	@GetMapping(path="/demo/postJob") // Map ONLY GET Requests
	public String addNewJob (@RequestParam String jobtitle
			, @RequestParam String jobdesc, String category, String pay) {
		// @RequestParam means it is a parameter from the GET or POST request
		//@TODO: add tags (how are they input in form) and date
		//@TODO: add authentication and get current user so they
		//can be attached to the form. 
		
		Job j = new Job();
		j.setUser(1); //hardcode for now
		j.setJobTitle(jobtitle);
		j.setJobDescription(jobdesc);
		j.setCategory(category);
		j.setPay(0.0);
/*		try{
			double payrate = Double.parseDouble(pay);

		}
		catch(NumberFormatException e){}
		*/
		
		//j.setStatus(0); //jobs are created as 'open'
		
		//set tags, date
		jobRepository.save(j);
		return "redirect:/index2.html";
	}
/*	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("viewJob", "view", new Lookup());
    }
 
    @RequestMapping(value = "/viewJob", method = RequestMethod.POST)
    public String submit(@ModelAttribute("view")Lookup id, 
      Model model) {
		Long temp = new Long(id.getID());
		Job j = JobRepository.findOne(temp);
        model.addAttribute("title", j.getJobTitle());
        model.addAttribute("id", id);
		model.addAttribute("desc", j.getJobDescription());
		model.addAttribute("tags", j.getCategory());
        return "jobView";
    } 
	*/
	@GetMapping(path="/demo/alljob")
	public @ResponseBody Iterable<Job> getAllJobs() {
		return jobRepository.findAll();
	}

}





