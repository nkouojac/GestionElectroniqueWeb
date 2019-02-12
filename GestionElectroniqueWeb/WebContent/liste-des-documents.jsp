<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>liste des documents : Gestion Electronique des Documents</title>
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,500,700|Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="css/styles-merged.css">
    <link rel="stylesheet" href="css/style.min.css">
    <link rel="stylesheet" href="css/custom.css">

    <!--[if lt IE 9]>
      <script src="js/vendor/html5shiv.min.js"></script>
      <script src="js/vendor/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>

    <div class="probootstrap-search" id="probootstrap-search">
      <a href="#" class="probootstrap-close js-probootstrap-close"><i class="icon-cross"></i></a>
      <form action="#">
        <input type="search" name="s" id="search" placeholder="Search a keyword and hit enter...">
      </form>
    </div>
    
    <div class="probootstrap-page-wrapper">
      <!-- Fixed navbar -->
      
      <div class="probootstrap-header-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-9 col-md-9 col-sm-9 probootstrap-top-quick-contact-info">
              <span><i class="icon-location2"></i>Bp: 400 Yaoundé-Cameroun</span>
              <span><i class="icon-phone2"></i>+237 696487485</span>
              <span><i class="icon-mail"></i>jacqueline.nkouotou@gmail.com</span>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3 probootstrap-top-social">
              <ul>
                <li><a href="#"><i class="icon-twitter"></i></a></li>
                <li><a href="#"><i class="icon-facebook2"></i></a></li>
                <li><a href="#"><i class="icon-instagram2"></i></a></li>
                <li><a href="#"><i class="icon-youtube"></i></a></li>
                <li><a href="#" class="probootstrap-search-icon js-probootstrap-search"><i class="icon-search"></i></a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <nav class="navbar navbar-default probootstrap-navbar">
        <div class="container">
          <div class="navbar-header">
            <div class="btn-more js-btn-more visible-xs">
              <a href="#"><i class="icon-dots-three-vertical "></i></a>
            </div>
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html" title="uiCookies:Gestion Lycee">Gestion Lycee</a>
          </div>

          <%@ include file="menu.jsp" %>
        </div>
      </nav>
      
      <section class="probootstrap-section probootstrap-section-colored">
        <div class="container">
          <div class="row">
            <div class="col-md-12 text-left section-heading probootstrap-animate">
              <h1>Liste des documents</h1>
            </div>
          </div>
        </div>
      </section>

      <section class="probootstrap-section">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <div class="probootstrap-flex-block">
                
              </div>
            </div>
          </div>
        </div>
      </section>


      
      
      <section class="probootstrap-section">
        <div class="container">
         
         <%
         //recuperation de la liste des documents  dans la session
         java .util.List<cm.objis.gestionelectroniquedesdocuments.domaine.Document>ListDocument
         =(java.util.List<cm.objis.gestionelectroniquedesdocuments.domaine.Document>)
         session.getAttribute("ListDocument");
         //affichage de la liste des documents bootstrap
         int nbreDocument = 0 ;
         int j=0;
         for (cm.objis.gestionelectroniquedesdocuments.domaine.Document document : ListDocument){
        	 nbreDocument++;
        	 j++;
        	 if (nbreDocument ==1){
        		 out.println("<div class=\"row\">");
        	 }
        	 
        	   out.println("<div class=\"col-md-3 col-sm-6\">"+
               "<div class=\"probootstrap-teacher text-center probootstrap-animate\">"+
                 "<figure class=\"media\">"+
                   "<img src=\"img/person_1.jpg\" alt=\"Free Bootstrap Template by uicookies.com\" class=\"img-responsive\">"+
                " </figure>"+
                " <div class=\"text\">"+
                  " <h3>"+document.getNomDuDocument()+" "+document.getObjet()+"</h3>"+
                  " <p>"+document.getAuteur()+" "+document.getDestinataire()+"</p>"+
                  " <p>"+document.getRefference()+" "+document.getNombrePiecesJointes()+"</p>"+
                  " <p>"+document.getDateRedaction()+
                   "<ul class=\"probootstrap-footer-social\">"+
                   "  <li class=\"twitter\"><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>"+
                   "  <li class=\"facebook\"><a href=\"#\"><i class=\"icon-facebook2\"></i></a></li>"+
                    " <li class=\"instagram\"><a href=\"#\"><i class=\"icon-instagram2\"></i></a></li>"+
                     "<li class=\"google-plus\"><a href=\"#\"><i class=\"icon-google-plus\"></i></a></li>"+
                  " </ul>"+
                " </div>"+
              " </div>"+
             "</div>");
        	 
        	 if ((nbreDocument== 1)||(j==ListDocument.size())){
        		 out.println("</div>");
        		 nbreDocument= 1;
        	 }
        	 
         }
         
         
         %> 

      
        </div>
      </section>
      
      <section class="probootstrap-cta">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <h2 class="probootstrap-animate" data-animate-effect="fadeInRight">Get your admission now!</h2>
              <a href="#" role="button" class="btn btn-primary btn-lg btn-ghost probootstrap-animate" data-animate-effect="fadeInLeft">Enroll</a>
            </div>
          </div>
        </div>
      </section>
      <footer class="probootstrap-footer probootstrap-bg">
        <div class="container">
          <div class="row">
            <div class="col-md-4">
              <div class="probootstrap-footer-widget">
                <h3>A Propos De Notre Application GEDP </h3>
               <!-- <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Porro provident suscipit natus a cupiditate ab minus illum quaerat maxime inventore Ea consequatur consectetur hic provident dolor ab aliquam eveniet alias</p>-->
                <h3>Personnel</h3>
                <ul class="probootstrap-footer-social">
                  <li><a href="#"><i class="icon-twitter"></i></a></li>
                  <li><a href="#"><i class="icon-facebook"></i></a></li>
                  <li><a href="#"><i class="icon-github"></i></a></li>
                  <li><a href="#"><i class="icon-dribbble"></i></a></li>
                  <li><a href="#"><i class="icon-linkedin"></i></a></li>
                  <li><a href="#"><i class="icon-youtube"></i></a></li>
                </ul>
              </div>
            </div>
            <div class="col-md-3 col-md-push-1">
              <div class="probootstrap-footer-widget">
                <h3>Liens</h3>
                <ul>
                  <li><a href="#">Accueil</a></li>
                  <li><a href="#">Gestion-document</a></li>
                  <li><a href="#">Contact</a></li>
                  <li><a href="#">liste-des-documents</a></li>
                </ul>
              </div>
            </div>
            <div class="col-md-4">
              <div class="probootstrap-footer-widget">
                <h3>Contact Info</h3>
                <ul class="probootstrap-contact-info">
                  <li><i class="icon-location2"></i> <span>Bp: 400 Yaoundé-Messa-Cameroun</span></li>
                  <li><i class="icon-mail"></i><span>jacqueline.nkouotou@gmail.com</span></li>
                  <li><i class="icon-phone2"></i><span>+237 696487485</span></li>
                </ul>
              </div>
            </div>
           
          </div>
          <!-- END row -->
          
        </div>

        <div class="probootstrap-copyright">
          <div class="container">
            <div class="row">
              <div class="col-md-8 text-left">
                <p>&copy; 2018 <a href="https://uicookies.com/">Copyright</a>. All Rights Reserved. Designed &amp; Developed with <i class="icon icon-heart"></i> by <a href="https://uicookies.com/">Flaubert</a></p>
              </div>
              <div class="col-md-4 probootstrap-back-to-top">
                <p><a href="#" class="js-backtotop">Back to top <i class="icon-arrow-long-up"></i></a></p>
              </div>
            </div>
          </div>
        </div>
      </footer>

    </div>
    <!-- END wrapper -->
    

    <script src="js/scripts.min.js"></script>
    <script src="js/main.min.js"></script>
    <script src="js/custom.js"></script>

  </body>
</html>