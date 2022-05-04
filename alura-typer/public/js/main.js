// $ é o mesmo que escreve jQuery
//$().text() permite acesso ao conteudo da frase, sem parametro ela pega valor, som parametro ela insere conteúdo
var tempoInicial = $("#tempo-digitacao").text();
var campo = $(".campo-digitacao");

//pode substituir a a linha 7 por $(function(){})
$(document).ready(function(){
    atualizaTamanhoFrase();
    incializaContadores();
    inicializaCronometro();
    inicializaMarcadores();
    $("#botao-reiniciar").click(reiniciaJogo);
})

function atualizaTamanhoFrase(){
    var frase = $(".frase").text();
//.split quebra a frase e transforma em array
    var numPalavras = frase.split(" ").length;
    var tamanhoFrase = $("#tamanho-frase");

    tamanhoFrase.text(numPalavras);
}

//.val acessa o valor de input/textarea, digitado pelo usuário
//evento de input conta os caracteres e palavras ao mesmo tempo

function incializaContadores(){
    campo.on("input",function(){
        var conteudo = campo.val();
    
        var qtdPalavras = conteudo.split(/\S+/).length-1;
        //Retira os espaço da String
        $("#contador-palavras").text(qtdPalavras);
    
        //Retira os espaço da String 
        var conteudoSemEspaco = conteudo.replace(/\s+/g,'');
    
        var qtdCaracteres = conteudoSemEspaco.length;
        $('#contador-caracteres').text(qtdCaracteres);
    
        // var qtdCaracteres = qtdPalavras.length;
        // $("#contador-caracteres").text(qtdCaracteres);
    });
}

function inicializaCronometro() {
    var tempoRestante = $("#tempo-digitacao").text();
    campo.on("focus", function(){
        var cronometroID = setInterval(function(){
            tempoRestante--;
            $("#tempo-digitacao").text(tempoRestante);
            if(tempoRestante < 1){
                //campo.attr("disabled",true);
                clearInterval(cronometroID);
                //campo.css("background-color","lightgray");
                //campo.addClass("campo-desativado"); pode ser substituido pelo toggleClass que insere ou retira classe
                // campo.toggleClass("campo-desativado");

                // inserePlacar();

                finalizaJogo();
            }
            
        },1000);
    });
}

function finalizaJogo() {
    campo.attr("disabled", true);
    campo.toggleClass("campo-desativado");
    inserePlacar();
}

function reiniciaJogo(){
    //$("#botao-reiniciar").on("click",function(){})
    campo.attr("disabled", false);
    campo.val("");
    $("#contador-palavras").text("0");
    $("#contador-caracteres").text("0");
    $("#tempo-digitacao").text(tempoInicial);
    inicializaCronometro();
    //campo.removeClass("campo-desativado");
    campo.toggleClass("campo-desativado");
//Vamos inicializar o jogo sempre sem marcação da borda
    campo.removeClass("borda-vermelha");
    campo.removeClass("borda-verde");

}

function inicializaMarcadores() {

    var frase = $(".frase").text();
    campo.on("input", function() {
        //aqui vem mais
        var digitado = campo.val();
//as linhas 86 e 87 poderiam ser substituídas por if( frase.startsWith(digitado))
        var comparavel = frase.substr(0 , digitado.length);
        if(digitado == comparavel) {
            campo.addClass("borda-verde");
            campo.removeClass("borda-vermelha");
        } else {
            campo.addClass("borda-vermelha");
            campo.removeClass("borda-verde");
        }
    });
}

// function inserePlacar() {
//     var placar = $(".placar");
//     var corpoTabela = placar.find("tbody");
// }

