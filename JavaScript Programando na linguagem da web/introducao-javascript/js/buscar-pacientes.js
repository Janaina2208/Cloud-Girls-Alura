//selecionar o botao e add um evento de click
var botaoAdicionar = document.querySelector("#buscar-paciente");
//requisição assincrona AJAX pq não para o código pra esperar resposta do http
botaoAdicionar.addEventListener("click", function(){
    //XMLHttpRequest responsável por fazer requisições
    var xhr = new XMLHttpRequest();

    //qual tipo de requisição e pra onde
    xhr.open("GET", "https://api-pacientes.herokuapp.com/pacientes");
    //trazendo dados de outro site pro js
    xhr.addEventListener("load", function(){
        var erroAjax = document.querySelector("#erro-ajax");
        if(xhr.status==200){
            erroAjax.classList.add("invisivel");
            var resposta = xhr.responseText;
        //transformar o json da api em objeto do js
        //.parser parsear vai ver um array e devolve nesse formato
            var pacientes = JSON.parse(resposta);

            pacientes.forEach(function(paciente){
            adicionaPacienteNaTabela(paciente);
            });
        }else{
            erroAjax.classList.remove("invisivel");
        }
        

    });
//função q envia a requisição
    xhr.send();
})