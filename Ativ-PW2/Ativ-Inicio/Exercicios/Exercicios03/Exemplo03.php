<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Calcular soma mostrar3.php</title>
</head>
<body>
<header>
    <h1>Resultado do processamento</h1>
    </header>
<?php
  $A = $_POST['txta'];
    $B = $_POST['txtb'];
      $soma= $A + $B;
      echo "A soma dos valores é ".$soma .'<br>';
        if ($soma>10) {
                echo  "Soma maior que dez";}
                  elseif ($soma<5) { 
                       echo  "Soma menor que cinco";} 
                        else {    echo  "Soma entre cinco e dez";}?>
</body>
</html>