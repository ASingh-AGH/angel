<?php

define("BASE_URL","http://localhost:8080");

function headersToArray( $str )
{
    $headers = array();
    $headersTmpArray = explode( "\r\n" , $str );
    for ( $i = 0 ; $i < count( $headersTmpArray ) ; ++$i )
    {
        // we dont care about the two \r\n lines at the end of the headers
        if ( strlen( $headersTmpArray[$i] ) > 0 )
        {
            // the headers start with HTTP status codes, which do not contain a colon so we can filter them out too
            if ( strpos( $headersTmpArray[$i] , ":" ) )
            {
                $headerName = substr( $headersTmpArray[$i] , 0 , strpos( $headersTmpArray[$i] , ":" ) );
                $headerValue = substr( $headersTmpArray[$i] , strpos( $headersTmpArray[$i] , ":" )+1 );
                $headers[$headerName] = $headerValue;
            }
        }
    }
    return $headers;
}


function getPlaceDetails($id){
	$curl = curl_init();

	curl_setopt_array($curl, array(
	  CURLOPT_URL => BASE_URL.'/api/places/'.$id,
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
	
	return json_decode($response);
}

function getOfferDetails($id){
	$curl = curl_init();

	curl_setopt_array($curl, array(
	  CURLOPT_URL => BASE_URL.'/api/offer/'.$id,
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
	
	return json_decode($response);
}

function getPlaces($page = 0, $perPage = 10){
	$curl = curl_init();

	if(isset($page))
	curl_setopt_array($curl, array(
	  CURLOPT_URL => BASE_URL.'/api/places?page='.$page.'&itemsPerPage='.$perPage,
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
	return json_decode($response);
}


function getOffers($page = 0, $perPage = 10){
	$curl = curl_init();

	if(isset($page))
	curl_setopt_array($curl, array(
	  CURLOPT_URL => BASE_URL.'/api/offer?page='.$page.'&itemsPerPage='.$perPage,
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
	return json_decode($response);
}



function auth($user="",$pass=""){
	session_start();
	if(isset($_SESSION['token'])){
		return true;
	}
	else{
		if($user != "" && $pass != ""){
			$curl = curl_init();

			curl_setopt_array($curl, array(
			  CURLOPT_URL => 'http://localhost:8080/login',
			  CURLOPT_RETURNTRANSFER => true,
			  CURLOPT_ENCODING => '',
			  CURLOPT_MAXREDIRS => 10,
			  CURLOPT_TIMEOUT => 0,
			  CURLOPT_FOLLOWLOCATION => true,
			  CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
			  CURLOPT_CUSTOMREQUEST => 'POST',
			  CURLOPT_POSTFIELDS =>'{
				"username":"user",
				"password":"aaa"
			}',
			  CURLOPT_HTTPHEADER => array(
				'Content-Type: application/json'
			  ),
			));

			$response = curl_exec($curl);
			$headerSize = curl_getinfo( $curl , CURLINFO_HEADER_SIZE );
			$headerStr = substr( $response , 0 , $headerSize );
			$bodyStr = substr( $response , $headerSize );
			var_dump($headerStr);

			// convert headers to array
			$headers = headersToArray( $headerStr );
			$httpcode = curl_getinfo($curl, CURLINFO_HTTP_CODE);
			curl_close($curl);
			if($httpcode == 200){
				$_SESSION['token'] = $headers['Authorization'];
				return true;
			}
		}
	}
	
	return false;
}


function register($user, $pass, $email, $fullname){
	
	$curl = curl_init();

	curl_setopt_array($curl, array(
	  CURLOPT_URL => 'http://localhost:8080/api/register',
	  CURLOPT_RETURNTRANSFER => true,
	  CURLOPT_ENCODING => '',
	  CURLOPT_MAXREDIRS => 10,
	  CURLOPT_TIMEOUT => 0,
	  CURLOPT_FOLLOWLOCATION => true,
	  CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
	  CURLOPT_CUSTOMREQUEST => 'POST',
	  CURLOPT_POSTFIELDS =>'{
		"username":"'.$user.'",
		"password":"'.$pass.'",
		"fullname":"'.$fullname.'",
		"email":"'.$email.'"
	}',
	  CURLOPT_HTTPHEADER => array(
		'Content-Type: application/json'
	  ),
	));

	$response = curl_exec($curl);

	$httpcode = curl_getinfo($curl, CURLINFO_HTTP_CODE);
	curl_close($curl);
	if($httpcode == 200){
		return true;
	}
	return false;
}



function createHelpOffer(){
	
	
	
}