//lembrar de vincular novos arquivos ao script do html
var paciente = document.querySelectorAll(".pacientes");

var tabela = document.querySelector("table");
//target alvo do evento
tabela.addEventListener("dblclick",function(event){
    // var alvoEvento = event.target;
    // var paiDoAlvo = alvoEvento.parentNode; //TR = PACIENTE = REMOVER
    // paiDoAlvo.remove();
//primeiro esmaece, tipo animação no fadeOut
    event.target.parentNode.classList.add("fadeOut");
//setTimout aguarda o tempo indicado e depois executa
    setTimeout(function(){
        //resumindo o código comentadoacima:
        event.target.parentNode.remove();
    },500);
})

// pacientes.forEach(function(paciente){
//     paciente.addEventListener("dblclick", function(){
//         //this fala sobre quem é o dono do evento
//         console.log("dbl click");
//         this.remove();
//     })
// })