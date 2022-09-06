const nombre="aaron";
const apellido="francolino";

const estudiante= nombre + apellido;
const estudianteMayus=estudiante.toUpperCase;
const estudianteMinus=estudiante.toLowerCase;
const numeroLetras=estudiante.length;

const primeraLetra=nombre.substring(0,1);

const finalApellido = apellido.substring(apellido.length - 1, apellido.length);
const estudianteSinEspacios = estudiante.replace("", "");

const nombreEstudiante= estudiante.includes (nombre)
console.log(nombreEstudiante);