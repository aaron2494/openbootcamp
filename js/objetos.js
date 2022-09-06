const miPersona={
    nombre:"aaron",
    apellido:"francolino",
    edad:28,
    altura:1.81,
    eresDev:true
}
const miEdad= miPersona.edad;
console.log(miEdad);

const datosPersonales=[miPersona.nombre,miPersona.apellido,miPersona.edad,miPersona.altura,miPersona.eresDev];
 console.log(datosPersonales)
 
    amigos={
       nombre:["jorge","jose"],
        apellido:["perez","embaouco"],
        edad:[26,27]
    }
    console.log(amigos)
     const edadMenor =amigos.edad.sort((a,b)=>a.edad - b.edad)
    console.log(edadMenor)