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
    $num1 = $_POST['Num1'];
    $num2 = $_POST['Num2'];
    $num3 = $_POST['Num3'];

    if($num1 > $num2 && $num1> $num3){ 
        echo " O Número 'A' É o maior";

    } elseif($num2 > $num1 && $num2 >  $num3){
        echo " O Número 'B' É o maior";
    
} else 
if($num3 > $num2 && $num3 >  $num1){
    echo " O Número 'C' É o maior";
}
 else 
if($num1 == $num2 && $num1 ==  $num3){
    echo " Todos Os Números São Iguais";
}
else 
if($num1 == $num2 && $num1 >  $num3){
    echo " Os Números A e B são maiores que o valor C";
}
else 
if($num3 == $num2 && $num3 >  $num1){
    echo " Os Números B e C são maiores que o valor A";
}
else 
if($num1 == $num3 && $num1 >  $num2){
    echo " Os Números A e C são maiores que o valor B";
}
    ?>
</body>
</html>