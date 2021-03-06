<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Van Nhat Khong">
    <link type="text/css" rel="shortcut icon" href="images/favicon.ico"/>
    <title>Lab10 - Part 2</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/custom.css" rel="stylesheet">
</head>

<body cz-shortcut-listen="true">
<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4 nav_style">
    <a class="navbar-brand" href="#">CS472-WAP ::: Lab10</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="helloServlet">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contact Us</a>
            </li>
        </ul>
        <form class="form-inline mt-2 mt-md-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0 btn_search" type="submit">Search</button>
        </form>
    </div>
</nav>

<main role="main" class="container">
    <div style="padding-top: 1em;" class="container">
        <h5>Customer Contact Form</h5>
        <div class="col-md-12">errorMessage
        </div>
        <form id="contactUsForm" method="post" action="processData">
            <fieldset>
                <legend></legend>
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <label for="fullName">*Name:</label>
                            <input class="form-control" type="text" name="fullName" id="fullName" placeholder="Full Name" autofocus>
                            <small class="form-text text-muted">Enter your fullname</small>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <label>*Gender:</label><br>
                        <div class="form-group">
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio" name="radioGender" id="radioGenderMale" class="custom-control-input" value="Male">
                                <label for="radioGenderMale" class="custom-control-label">Male</label>
                            </div>
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio" name="radioGender" id="radioGenderFemale" class="custom-control-input" value="Female">
                                <label for="radioGenderFemale" class="custom-control-label">Female</label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <label for="category">*Category:</label>
                            <select class="form-control" id="category" name="category">
                                <option value="">Select...</option>
                                <option value="Feedback">Feedback</option>
                                <option value="Inquiry">Inquiry</option>
                                <option value="Complaint">Complaint</option>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <label for="message">*Message:</label>
                            <textarea class="form-control" id="message" name="message" rows="2"></textarea>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <div style="text-align: right;" class="form-group">
                            <button style="padding: .5em 4em;" id="btnSubmit" type="submit" class="btn btn-primary btn-inline submit_btn form-control">Submit</button>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-6">
                        <span>Hit count for the page: </span><span><span>" + this.getServletContext().getAttribute("hitCount") + "</span></span>
                    </div>
                    <div class="col-md-6">
                        <span class="span_style">request.getServletContext().getAttribute("totalHitCount")</span><span class="span_style">Total Hit count for the entire WebApp: </span>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>
</main>

<footer>
    <div>
        <span style="margin-left: 1em;">Van Nhat Khong ::: CS472-WAP</span>
        <span style="float: right;margin-right: 1em;">&copy; May 2020</span>
    </div>
</footer>

<script src="js/jquery-3.2.1.slim.min.js.download" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
<script src="js/popper.min.js.download"></script>
<script src="js/bootstrap.min.js"></script>
</body></html>