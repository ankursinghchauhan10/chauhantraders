<%-- 
    Document   : copy
    Created on : 24 May, 2015, 8:57:52 PM
    Author     : ANKUR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
  <title>Feedback</title>
  <meta name="description" content="free website template" />
  <meta name="keywords" content="enter your keywords here" />
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=9" />
  <link rel="stylesheet" type="text/css" href="../css/style.css" />
  <script type="text/javascript" src="../js/jquery.min.js"></script>
  <script type="text/javascript" src="../js/image_slide.js"></script>
  <script type="text/javascript" src="../js/form.js"></script>
  <script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyBhaNI1P7olfdO4PJNzqxanarTsTfN-6LY&sensor=false">
</script>

<script>

    function saveFeedback(){
        var name=document.getElementById("name");
        var mobile=document.getElementById("mobile");
        var email=document.getElementById("email");
        var msg=document.getElementById("msg");
        
        if(isAlphabet(name,"Please Enter only Alphabets for name")){
            if(isNumeric(mobile,"Please enter only numbers") && isMobile(mobile,"Please Enter only 10 digits")){
                if(!email.value.length==0){
                    if(emailValidator(email,"Enter valid Email")){
                        if(notEmpty(msg,"Message box can not be empty")){
                            return true;
                        }
                    }
                }else{
                    if(notEmpty(msg,"Message box can not be empty")){
                            return true;
                    }
                }
            }
        }
        return false;
    }
    
    
    function hide(){
        
        setTimeout(remove,5000);
    }
    
    function remove(){
        
        $("p#thank").remove();
    }
</script>
</head>

<body onload="hide();">
  <div id="main">
    <div id="header">
	  <div id="banner">
	    <div id="welcome">
                <font size="4"><h1><span>Chauhan</span> Traders</h1></font>
	    </div><!--close welcome-->
	    <div id="welcome_slogan">
	      <!--<h1>Your Company Slogan Here</h1>-->
	    </div><!--close welcome_slogan-->
	  </div><!--close banner-->
    </div><!--close header-->

	<div id="menubar">
      <ul id="menu">
          <li><a href="Home.jsp">Home</a></li>
          <li><a href="Aboutus.jsp">Our Work</a></li>
          <li><a href="Testimonials.jsp">Testimonials</a></li>
          <li><a href="Rate.jsp">Rate List</a></li>
          <li><a href="Contact.jsp">Contact Us</a></li>
          <li class="current"><a href="Feedback.jsp">Feedback</a></li>
      </ul>
    </div><!--close menubar-->	
    
	<div id="site_content">		

	  <div class="sidebar_container">       
		<div class="sidebar">
          <div class="sidebar_item">
            <h2>New Website</h2>
            <p>Welcome to our new website. Please have a look around, any feedback is much appreciated.</p>
          </div><!--close sidebar_item--> 
        </div><!--close sidebar-->     		
<!--		<div class="sidebar">
          <div class="sidebar_item">
            <h2>Latest Update</h2>
            <h3>December 2012</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim.</p>         
		  </div>close sidebar_item 
        </div>close sidebar
		<div class="sidebar">
          <div class="sidebar_item">
            <h3>November 2012</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim.</p>         
		  </div>close sidebar_item 
        </div>close sidebar  
		<div class="sidebar">
          <div class="sidebar_item">
            <h3>October 2012</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim.</p>         
		  </div>close sidebar_item 
        </div>close sidebar  		-->
        <div class="sidebar">
          <div class="sidebar_item">
            <h2>Contact</h2>
            <p>Phone: +91 8181801470</p>
            <p>Phone: +91 9452017685</p>
            <p>Email:<a href="mailto:chauhantraders999@gmail.com">chauhantraders999@gmail.com</a></p>
          </div><!--close sidebar_item--> 
        </div>
<div class="sidebar">
          <div class="sidebar_item">
            <h2>Why to use ply shuttering</h2>
            <b><ul>
                    <li>Laminated waterproof shuttering does not require plaster after casting.</li>
                    <li>Less costly (as it does not require soil, other building materials for plaster).</li>
                    <li>Long lasting life.</li>
                    <li>Smooth and plane surface.</li>
                    <li>Very negligible or no wastage of material.</li>
                </ul></b>
          </div><!--close sidebar_item--> 
        </div><!--close sidebar-->
       </div><!--close sidebar_container-->	
	
      <ul class="slideshow">
          <li class="show"><img width="680" height="250" src="../images/testimonial1.jpg" alt="&quot;Feedback&quot;" /></li>
          <li><img width="680" height="250" src="../images/feedback.jpg" alt="&quot;Feedback&quot;" /></li>
      </ul>   	 
	 
	  <div id="content">
        <div class="content_item">
		  
            <br>
		  <div class="form_settings">
            
                      <h1>Feedback</h1>
			<p>&nbsp;</p>
                        <%String msg=request.getParameter("msg");
                        if(msg!=null){
                            %>
                            <center>  <p style="font-size: 20px;" id="thank"><%=msg%></p></center>
                        <%
                        }
                        %>
                        <form method="get"   action="../SaveFeedback" onsubmit="return saveFeedback();">
			<p><span>Name</span><input id="name" name="name" type="text" placeholder="Your Name" value="" /></p><br>
                        <p><span>Mobile No.</span><input id="mobile" type="text" name="mobile" placeholder="Your Mobile No." value="" /></p><br>
			<p><span>Email Address</span><input id="email" name="email" type="text" placeholder="Your Email" value="" /></p><br>
			<p><span>Message</span><textarea id="msg" name="msg" rows="8" cols="50" placeholder="Your Message"></textarea></p>
            
                        <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="contact_submitted" value="Send" /></p>
          </form>
                  </div><!--close form_settings-->
          
              
          
<!--		  <div class="content_container">
		    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim. Aliquam facilisis neque non nunc posuere eget volutpat metus tincidunt.</p>
		  	<div class="button_small">
		      <a href="#">Read more</a>
		    </div>close button_small
		  </div>close content_container
          <div class="content_container">
		    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim. Aliquam facilisis neque non nunc posuere eget volutpat metus tincidunt.</p>          
		  	<div class="button_small">
		      <a href="#">Read more</a>
		    </div>close button_small		  
		  </div>close content_container			  -->
		</div><!--close content_item-->
      </div><!--close content-->   
	</div><!--close site_content--> 
    
	<div id="content_grey">
            <div id="footer">
                <a href="Home.jsp">copyright &COPY; chauhantraders.com</a>
            </div><!--close footer-->  
<!--	  <div class="content_grey_container_box">
		<h4>Latest Blog Post</h4>
	    <p> Phasellus laoreet feugiat risus. Ut tincidunt, ante vel fermentum iaculis.</p>
		<div class="readmore">
		  <a href="#">Read more</a>
		</div>close readmore
	  </div>close content_grey_container_box
      <div class="content_grey_container_box">
       <h4>Latest News</h4>
	    <p> Phasellus laoreet feugiat risus. Ut tincidunt, ante vel fermentum iaculis.</p>
	    <div class="readmore">
		  <a href="#">Read more</a>
		</div>close readmore
	  </div>close content_grey_container_box
      <div class="content_grey_container_boxl">
		<h4>Latest Projects</h4>
	    <p> Phasellus laoreet feugiat risus. Ut tincidunt, ante vel fermentum iaculis.</p>
	    <div class="readmore">
		  <a href="#">Read more</a>
		</div>close readmore	  
	  </div>close content_grey_container_box1      -->
	  <br style="clear:both"/>
    </div><!--close content_grey-->   
 
  </div><!--close main-->
  
  
  
</body>
</html>
