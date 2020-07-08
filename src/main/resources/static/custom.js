var map;

function initMap(){
  map = new google.maps.Map(document.getElementById('map'), 
  {
    center: coords,
    zoom: 14,
    scrollwheel: false
  });
  
  var marker = new google.maps.Marker({
    position: coords,
    map: map
  });
}