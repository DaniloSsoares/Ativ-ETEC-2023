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
$N1 = $_POST['Num1'];
$N2 = $_POST['Num2'];
$Op = $_POST['OPera'];


if($Op == '+'){
 $RES= $N1+$N2;
 echo "o valor da soma é:" .$RES;
}
   elseif($Op == '-'){
    $RES= $N1-$N2;
    echo "o valor da Subtração é: " .$RES;
   }
   elseif($Op == '/'){
    $RES= $N1/$N2;
    echo "o valor da multiplicação é: " .$RES;
   }
      elseif($Op == '.'){
    $RES= $N1*$N2;
    echo "o valor da Divisão é: " .$RES;
   }
   else{
    echo "O operador não foi encontrado ";
   }
   
    ?>
</body>
</html>