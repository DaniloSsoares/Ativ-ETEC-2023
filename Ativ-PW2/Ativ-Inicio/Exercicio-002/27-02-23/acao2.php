<!DOCTYPE html>
<html >
<head>  
    <title>Documento acao.PHP</title>
</head>
<body>
    <?php
    $Vnome=$_POST["nome"];// atribuindo o conteúdo da caixa de texto "nome" a variavel "$Vnome"
    $Vidade=$POST["idade"]; // atribuindo o conteúdo da caixa de texto "idade" a variavel "$Vidade

    echo "Oi !! " . $Vnome . "." . "<br>" . "Você tem " . $Vidade . "anos !!";

 ?>
</body>
</html>