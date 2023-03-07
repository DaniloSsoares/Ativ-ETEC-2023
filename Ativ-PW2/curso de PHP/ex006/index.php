<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
    <h1>Resultado do processamento</h1>
    </header>
<main>
    <?php
$nome = $_GET["nome"]??"sem nome"; //?? é usado para escrever quando gerar erro alguma frase no lugar 
$sobrenome = $_GET["sobrenome"]??"Desconhecido";//recebendo as variaveis digitadas no html

echo "<p> É um prazer te conhecer, $nome $sobrenome ! Este é meu site!"
?>
<p><a href="javascript:history.gol(-1)">Voltar para á página anterior</a></p> 

</main>
</body>
</html>