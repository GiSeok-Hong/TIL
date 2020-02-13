const API_KEY = ""
const COORDS = 'coords';


function saveCoords(coordsObj){
  localStorage.setItem(COORDS, JSON.stringify(coordsObj))
}

function handleGeoSucces(position){
  const latitude = position.coords.latitude; // 위도
  const longitude = position.coords.longitude; // 경도
  const coordsObj = {
    latitude: latitude,
    longitude: longitude
  }
  saveCoords(coordsObj);
}

function handleGeoError(){
  console.log("Can't access geo location")
}

function askForCoords(){
  navigator.geolocation.getCurrentPosition(handleGeoSucces, handleGeoError);
}

// coords 좌표
function loadCoords(){
  const loadCoords = localStorage.getItem(COORDS);
  if(loadCoords === null){
    askForCoords();
  } else {

  }
}

function init(){
  loadCoords();
}

init();