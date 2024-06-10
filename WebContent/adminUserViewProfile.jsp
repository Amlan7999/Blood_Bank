<!doctype html>
<%@page import="blood.model.UsersDao"%>
<%@page import="blood.db.Users"%>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="icon" href="" type="image/png">
        <title>View Profile</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="Viewprofile/css/bootstrap.css">
        <link rel="stylesheet" href="Viewprofile/vendors/linericon/style.css">
        <link rel="stylesheet" href="Viewprofile/css/font-awesome.min.css">
        <link rel="stylesheet" href="Viewprofile/vendors/owl-carousel/owl.carousel.min.css">
        <link rel="stylesheet" href="Viewprofile/vendors/lightbox/simpleLightbox.css">
        <link rel="stylesheet" href="Viewprofile/vendors/nice-select/css/nice-select.css">
        <link rel="stylesheet" href="Viewprofile/vendors/animate-css/animate.css">
        <link rel="stylesheet" href="Viewprofile/vendors/popup/magnific-popup.css">
        <link rel="stylesheet" href="Viewprofile/vendors/flaticon/flaticon.css">
        <!-- main css -->
        <link rel="stylesheet" href="Viewprofile/css/style.css">
        <link rel="stylesheet" href="Viewprofile/css/responsive.css">
    </head>
    <body>
        
       <header class="header_area">
            <div class="main_menu">
            	<nav class="navbar navbar-expand-lg navbar-light">
					<div class="container box_1620">
						<!-- Brand and toggle get grouped for better mobile display -->
						<a class="navbar-brand logo_h" href="index.html"><img src="img/logo.png" alt=""></a>
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse offset" id="navbarSupportedContent">
							<ul class="nav navbar-nav menu_nav ml-auto">
								<li class="nav-item active"><a class="nav-link" href="userWelcome.jsp">Home</a></li> 
								<li class="nav-item"><a class="nav-link" href="about-us.html">Edit Profile</a></li> 
								<li class="nav-item"><a class="nav-link" href="userChangePassword.jsp">Change Password</a></li>
								<li class="nav-item"><a class="nav-link" href="userFeedback.jsp">Feedback</a></li>
								<li class="nav-item"><a class="nav-link" href="userLogin.jsp">Logout</a></li>
								
							
							</ul>
						</div> 
					</div>
            	</nav>
            </div>
        </header>
        <!--================Header Menu Area =================-->
        
        <!--================Home Banner Area =================-->
        <section class="home_banner_area">
           	<div class="container box_1620">
           		<div class="banner_inner d-flex align-items-center">
					<div class="banner_content">
						<div class="media">
						<%
						String emailid = request.getParameter("emailid");
					            Users u= new Users();
								u.setEmailid(emailid);
							    u= UsersDao.getDetails(u);
						%>
						
							<div class="d-flex">
							<%
							 
							     String photo =u.getPhoto();
							String p1 ="profileimg\\"+photo;
							if(photo!=null)
							{
								%>
								<img src="<%=p1 %>" alt=""	style="width: 500px;height: 600px;">
								<% 
								
							}
							else
							{
								%>
								<img src="profileimg/user.jpg" alt="">
								<%
							}
							%>
								
							</div>
							<div class="media-body">
								<div class="personal_text">
									<h6></h6>
									<h3><%=u.getName() %></h3>
									<ul class="list basic_info">
										
										<li><i ></i> Age: <%=u.getAge() %></li>
										<li><i ></i> DOB:<%=u.getDateofbirth() %></li>
										<li><i></i> Blood Group:<%=u.getBloodgroup() %></li>
										<li><i ></i> Gender: <%=u.getGender() %></a></li>
										<li><i ></i> Height: <%=u.getHeight() %></a></li>
										<li><i ></i> Weight:<%=u.getWeight() %></a></li>
										<li><i ></i> Category:<%=u.getCategory() %></li>
										<li><i ></i> Marital Status:<%=u.getMaritalstatus() %></li>
    									<li><i ></i> Past Medical Issues:<%=u.getPastmedicalissues() %></li>
										<li><i ></i> Last Donation date:<%=u.getLastdonationdate() %></li>
										<li><i ></i> Contact No:<%=u.getContactnumber() %></li>
										<li><i ></i> Email: <%=u.getEmailid() %></li>
										<li><i ></i> Address: <%=u.getAddress() %></li>
										
									</ul>
									
								</div>
							</div>
						</div>
					</div>
				</div>
            </div>
        </section>
        <!--================End Home Banner Area =================-->
        
       
        
        
        
        
        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="Viewprofile/js/jquery-3.3.1.min.js"></script>
        <script src="Viewprofile/js/popper.js"></script>
        <script src="Viewprofile/js/bootstrap.min.js"></script>
        <script src="Viewprofile/js/stellar.js"></script>
        <script src="Viewprofile/vendors/lightbox/simpleLightbox.min.js"></script>
        <script src="Viewprofile/vendors/nice-select/js/jquery.nice-select.min.js"></script>
        <script src="Viewprofile/vendors/isotope/imagesloaded.pkgd.min.js"></script>
        <script src="Viewprofile/vendors/isotope/isotope.pkgd.min.js"></script>
        <script src="Viewprofile/vendors/owl-carousel/owl.carousel.min.js"></script>
        <script src="Viewprofile/vendors/popup/jquery.magnific-popup.min.js"></script>
        <script src="Viewprofile/js/jquery.ajaxchimp.min.js"></script>
        <script src="Viewprofile/vendors/counter-up/jquery.waypoints.min.js"></script>
        <script src="Viewprofile/vendors/counter-up/jquery.counterup.min.js"></script>
        <script src="Viewprofile/js/mail-script.js"></script>
        <script src="Viewprofile/js/theme.js"></script>
    </body>
</html>