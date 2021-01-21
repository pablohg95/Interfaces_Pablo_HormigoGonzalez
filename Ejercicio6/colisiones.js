document.addEventListener('DOMContentLoaded', ()=>{
    arrancar();
});

function arrancar(){
    
    document.addEventListener('click',()=>{
        localizar(cuadroPeque,cuadroGrande);
    });

    //Iniciamos todos los elementos de la pagina
    //botones
    const izq = document.querySelector('#left');
    const dch = document.querySelector('#right');
    const arr = document.querySelector('#top');
    const abj = document.querySelector('#bottom');

    //elementos
    const cuadroPeque = document.querySelector('.block');
    const cuadroGrande = document.querySelector('.cuadrado');

    //desplazamiento deseado
    const despDeseado = document.querySelector('#mov');
    let desplazamiento = 0;

    //texto que desaparecera
    const texto = document.querySelector('#texto');

    //desplazamiento hacia la derecha
    let despDch = 0;

    dch.addEventListener('click',()=>{
        derecha()
    });

    function derecha(){
        desplazamiento = parseInt(despDeseado.value);
        despDch = despDch + desplazamiento;
        cuadroPeque.style.left = despDch + 'px';
    }

    //desplazamiento hacia la izquierda
    izq.addEventListener('click',()=>{
        izquierda()
    });

    function izquierda(){
        desplazamiento = parseInt(despDeseado.value);
        despDch = despDch - desplazamiento;
        cuadroPeque.style.left = despDch + 'px';
    }

    //desplazamiento hacia abajo
    let despAba = 0;

    abj.addEventListener('click',()=>{
        abajo();
    });

    function abajo(){
        desplazamiento = parseInt(despDeseado.value);
        despAba = despAba + desplazamiento;
        cuadroPeque.style.top = despAba + 'px';
    }

    //desplazamiento hacia arriba
    arr.addEventListener('click',()=>{
        arriba();
    });

    function arriba(){
        desplazamiento = parseInt(despDeseado.value);
        despAba = despAba - desplazamiento;
        cuadroPeque.style.top = despAba + 'px';
    }
}

function localizar(cuadroPeque, cuadroGrande){
    let grandeIzq = cuadroGrande.getBoundingClientRect().left;
    let grandeDch = cuadroGrande.getBoundingClientRect().right;
    let grandeArr = cuadroGrande.getBoundingClientRect().top;
    let grandeAba = cuadroGrande.getBoundingClientRect().bottom;

    let pequeIzq = cuadroPeque.getBoundingClientRect().left;
    let pequeDch = cuadroPeque.getBoundingClientRect().right;
    let pequeArr = cuadroPeque.getBoundingClientRect().top;
    let pequeAba = cuadroPeque.getBoundingClientRect().bottom;

    if(grandeIzq < pequeIzq && grandeDch > pequeDch && grandeArr < pequeArr && grandeAba > pequeAba){
        cuadroPeque.style.backgroundColor = 'red';
        texto.style.display = 'none';
    }
}

