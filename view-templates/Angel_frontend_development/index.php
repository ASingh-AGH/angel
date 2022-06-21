

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
   <!-- body -->
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
                                 <a class="nav-link" href="index.html">Home</a>
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
                                 <a class="nav-link" href="#">Login</a>
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
     
      <!-- categories -->
      <div  class="category">
         <div class="container">
            <div class="row">
               <div class="col-md-12">
                  <div class="titlepage">
                     <h2>Browse Categories</h2>
                  </div>
               </div>
            </div>
            <div class="row">



               
               <div class="col-md-12">
                  <div class="our_category">

                     <div class="row">

                        <div class="col-12">
                           
                        </div>
                        
                        
                     </div>

                     <div class="titlepage">
                        <h3>Help Places</h3>
                     </div>
					
					<?php 
						include_once("phplib.php"); 
						$resp = getPlaces();
						foreach($resp as $el){
											?>
							<div class="row">
						
								<div class="col-12 m-4 border-bottom pb-3">
								   <div class="">
									  <h3><?php echo $el->name; ?></h3>
									  <p><?php echo $el->description; ?></p>
									  <a href="place-details.php?id=<?php echo $el->id;?>" class="btn btn-primary">See details</a>
								   </div>
								</div>

							</div>

                        
						<?php }?>
					
                     
                     <div class="titlepage">
                        <h3>Help Offers</h3>
                     </div>

					
                     <div class="row">
						<?php 
												$curl = curl_init();

						curl_setopt_array($curl, array(
						  CURLOPT_URL => 'http://localhost:8080/api/places',
						  CURLOPT_RETURNTRANSFER => true,
						  CURLOPT_ENCODING => '',
						  CURLOPT_MAXREDIRS => 10,
						  CURLOPT_TIMEOUT => 0,
						  CURLOPT_FOLLOWLOCATION => true,
						  CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
						  CURLOPT_CUSTOMREQUEST => 'GET',
						));

						$response = curl_exec($curl);

						curl_close($curl);
						$resp = json_decode($response);
						foreach($resp as $el){
											?>
                        <div class="col-md-4 margin_bottom1">
                           <div class="">
                              <h3><?php echo $el->name; ?></h3>
							  <p><?php echo $el->description; ?></p>
                              <a href="details-offers.php?id=<?php echo $el->id;?>" class="btn btn-primary">Primary1</a>
                           </div>
                        </div>
						<?php }?>
                        

                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- end categories -->


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