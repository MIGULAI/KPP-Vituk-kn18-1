function first(){
    let firstText = document.getElementById('firstText').value;
    let secondText = document.getElementById('secondText').value;
    let elem = document.createElement('tr');
    let contElement = document.createElement('td');
    let contElement2 = document.createElement('td');

    elem.appendChild(contElement);
    elem.appendChild(contElement2);
    document.getElementById('table').appendChild(elem);
    contElement.innerText = firstText;
    contElement2.innerText = secondText;
}

function second(){
    let mTaible = document.getElementById('table');
    let x = mTaible.rows.length;
    if(x != 1){
        x-=1
        mTaible.deleteRow(x);
    }
    console.log(mTaible.rows.length);
}