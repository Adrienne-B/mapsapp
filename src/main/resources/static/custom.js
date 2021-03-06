//We are going to define oan initialization to be called when the API is initialized

let  map;
let contentString = "<h2>" + city + "," + state + "</h2>";

function initMap() {
		let image = {url: "/chicken-icon.png", scaledSize: new google.maps.Size(50,50)};
		map = new google.maps.Map(document.getElementById('map'), {
		center: {lat: 33.1581, lng: -117.3506},
		zoom:10,
		scrollwheel: false
	});
	
	let marker = new google.maps.Marker({
		position: coords,
		map: map, 
		icon: image,
		animation: google.maps.Animation.BOUNCE
	});
	
	let infoWindow = new google.maps.InfoWindow({
		content: contentString
	})
	
	google.maps.event.addListener(marker, "click", function() {
		infoWindow.open(map, marker);
	});
}
		
