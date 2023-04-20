<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
<header>
    <h1>Resultado do processamento</h1>
    </header>
<main>

<?php 
    $Comp = $_POST['Compra'];
    if($Comp >= 100){
        echo "Compra maior ou Igual a Cem  R$". $Comp;
    }elseif($Comp < 100){
        echo "  Valor Abaixo de Cem  R$". $Comp;
    }
    ?>
</body>
</html>