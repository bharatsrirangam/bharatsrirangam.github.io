var courseTree = document.getElementById("courseTreeInfo");
var medicheck = document.getElementById("medicheckInfo");
var projectEuler = document.getElementById("projectEulerInfo");
var boRats = document.getElementById("boRatsIncInfo");
var civilization = document.getElementById("civilizationInfo");
var neuralNetwork = document.getElementById("neuralNetworkInfo");
var einsteins = document.getElementById("einsteinsInfo");
var locationScores = document.getElementById("locationScoresInfo")

var array = [courseTree, medicheck, projectEuler, boRats, civilization, neuralNetwork, einsteins, locationScores];

//As More project descriptions are added to the html page, add them here above in the list and in the array. Also add to the html pages menu section at the top

for (var i = array.length - 1; i >= 0; i--) {
	array[i].addEventListener('click', toReplace);
}

function toReplace() {
	var allBoxes = document.getElementsByClassName("boxes");
	console.log(allBoxes);
	for (var i = allBoxes.length - 1; i >= 0; i--) {
		if (!allBoxes[i].classList.contains("hiding")) {
			allBoxes[i].classList.add("hiding");
		}
	}
	var onClick = this.getAttribute("id") + "Box";

	document.getElementById(onClick).classList.remove("hiding");
}

