function oneFunc(){
    let one = document.getElementById("myVar").value;
    let two = document.getElementById("myVar1").value;
    let tree = document.getElementById("myVar2").value;
    let diff;
    if(one-two === 2){
        diff = one - two - tree;
        document.getElementById("out").innerText = "hi";
        alert(one + '-' + two + '-' + tree + '=' + diff);
    }
    else{
        alert("error");
    }
}