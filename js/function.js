function siempreTrue (){
    return true
}
console.log(siempreTrue)


async function damePromesa(){
return setTimeout(()=>console.log("soy promesa"),5000);
}

function* idsPares() {
    let id = 0
    while(true) {
        yield id += 2
    }
}