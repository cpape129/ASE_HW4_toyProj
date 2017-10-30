package quickbucks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
//import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Job {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id; //naming convention this must be id and not userID

    private Integer userID;
    
    private String jobtitle;
    private Double payrate;
    private String jobdesc;
    private String category; //enum? table lookup?
    /*
    private Integer userID;
    private String title;
    private String description;
    //private List<String> tags;
    private Integer status;
    private Date jobDate;*/
    
    //jobtitle, payrate, jobdesc, category
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser() {
		return userID;
	}
	public void setUser(Integer id) {
		this.userID = id;
	}
	public String getJobTitle() {
		return jobtitle;
	}
	public void setJobTitle(String title) {
		this.jobtitle = title;
	}
	public String getJobDescription() {
		return jobdesc;
	}
	public void setJobDescription(String description) {
		this.jobdesc = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPay(double pay){
		this.payrate = pay;
	}
	public double getPay(){
		return this.payrate;
	}
	
	
	/*public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getJobDate() {
		return jobDate;
	}
	public void setJobDate(Date jobDate) {
		this.jobDate = jobDate;
	}*/
    
}