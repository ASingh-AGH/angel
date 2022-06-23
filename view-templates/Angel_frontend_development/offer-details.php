<?php include_once("phplib.php"); ?>

<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>cla</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
   </head>
   <body class="main-layout">
      <!-- loader  -->
      <div class="loader_bg">
         <div class="loader"><img src="images/loading.gif" alt="#" /></div>
      </div>
      <!-- end loader -->
      <!-- header -->
      <header>
         <!-- header inner -->
         <div class="header">
            <div class="container-fluid">
               <div class="row">
                  <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                     <div class="full">
                        <div class="center-desk">
                           <div class="logo">
                              <a href="index.html"><img src="images/angel_logo.png" alt="#" /></a>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                     <nav class="navigation navbar navbar-expand-md navbar-dark ">
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarsExample04">
                           <ul class="navbar-nav mr-auto">
                              <li class="nav-item active">
                                 <a class="nav-link" href="index.php">Home</a>
                              </li>
                              <li class="nav-item">
                                 <a class="nav-link" href="about.html">About</a>
                              </li>
                              <li class="nav-item">
                                 <a class="nav-link">Contact</a>
                              </li>

                              <li class="nav-item">
                                 <a class="nav-link">Map</a>
                              </li>

                              <li class="nav-item d_none">
                                 <a class="nav-link" href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                              </li>
                              <li class="nav-item d_none">
                                 <a class="nav-link" href="login.html">Login</a>
                              </li>
                           </ul>
                        </div>
                     </nav>
                  </div>
               </div>
            </div>
         </div>
      </header>
      <!-- end header inner -->
      <!-- end header -->
      <!-- banner -->
      <section class="banner_main">
         
      </section>
      <!-- end banner -->
      <!-- about section -->
      <div class="about">
         <div class="container">
            <div class="row d_flex">
               <div class="col-md-5">
				  <?php $resp = getOfferDetails($_GET['id']);?>
                  <div class="titlepage">
                     <h2><?php echo $resp->name; ?></h2>
                     <time>11/06/2022 10:30 am</time>
                     <p>Description: <?php echo $resp->description; ?></p>
                     <p>
					 Location: 
					 <?php 
					 echo $resp->loc->street." ".$resp->loc->building." ";
					 if(isset($resp->loc->apartmentNumber) && $resp->loc->apartmentNumber != ""){
					    echo " / ".$resp->loc->apartmentNumber;
					 }
					 echo ", ".$resp->loc->city." ".$resp->loc->zip;
					 ?>
					 
					 </p>
                     <div>
						<?php foreach($resp->categories as $cat){ ?>
						<span class="badge rounded-pill bg-info text-dark"><?php echo $cat->name; ?></span>
						<?php } ?>
					 </div>
                  </div>
               </div>
               


               <div id="banner1" class="carousel slide" data-ride="carousel">
                  <ol class="carousel-indicators">
					 <?php 
						$i = 0;
						foreach($resp->imgs as $img){
							echo '<li data-target="#banner1" data-slide-to="'.$i++.'" '.($i===0 ? 'class="active"' : '').'></li>';
						}
					 ?>
                  </ol>
                  <div class="carousel-inner">
					 <?php 
						$i=0;
						foreach($resp->imgs as $img){?>
                     <div class="carousel-item <?php if($i++===0) echo "active";?>">
                        <div class="container">
                           <div class="carousel-caption">
                              <div class="row"><div class="text_img">
                                    <figure><img src="<?php echo $img->src; ?>" alt="<?php echo $img->alt; ?>"/></figure>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
						<?php } ?>
                     
                    
                     
                  <a class="carousel-control-prev" href="#banner1" role="button" data-slide="prev">
                  <i class="fa fa-chevron-left" aria-hidden="true"></i>
                  </a>
                  <a class="carousel-control-next" href="#banner1" role="button" data-slide="next">
                  <i class="fa fa-chevron-right" aria-hidden="true"></i>
                  </a>
               </div>








            </div>
         </div>
		 <div class="row d_flex mt-3">
			<div class="col-12">
				<center>
					<iframe 
					  width="100%" 
					  height="500" 
					  frameborder="0" 
					  scrolling="no" 
					  marginheight="0" 
					  marginwidth="0" 
					  src="https://maps.google.com/maps?q=<?php echo $resp->loc->geoY; ?>,<?php echo $resp->loc->geoX; ?>&hl=pl&z=14&amp;output=embed">
					</iframe>
				</center>
			</div>
		 </div>	
      </div>
      <!-- end about section -->
     

<!--  footer -->
<footer>
   <div class="footer">
      <div class="container">
         <div class="row">
            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-6">
               <img class="logo1" src="images/angel_logo_white.png" alt="#"/>
            </div>
            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-6">
               <h3>Team members</h3>
               <ul class="about_us">
                  <li> Jakub Skrzyński <br> Piotr Mastalerz <br> Ali Awada <br> Apoorva Singh </li>
               </ul>
            </div>
         </div>
      </div>
      <div class="copyright">
         <div class="container">
            <div class="row">
               <div class="col-md-12">
                  <p>Software Studio Angle Frontend Template Sample V1 Winter 2022</p>
               </div>
            </div>
         </div>
      </div>
   </div>
</footer>
<!-- end footer -->
      
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
   </body>
</html>

