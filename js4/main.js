function Add(){
    let newDeal = document.getElementById("add").value;
    let table = document.getElementById("table");
    let newStrin = document.createElement("div");
    let newSubnode1 = document.createElement("div");
    let newSubnode2 = document.createElement("input");

    newSubnode2.type = "checkbox";
    newSubnode2.addEventListener("click" , function(){
        newSubnode2.parentNode.parentNode.removeChild(newSubnode2.parentNode);
        deleteFromData(newDeal);
    })

    newStrin.id = "strin";
    newSubnode1.id = "subnode";
    newSubnode2.id = "subnode";
    
    newSubnode1.textContent = newDeal;
    
    table.appendChild(newStrin);
    newStrin.appendChild(newSubnode1);
    newStrin.appendChild(newSubnode2);

    saveToStorage(newDeal);
}

function AddAll(a){
    let table = document.getElementById("table");
    let newStrin = document.createElement("div");
    let newSubnode1 = document.createElement("div");
    let newSubnode2 = document.createElement("input");

    newSubnode2.type = "checkbox";
    newSubnode2.addEventListener("click" , function(){
        newSubnode2.parentNode.parentNode.removeChild(newSubnode2.parentNode);
        deleteFromData(a);
    })

    newStrin.id = "strin";
    newSubnode1.id = "subnode";
    newSubnode2.id = "subnode";
    
    newSubnode1.textContent = a;
    
    table.appendChild(newStrin);
    newStrin.appendChild(newSubnode1);
    newStrin.appendChild(newSubnode2);
}

function saveToStorage(newDeal){
    let element = [];
    element = Array.from(JSON.parse(localStorage.getItem("one")));
    element.push(newDeal);
    var serial = JSON.stringify(element);
    localStorage.setItem("one",serial);
}

function deleteFromData(a){
    let element = Array.from(JSON.parse(localStorage.getItem("one")));
    let index = element.indexOf(a);
    element.splice(index , 1);
    var serial = JSON.stringify(element);
    localStorage.setItem("one",serial);
}


function init(){
    let element = [];
    if(localStorage.getItem("one") !== null){
        element = Array.from(JSON.parse(localStorage.getItem("one")));
        for(let i = 0 ; i < element.length ; i++){
            AddAll(element[i]);
        }
    }else{
        let newItem = JSON.stringify(["доьавь сюда что либо!!!!"]);
        localStorage.setItem("one",newItem);
        init();
    }
    
}
