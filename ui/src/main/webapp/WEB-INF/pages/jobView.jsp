
    <body>
    <header>
        
            <h1 style="display: inline-block;text-align:left; font-size:30px;font-family:arial;">QuickBucks</h1>
            <p href="" style = "float:right;display: inline-block;text-align:right; font-size:15px;font-family:arial;">Welcome, user!</p> 
            <br>
    </header>

    <section id="JobPosting" >
    <h2 style="text-align:center;">Job ID: ###</h2>
  
        <p>Job Title:</p> ${title}
        <p>Employer:</p> ${id}
        <p>Tags:</p> ${tags}
        <p>Description:</p> ${desc}
        
      
        <center>
        <form id="request"  onSubmit="pressSubmit()" style = "margin: 20px 15px 0 0;float:none;">
        <input type="submit" value="request">
        </form>
        <a href="">Back</a> 
        </center>
   
    </section>
    </body>
