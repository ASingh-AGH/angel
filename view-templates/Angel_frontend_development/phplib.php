<?php

define("BASE_URL","http://localhost:8080");

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