<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts4/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css4/style.css">
    <style type="text/css">
    body{
    background :url("images/ur.jpg");
    }
    </style>
</head>
<body>

    <div class="main">

        <section class="signup">
            <!-- <img src="images/ur.jpg" alt=""> -->
            <div class="container">
                <div class="signup-content">
                    <form method="post" action="blood.controller.RegisterUser" enctype="multipart/form-data" id="signup-form" class="signup-form">
                        <h2 class="form-title">Create account</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="name" id="name" placeholder="Your Name" required=""/>
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-input" name="age"  placeholder="Your Age" required=""/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="dateofbirth"  placeholder="Date of Birth" required=""/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="bloodgroup"  placeholder="Blood Group" required=""/>
                        </div>
                        <div class="form-group">
                           Gender:  <input type="radio"  name="gender" id="email" placeholder="Your Gender" value="Male"/>Male
                            <input type="radio"  name="gender"  placeholder="Your Gender" value="FeMale"/>FeMale
                            <input type="radio"  name="gender"  placeholder="Your Gender" value="Other"/>Other
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-input" name="height"  placeholder="Your Height" required=""/>
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-input" name="weight"  placeholder="Your Weight" required=""/>
                        </div>
                        <div class="form-group">
                            Category:  <select name="category">
                            	<option>Choose Category</option>
                            	<option value="Donor">Donor</option>
                            	<option value="Receiver">Receiver</option>
                            </select>
                        </div>
                        <div class="form-group">
                           Marital Status:  <input type="radio"  name="maritalstatus"  placeholder="Your Marital Status" value="Yes"/>Yes
                            <input type="radio"  name="maritalstatus"  placeholder="Your Marital Status" value="No"/>No
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="pastmedicalissuses" id="email" placeholder="Past Medical Issues(if any)"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="lastdonationdate" id="email" placeholder="Last Donation Date"/>
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-input" name="contactnumber" id="email" placeholder="Contact No" required=""/>
                        </div>
                   
                        <div class="form-group">
                            <input type="email" class="form-input" name="email" id="email" placeholder="Your Email" required=""/>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="password" id="password" placeholder="Password" required=""/>
                            <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                        </div>
                        
                        <div class="form-group">
                            <textarea name="address" style="height: 60px;width: 485px;" placeholder="Address" required=""></textarea>
                        </div>
                        <div class="form-group">
                           Photo: <input type="file" class="form-input" name="photo" id="email" placeholder="Your Photo"/>
                        </div>
                        
                        <div class="form-group">
                            <input type="submit"  class="form-submit" value="Sign up"/>
                        </div>
                    </form>
                    <p class="loginhere">
                        Have already an account ? <a href="userLogin.jsp" class="loginhere-link">Login here</a>
                    </p>
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor4/jquery/jquery.min.js"></script>
    <script src="js4/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>