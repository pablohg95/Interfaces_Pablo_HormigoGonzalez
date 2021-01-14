document.addEventListener('DOMContentLoaded',()=>{
    animacion();
});

function animacion(){
    const tiempo = document.querySelector('#segundos');
    const contador = document.querySelector('#sustituir');
    const iniciar = document.querySelector('#iniciar');
    const parar = document.querySelector('#parar');
    let aux;

    iniciar.addEventListener('click', ()=>{
        
        let t = tiempo.value;

        if(t>0 && isNaN){
            contador.style.color = 'black';
            aux = setInterval(()=>{
            contador.innerHTML = t;
            t--;

            if(t<0){
                clearInterval(aux);
                contador.style.color = 'red';
            }
        },1000);
        }
        else{
            alert('No es valido');
        }
    });

    parar.addEventListener('click', ()=>{
        clearInterval(aux);
    })
}