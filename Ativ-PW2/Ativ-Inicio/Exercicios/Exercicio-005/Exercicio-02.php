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

$Num = $_POST['NUM'];
if($Num >= 0){
    echo '<font color="Blue">'."  Número positivo ". $Num;
}
elseif($Num < 0){
    echo '<font color="Red">'."  Número Negativo ". $Num;
}
?>
</body>
</html>