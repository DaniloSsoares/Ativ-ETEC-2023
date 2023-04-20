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
$VlA = $_POST['ValorA'];
$VlB = $_POST['ValorB'];
$Cod = $_POST['Codigo'];
  switch ( $Cod ){  
    case 1:  
$Res = $VlA+$VlB;
        echo "Sua soma é: ". $Res;
        break;
           case 2:
            $Res = $VlA-$VlB;
            echo "Sua Subtração é: ". $Res;
        break;  
         case 3:
          $Res = $VlA/$VlB;
          echo "Sua Divisão é: ". $Res;
           break;  
           case 4:
            $Res = $VlA*$VlB;
            echo "Sua Multiplicação é: ". $Res;
              break;
                  
                         default:
                         echo "Código inválido";
                         break;
                       }   
                              ?>
</body>
</html>