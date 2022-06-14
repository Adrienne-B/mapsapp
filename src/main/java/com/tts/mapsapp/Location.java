package com.tts.mapsapp;

import lombok.Data;

@Data
public class Location {
	//These two fields are not found in the JSON and will not get 
	//Unpacked from JSON but are our private fields to store city and state
	//Because the location class does double duty
	//ass both a class used for JSON deserializaton (unpacking) and 
	//as a utility class for us to store locations in.
	private String city;
	private String state;
	
	private String lat;
	private String lng;

}
