function AddTable(){
    let sTable = document.getElementById("mainTable");
    var length;
    var price;

    sTable.style.visibility = "visible";

    var rawFile = new XMLHttpRequest();
    rawFile.overrideMimeType("application/json");
    rawFile.open("GET", "price.json", true);
    rawFile.onreadystatechange = function() {
        if (rawFile.readyState === 4 && rawFile.status == "200") {
            price = JSON.parse(rawFile.responseText);
            let i = 0;
            
            while(i < price.length){
                let elem = document.createElement('tr');
                let contElement = document.createElement('td');
                let contElement2 = document.createElement('td');

                elem.appendChild(contElement);
                elem.appendChild(contElement2);
                document.getElementById('isTable').appendChild(elem);
                contElement.innerText = price[i].name;
                contElement2.innerText = price[i].price;
                i++;
            }
            console.log(price);
        }
    }
    rawFile.send(null);

    readTextFile("price.json", function(text){
        price = JSON.parse(text);
        lenght = price.length;
        });
    console.log(price);
    for(let i = 0; i < length; i++){
        let row = sTable.insertRow(i+=1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        cell1.innerHTML = price[i].name;
        cell2.innerHTML = price[i].price;
    }
}

function readTextFile(file, callback) {
    var rawFile = new XMLHttpRequest();
    rawFile.overrideMimeType("application/json");
    rawFile.open("GET", file, true);
    rawFile.onreadystatechange = function() {
        if (rawFile.readyState === 4 && rawFile.status == "200") {
            callback(rawFile.responseText);
        }
    }
    rawFile.send(null);
}