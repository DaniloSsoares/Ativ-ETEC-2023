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

$Nm = $_POST['Nome'];
$Ps = $_POST['Peso'];
$Sx = $_POST['sexo'];
$Alt = $_POST['Altura'];

if( $Sx == 'M'){
$PesoId = pow($Alt, 2) *23;
}
elseif($Sx == 'F'){
    $PesoId = pow($Alt, 2) *22;
}
echo "<strong>Peso ideal para $Nm:</strong> $PesoId .kg<br>";

if($Ps > $PesoId){
    echo $Nm ." Você Está ".'<font color="Red">'." Acima do peso Ideal </font>";
}
elseif($Ps < $PesoId){
    echo $Nm ." Você Está". '<font color=" orange">'." Abaixo do peso Ideal </font>";
}
else{
    echo $Nm ." Você Está". '<span style="color: blue;">'." Dentro do peso Ideal </span>";
}
?>
</body>
</html>