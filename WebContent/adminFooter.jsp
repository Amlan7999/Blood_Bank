<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="col-md-4 footer-grids wow fadeInLeft animated" data-wow-delay=".5s">
				<h3 style="color:green;">About :</h3>
				<p style="color:black;">We make the process of online blood donation easy and secure to use.We help those who require blood and also those who want to help others by donating blood.Contact Us</p>
			</div>
			<div class="col-md-4 footer-grids wow fadeInRight animated" data-wow-delay=".5s">
				<h3 style="color:green;">Newsletter :</h3>
				<form action="#" method="post"> 
					<input type="email" name="Email" placeholder="Email" required="">
					<input type="submit" value="Submit" style="background-color: green;">
				</form>
			</div>
			<div class="col-md-4 footer-grids wow fadeInLeft animated" data-wow-delay=".5s">
				<h3 style="color:green;">Office Hours :</h3>
				<h5 style="color:black;"><b>Mon-Fri:</b> 10am-6pm </h5>
				<h5 style="color:black;"><b>Sat-Sun:</b> By Special Appointment</h5>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!-- //footer -->
	<!-- copy right -->
	<div class="footer-bottom">
		<div class="container"> 
			<p>© 2019 Lifeline . All rights reserved | <i style="color:red;" class="fa fa-heart" aria-hidden="true"></i> <a href="https://colorlib.com" target="_blank">BloodBank</a> </a></p>
		</div>
	</div>  
	<!-- //copy right -->
	<!-- animation --> 
	<script src="js/wow.min.js"></script>
	<script>
		 new WOW().init();
	</script>
	<!-- //animation --> 
	<!-- start-smooth-scrolling -->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>	
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
	<!-- //end-smooth-scrolling -->
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script> 
	<!-- //smooth-scrolling-of-move-up -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>