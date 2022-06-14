# mapsapp
Open map API, type in the city and state and the location will appear on the screen...black png hen will jump up and down with special animation effect.

## Summary
Google Maps is simply a combination of HTML, CSS and Javascript working together. The map tiles are images that are loaded into the background.

### Software used:
Eclipse(java) Spring Boot and Google API

### What I learn:
I learned that you can access the current location from anywhere using API.

#### Challenges to improve on:
1. Since I am still learning about java, it is all about gaining experience through time and more practice.

#### Random Unexpected Challenges:
1. Map wouldnt not display in the browser

2. I deleted the main page which is suppose to display everything.

#### Solutions/solving the issue:
1. I didnt have "public String getMapForLocation(Location location, Model model) {
		mapService.addCoordinates(location);" in lines 24 -26 in MapController.
    
2. I had to name the picture so it was showed on screen
    
3. Application.properties didnt have the api_key information

4.To find a page that has been deleted, right click on the project and go to 'Restore from local host'. There should be timelines of edit versions of a certain
class, interface, package, etc that were deleted.

#### Weakness so far:
1.	I am still learning Java (beginner).
