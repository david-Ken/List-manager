<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width initial-scale1.0" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <!-- css -->
    <link rel="stylesheet" href="css/fontawesome.css"/>
    <link rel="stylesheet" href="css/style.css" />
    <title>Registration</title>
</head>
<body>
<div class="container" id="container">
    <div class="form-container sign-up-container">
        <form action="#">
            <h1>Create Account</h1>
            <span>or use your email for registration</span>
            <input type="text" placeholder="Name" />
            <input type="email" placeholder="Email" />
            <input type="password" placeholder="Password" />
            <input type="password" placeholder="Confirm password" />
            <button>SignUp</button>
        </form>
    </div>

    <div class="form-container sign-in-container">
        <form action="#">
            <h1>Sign In</h1>
            <span>or use your account</span>
            <input type="email" placeholder="email" />
            <input type="password" placeholder="password" />
            <a href="#">Forgot your password ?</a>
            <button>Sign In</button>
        </form>
    </div>

    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>
                    To keep connected with us please login with your personal info
                </p>
                <button class="ghost" id="signIn">Sign In</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>Hello, Friend !</h1>
                <p>
                    Enter lists of things to do, courses, ideas .. in your
                    <b>list manager </b>
                </p>
                <button class="ghost" id="signUp">Sign Up</button>
            </div>
        </div>
    </div>
</div>

<script src="js/main.js"></script>
</body>
</html>
