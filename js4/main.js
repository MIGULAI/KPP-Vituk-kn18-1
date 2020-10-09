let i = 0;

function Add(){
    let newDeal = document.getElementById("add").value;
    let table = document.getElementById("table");
    let newStrin = document.createElement("div");
    let newSubnode1 = document.createElement("div");
    let newSubnode2 = document.createElement("div");

    newStrin.id = "strin";
    newSubnode1.id = "subnode";
    newSubnode2.id = "subnode";
    
    newSubnode1.textContent = newDeal;
    localStorage.setItem(i.toString() , newDeal);
    
    table.appendChild(newStrin);
    newStrin.appendChild(newSubnode1);
    newStrin.appendChild(newSubnode2);
}

function AddAll(a){
    let table = document.getElementById("table");
    let newStrin = document.createElement("div");
    let newSubnode1 = document.createElement("div");
    let newSubnode2 = document.createElement("div");

    newStrin.id = "strin";
    newSubnode1.id = "subnode";
    newSubnode2.id = "subnode";
    
    newSubnode1.textContent = a;
    
    table.appendChild(newStrin);
    newStrin.appendChild(newSubnode1);
    newStrin.appendChild(newSubnode2);
}

function init(){
    let status = true;
    while(status){
        let a = localStorage.getItem(i.toString())
        i++;
        if(a === null){
            status = false;
            break;
        }
        else{
            AddAll(a);
        }
    }
}
