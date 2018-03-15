// check if username available
function checkUserName(str) {
    var xhttp;
    if (str == "") {
        document.getElementById("txtHint").innerHTML = "";
        return;
    }
    xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (xhttp.readyState == 4 && xhttp.status == 200) {
            document.getElementById("txtHint").innerHTML = xhttp.responseText;
        }
    };
    xhttp.open("GET", "./checkUserName?q="+str, true);
    xhttp.send();
}

function blurName() {
    if(document.getElementById("txtHint").innerHTML == "Username available") {
        document.getElementById("txtHint").innerHTML = "";
    }
}